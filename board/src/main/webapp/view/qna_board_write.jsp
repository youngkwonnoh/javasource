<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
  <div class="box box-primary">
    <div class="box-header">
      <h3 class="box-title">Board Write</h3>
    </div>
    <div style="height:20px"></div>
    <form action="../qWrite.do" method="post" role="form" id="writeForm" enctype="multipart/form-data">
      <div class="box-body">
        <div class="form-group row">
          <label for="name" class="col-sm-2 col-form-label">작성자</label>
          <div class="col-sm-10">
            <input
              type="text"
              name="name"
              id="name"
              size="10"
              class="form-control"
              maxlength="10"
              required
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="title" class="col-sm-2 col-form-label">제목</label>
          <div class="col-sm-10">
            <input
              type="text"
              name="title"
              id="title"
              size="50"
              class="form-control"
              maxlength="100"
              required
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="content" class="col-sm-2 col-form-label">내용</label>
          <div class="col-sm-10">
            <textarea
              name="content"
              id="content"
              cols="60"
              class="form-control"
              rows="15"
              required
            ></textarea>
          </div>
        </div>
        <div class="form-group row">
          <label for="password" class="col-sm-2 col-form-label">비밀번호</label>
          <div class="col-sm-10">
            <input
              type="password"
              name="password"
              id="password"
              class="form-control"
              size="10"
              maxlength="10"
              required
            />
          </div>
        </div>
        <div class="form-group row">
          <label for="file" class="col-sm-2 col-form-label">파일첨부</label>
          <div class="col-sm-10">
            <input type="file" name="attach" id="file" />
            <small class="text-muted" id="file">(파일크기 : 2MB)</small>
          </div>
        </div>
        <input type="hidden" name="page" value="<%=request.getParameter("page")%>"/>
		<input type="hidden" name="criteria" value="<%=request.getParameter("criteria")%>"/>
		<input type="hidden" name="keyword" value='<%=request.getParameter("keyword")%>'/>
        <div style="height:20px"></div>
        <div class="form-group text-center">
          <button type="submit" class="btn btn-primary">등록</button>
          <button type="reset" class="btn btn-danger">다시작성</button>
          <button type="button" class="btn btn-warning" id="list">
            목록보기
          </button>
        </div>
        <div style="height:20px"></div>
      </div>
    </form>
  </div>
  <!-- /.box -->
</section>
<script>
$(function() {
	// 등록 버튼 클릭 시 - 1. submit 기능 중지 2. page 요소의 value 값을 1로 변경 3.submit
	$(".btn-primary").click(function(e) {
		e.preventDefault();
		$("[name='page']").val("1");
		$("form").submit();
	})
	$("#list").click(function() {
		let page = $("[name='page']").val();
		let criteria = $("[name='criteria']").val();
		let keyword = $("[name='keyword']").val();
		
		location.href="../qList.do?page=" + page + "&criteria=" + criteria + "&keyword" + keyword;
	})
})
</script>
<%@include file="../include/footer.jsp"%>
