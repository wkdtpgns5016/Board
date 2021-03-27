<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메인화면</title>
    <style>
        table, tr, td{ border: 1px solid;}
    </style>
</head>
<body>
<h2>메인화면</h2><br>
${member.memName} 님 환영합니다 !
<a href="/board/logout">로그아웃</a> /
<a href="/board/myInfo">내정보</a><br>

<table>
    <tr>
        <td>게시글번호</td>
        <td>제목</td>
        <td>아이디</td>
        <td>날짜</td>
        <td>조회수</td>
    </tr>
    <c:forEach items="${list}" var="board">
        <tr>
            <td>${board.bNum}</td>
            <td><a href="/board/content?bNum=${board.bNum}">${board.bTitle}</a></td>
            <td>${board.bId}</td>
            <td>${board.bDate}</td>
            <td>${board.bHits}</td>
        </tr>
    </c:forEach>
</table>
<form action="/board/write">
    <input type="submit" value="글쓰기"/>
</form>
</body>
</html>

