/**
 * qna_board_view.jsp 사용할 스크립트
 */
$(function() {
	
	var formObj = $("form[role='form']");
	var bno = $("input[name='bno']");
	
	$("#list").click(function() {
		// bno 요소 제거하기
		bno.remove();
		formObj.attr("action", "qList.do");
		formObj.submit();
	})
	$("#delete").click(function() {
		// location.href = "view/qna_board_pwdCheck.jsp?bno=" + bno;
		formObj.attr("action", "view/qna_board_pwdCheck.jsp");
		formObj.submit();
	})
	$("#modify").click(function() {
		// location.href = "/qModify.do?bno=" + bno;
		formObj.attr("action", "qModify.do");
		formObj.submit();
	})
	$("#reply").click(function() {
		formObj.attr("action", "/qReplyView.do");
		formObj.submit();
	})
	
})