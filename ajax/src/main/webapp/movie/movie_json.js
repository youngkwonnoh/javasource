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
	let url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=f5eef3421c602c6cb7ea224104795888&movieCd=";
	url += movieCd;
	
	let str="";
	
	$.get({
		url : url,
		success : function(data) {
			console.log(data);
			
			var movieInfo = data.movieInfoResult.movieInfo;
			
			
			// 영화 제목 - 한글
			var movieNm = movieInfo.movieNm;
			// 영화 제목 - 영어
			var movieNmEn = movieInfo.movieNmEn;
			// 상영시간
			var showTm = movieInfo.showTm;
			// 감독명
			var directorNm = "";
			if(movieInfo.directors.length > 0) {
				movieInfo.directors[0].peopleNm;
			}
			// 출연배우
			var actors = "";
			var length = movieInfo.actors.length;
			
			$(movieInfo.actors).each(function(idx, item) {
				if(idx == length-1) {
				actors += item.peopleNm;
				} else {
				actors += item.peopleNm + ", ";
				}
			})
			
			str += "<ul>"
			str += "<li>영화제목 : " + movieNm + "</li>";
			str += "<li>영화제목(영어) : " + movieNmEn + "</li>";
			str += "<li>상영시간 : " + showTm + "분</li>";
			str += "<li>감독 : " + directorNm + "</li>";
			str += "<li>출연배우 : " + actors + "</li>";
			str += "</ul>"
			
			$(".box3").html(str);
		}
	})
}

$(function() {
	init();

	$("#btn1").click(function() {
		// 데이터 가져오기
		
		let url = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=";
		
		// 사용자가 선택한 날짜 가져와서 url 연결
		url += $("#txtYear").val() + $("#selMon").val() + $("#selDay").val();
		
		$.ajax({
			url : url,
			success : function(data) {
				console.log(data);
				
				let str = "";
				
				$(data.boxOfficeResult.dailyBoxOfficeList).each(function(idx, item) {
					// 순위
					str += item.rank + "위";
					// 증감
					var rankInten = item.rankInten;
					
					if(rankInten > 0) { // (▲1)
						str += "( ▲ ";
					} else if(rankInten < 0) {
						str += "( ▼ ";
					} else {
						str += "( ";
					}
					str += rankInten + " )";

					// 영화코드
					var movieCd = item.movieCd;
						
					// 영화명
					var movieNm = item.movieNm + "<br>";
					
					str += "<a href='#' onclick='javascript:info(" +  movieCd + ")'>" + movieNm + "</a>";
					
				})
				$("#msg").html(str);
			}
		})
	})
})