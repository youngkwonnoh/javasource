<%@page import="board.domain.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
	<div class="box box-primary">
		<div class="box-header">
			<h3 class="box-title">Read Board</h3>
		</div>
		<div style="height:20px"></div>
		<form action="" method="post" role="form">
			<div class="box-body">
				<div class="form-group row">
					<label for="name" class="col-sm-2 col-form-label">글쓴이</label>
					<div class="col-sm-10">
						<input type="text" name="name" size="10" class="form-control" maxlength='10' value="${vo.name}" readonly>
					</div>
				</div>
				<div class="form-group  row">
					<label for="title" class="col-sm-2 col-form-label">제목</label>
					<div class="col-sm-10">
						<input type="text" name="title" size="50" class="form-control"	maxlength='100' value="${vo.title}"  readonly>
					</div>
				</div>
				<div class="form-group  row">
					<label for="content" class="col-sm-2 col-form-label">내용</label>
					<div class="col-sm-10">
						<textarea name='content' cols='60' class="form-control" rows='15' readonly>${vo.content}</textarea>
					</div>
				</div>
				<div class="form-group  row">
					<label for="filename" class="col-sm-2 col-form-label">파일첨부</label>
					<div class="col-sm-10">
					<% 
						// UUID 값과 파일명 분리해서 보여주기
						BoardVO vo = (BoardVO)request.getAttribute("vo");
						String fileName = vo.getAttach();
						String attachName="";
						if(fileName != null){
							int start = fileName.lastIndexOf("_");
							attachName = fileName.substring(start+1);
						}
					%>
						<a href="view/download.jsp?fileName=${vo.attach}"><%=attachName%></a>
						<%--<a href="view/download.jsp?fileName=${vo.attach}">${vo.attach}</a>--%>
					</div>
				</div>
				<div style="height:10px"></div>
				<div class="box-footer text-center">
					<button type="button" class="btn btn-success" id="reply">답변</button>
					<button type="button" class="btn btn-warning" id="modify">수정</button>
					<button type="button" class="btn btn-danger" id="delete">삭제</button>
					<button type="button" class="btn btn-primary" id="list">목록보기</button>
				</div>
				<div style="height:20px"></div>
				<input type="hidden" name="re_ref" value="${vo.re_ref}">
				<input type="hidden" name="re_seq" value="${vo.re_seq}">
				<input type="hidden" name="re_lev" value="${vo.re_lev}">
			</div>
		</form>
	</div>
</section>
<script>
	let bno = ${vo.bno};
</script>
<script src="../js/view.js"></script>
<%@include file="../include/footer.jsp"%>
