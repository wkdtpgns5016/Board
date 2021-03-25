<%--
  Created by IntelliJ IDEA.
  User: wkdtp
  Date: 2021-03-23
  Time: 오후 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인페이지</title>
</head>
<body>
<h2>로그인</h2>
<form action="/board/loginOK" method="post">
    아이디<input type="text" name="memId"/><br>
    비밀번호<input type="password" name="memPw"/><br>
    <input type="submit" value="로그인"/><br>
    계정이 없다면 ?<a href="/board/signUp">이곳을 클릭</a>해주세요.<br>
</form>

</body>
</html>
