<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
	<div class="box box-primary">
		<div class="box-header">
			<h3 class="box-title">List Board</h3>
		</div>
		<div class="row">
			<div class="col-md-4"><!--글쓰기 버튼-->
				<button type="button" class="btn btn-succes" onclick="location.href='view/qna_board_write.jsp'">새 글 작성</button>
			</div>
			<div class="col-md-4 offset-md-4"><!--검색 들어갈 부분-->
				<form action="/qSearch.do" method="get">
					<select name="criteria" id="">
						<option value="n" <c:out value="${empty searchVO.criteria?'selected':''}"/>>-------</option>
						<option value="title" <c:out value="${empty searchVO.criteria=='title'?'selected':''}"/>>title</option>
						<option value="content" <c:out value="${empty searchVO.criteria=='content'?'selected':''}"/>>content</option>
						<option value="name" <c:out value="${empty searchVO.criteria=='name'?'selected':''}"/>>name</option>
					</select>
					<input type="text" name="keyword" value="${searchVO.keyword}"/>
					<button type="button" class="btn btn-primary">검색</button>
				</form>
			</div>
		</div>
		<br>
		<table class="table table-bordered">
			<tr>
				<th class='text-center' style='width:100px'>번호</th>
				<th class='text-center'>제목</th>
				<th class='text-center'>작성자</th>
				<th class='text-center'>날짜</th>
				<th class='text-center' style='width:100px'>조회수</th>
			</tr>
			<c:forEach var="vo" items="${list}">
				<tr><!-- 리스트 목록 보여주기 -->
					<td class='text-center'>${vo.bno}</td><!--번호-->
					<td><!--제목-->
						<c:if test="${vo.re_lev!=0}">
							<c:forEach begin="0" end="${vo.re_lev*1}">
								&nbsp;
							</c:forEach>
						</c:if>
						<a href="/qHitUpdate.do?bno=${vo.bno}">${vo.title}</a>
					</td>
					<td class='text-center'>${vo.name}</td><!--작성자-->
					<td class='text-center'>${vo.regdate}</td><!--날짜-->
					<td class='text-center'><span class="badge badge-pill badge-primary">${vo.readcount}</span></td>
				</tr>
			</c:forEach>
		</table>
		<div class="container">
			<div class="row  justify-content-md-center">
				<nav aria-label="Page navigation example">
				  <ul class="pagination"><!--하단의 페이지 나누기 부분-->

				  </ul>
				</nav>					
			</div>
		</div>
		<div style="height:20px"></div>
	</div>	
</section>
<script>
$(function() {
	$("[name='keyword']").keydown(function(e) {
		if(e.keyCode == 13) {
			e.preventDefault();
		}
		
	})
	$(".btn-primary").click(function() {
		
		// 검색조건 확인
		if($("[name='criteria']").val()=="n") {
			alert("검색 조건을 확인하세요");
			$("[name='criteria']").focus();
			return false;
		} else if($("[name='keyword']").val()=="") { // 검색어 확인
			alert("검색어를 확인하세요");
			$("[name='keyword']").focus();
			return false;
		}
		$("form").submit();
	})
})
</script>
<%@include file="../include/footer.jsp"%>
