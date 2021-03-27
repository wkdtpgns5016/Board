<%--
  Created by IntelliJ IDEA.
  User: wkdtp
  Date: 2021-03-25
  Time: 오후 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, td{ border: 1px solid;}
        #content {width: 700px; height: 300px;}
    </style>
</head>
<body>
<table>
    <tr>
        <td>번호</td>
        <td>${content.bNum}</td>
    </tr>
    <tr>
        <td>작성자</td>
        <td>${content.bId}</td>
    </tr>
    <tr>
        <td>날짜</td>
        <td>${content.bDate}</td>
    </tr>
    <tr>
        <td>조회수</td>
        <td>${content.bHits}</td>
    </tr>
    <tr>
        <td>제목</td>
        <td>${content.bTitle}</td>
    </tr>
    <tr>
        <td>내용</td>
        <td id="content">${content.bContent}</td>
    </tr>
</table>
<c:if test="${content.bId == member.memId}">
    <input type="submit" value="수정" onClick="location.href='/board/modify?bNum=${content.bNum}&bId=${content.bId}&bTitle=${content.bTitle}&bContent=${content.bContent}&bDate=${content.bDate}&bHits=${content.bHits}'" />
    <input type="submit" value="삭제" onClick="location.href='/board/delete?bNum=${content.bNum}'"/>
</c:if>
<form action="/board/main">
    <input type="submit" value="목록" />

</form>
</body>
</html>

