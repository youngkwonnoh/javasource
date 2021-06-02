/**
 * 영화진흥위원회 API : xml
 */
function init() {
	// 오늘 날짜
	var newDate = new Date();
	
	// 어제 날짜 추출
	var year = newDate.getFullYear();
	var month = newDate.getMonth()+1; // 월 0부터 시작해서 +1 해줌
	var day = newDate.getDate()-1;
	
	$("#txtYear").val(year);
	
	if(month < 10) {
		month = "0" + month;
	}
	if(day < 10) {
		day = "0" + day;
	}
	$("#selMon").val(month);
	$("#selDay").val(day);
}
function info(movieCd) {
	// 영화 상세 정보 요청
	let url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.xml?key=f5eef3421c602c6cb7ea224104795888&movieCd=";
	url += movieCd;
	
	let str="";
	
	$.get({
		url : url,
		success : function(data) {
			console.log(data);
			
			// 영화 제목 - 한글
			var movieNm = $(data).find("movieNm").text();
			// 영화 제목 - 영어
			var movieNmEn = $(data).find("movieNmEn").text();
			// 상영시간
			var showTm = $(data).find("showTm").text();
			// 감독명
			var directorNm = $(data).find("director").find("peopleNm").text();
			// 출연배우
			var actors = "";
			var length = $(data).find('actor').find('peopleNm').length;
			
			$(data).find("actor").each(function(i, element) {
				if(i == length-1) {
				actors += $(this).find("peopleNm").text();
				} else {
				actors += $(this).find("peopleNm").text() + ", ";
				}
			})
			
			
			str += "<li>영화제목 : " + movieNm + "</li>";
			str += "<li>영화제목(영어) : " + movieNmEn + "</li>";
			str += "<li>상영시간 : " + showTm + "분</li>";
			str += "<li>감독 : " + directorNm + "</li>";
			str += "<li>출연배우 : " + actors + "</li>";
			
			$(".box3").html(str);
		}
	})
}

$(function() {
	init();

	$("#btn1").click(function() {
		// 데이터 가져오기
		
		let url = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=";
		
		// 사용자가 선택한 날짜 가져와서 url 연결
		url += $("#txtYear").val() + $("#selMon").val() + $("#selDay").val();
		
		$.ajax({
			url : url,
			success : function(data) {
				console.log(data);
				
				let str = "";
				
				$(data).find("dailyBoxOffice").each(function(i, element) {
					// 순위
					str += $(this).find("rank").text() + "위";
					// 증감
					var rankInten = $(this).find("rankInten").text();
					
					if(rankInten > 0) { // (▲1)
						str += "( ▲ ";
					} else if(rankInten < 0) {
						str += "( ▼ ";
					} else {
						str += "( ";
					}
					str += rankInten + " )";

					// 영화코드
					var movieCd = $(this).find("movieCd").text();
						
					// 영화명
					var movieNm = $(this).find("movieNm").text() + "<br>";
					
					str += "<a href='#' onclick='javascript:info(" +  movieCd + ")'>" + movieNm + "</a>";
					
				})
				$("#msg").html(str);
			}
		})
	})
})