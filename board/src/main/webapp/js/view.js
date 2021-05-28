/**
 * qna_board_view.jsp 사용할 스크립트
 */
$(function() {
	$("#list").click(function() {
		location.href = "/qList.do";
	})
	$("#delete").click(function() {
		location.href = "view/qna_board_pwdCheck.jsp?bno=" + bno;
	})
	$("#modify").click(function() {
		location.href = "/qModify.do?bno=" + bno;
	})
	$("#reply").click(function() {
		var form = $("form");
		form.attr("action", "view/qna_board_reply.jsp");
		form.submit();
	})
	
})