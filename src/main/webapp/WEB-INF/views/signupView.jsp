<%--
  Created by IntelliJ IDEA.
  User: wkdtp
  Date: 2021-03-23
  Time: 오후 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<form action="/board/signOK" method="post">
    이름<input type="text" name="memName"/><br>
    아이디<input type="text" name="memId"/><br>
    비밀번호<input type="password" name="memPw"/><br>
    휴대전화<input type="text" name="memPhone"/><br>
    이메일<input type="text" name="memEmail"/><br>
    <input type="submit" value="회원가입"/>
</form>
</body>
</html>
