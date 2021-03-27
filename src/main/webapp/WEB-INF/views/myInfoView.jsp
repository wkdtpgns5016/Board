<%--
  Created by IntelliJ IDEA.
  User: wkdtp
  Date: 2021-03-27
  Time: 오후 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>내정보</title>
    <style>
        #complete{display: none;}
    </style>
</head>
<body>
<h2>내정보</h2>
<form action="/board/memberUpdate">
    이름 : <input type="text" class="info" name="memName" value="${member.memName}" readonly/><br>
    아이디 : <input type="text" name="memId" value="${member.memId}" readonly/><br>
    비밀번호 : <input type="password" class="info" name="memPw" value="${member.memPw}" readonly/><br>
    휴대전화 : <input type="text" class="info" name="memPhone" value="${member.memPhone}" readonly/><br>
    이메일 : <input type="text" class="info" name="memEmail" value="${member.memEmail}" readonly/><br>

    <input type="button" id="modify" value="정보수정" onclick="visibleBtn()"/>
    <input type="submit" id="complete" value="수정완료"  />
    <input type="button" value="뒤로" onclick="location.href='/board/main'" />
</form>
<a href="/board/memberDelete?memId=${member.memId}">계정삭제</a>
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
    function visibleBtn() {
        $('#modify').hide();
        $('#complete').show();
        $('.info').prop('readonly', false);
   }
</script>
</body>
</html>
