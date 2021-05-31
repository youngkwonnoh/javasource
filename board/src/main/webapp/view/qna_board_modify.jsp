<%@page import="board.domain.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
	<div class="box box-primary">
		<div class="box-header">
			<h3 class="box-title">Board Modify</h3>
		</div>
		<div style="height:20px"></div>
		<form action="/qUpdate.do" method="post" role="form" enctype="multipart/form-data">
			<div class="box-body">
				<div class="form-group row">
					<label for="name" class="col-sm-2 col-form-label">글쓴이</label>
					<div class="col-sm-10" >
					<input type="text" name="name" size="10" class="form-control"	maxlength='10' value="${vo.name}" readonly>
					</div>
				</div>
				<div class="form-group row">
					<label for="title" class="col-sm-2 col-form-label">제목</label>
					<div class="col-sm-10">
						<input type="text" name="title" size="50" class="form-control"	maxlength='100' value="${vo.title}">
					</div>
				</div>
				<div class="form-group row">
					<label for="content" class="col-sm-2 col-form-label">내용</label>
					<div class="col-sm-10">
						<textarea name='content' cols='60' class="form-control" rows='15'>${vo.content}</textarea>
					</div>
				</div>
				<div class="form-group row">
					<label for="name" class="col-sm-2 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" name="password" class="form-control" size="10" maxlength='10'>
					</div>
				</div>
				<div class="form-group row">
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
							out.print("<a href='view/download.jsp?fileName=" + fileName + "'>" + attachName + "</a>");
						} else {
							out.print("<input type='file' name='attach'>");
						}
					%>
					</div>
				</div>
				<input type="hidden" name="bno" value="${vo.bno}"/>
				<input type="hidden" name="page" value="${searchVO.page}"/>
				<input type="hidden" name="criteria" value="${searchVO.criteria}"/>
				<input type="hidden" name="keyword" value="${searchVO.keyword}"/>
				<div style="height:20px"></div>
				<div class="box-footer text-center">
					<button type="submit" class="btn btn-primary">수정</button>
					<button type="reset" class="btn btn-danger">취소</button>
				</div>
				<div style="height:20px"></div>
			</div>
		</form>
	</div>
</section>
<%@include file="../include/footer.jsp"%>
