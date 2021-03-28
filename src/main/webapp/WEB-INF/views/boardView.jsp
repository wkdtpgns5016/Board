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
<form action="/board/main">
    <input type="submit" value="목록" />
    <c:if test="${content.bId == member.memId}">
        <input type="button" value="수정" onClick="location.href='/board/modifyBoard?bNum=${content.bNum}&bId=${content.bId}&bTitle=${content.bTitle}&bContent=${content.bContent}&bDate=${content.bDate}&bHits=${content.bHits}'" />
        <input type="button" value="삭제" onClick="location.href='/board/deleteBoard?bNum=${content.bNum}'"/>
    </c:if>
</form>
<form action="/board/writeCommentOK">
    댓글 작성<br>
    <input type="hidden" name="cbNum" value="${content.bNum}"/>
    <input type="hidden" name="cId" value="${member.memId}"/>
    <textarea name="cContent" cols="65" rows="2"></textarea>
    <input type="submit" value="등록" />
</form>

<h3>Comment</h3>
<c:forEach items="${content.bComments}" var="comment">
    <div style="border: 1px solid; width: 500px; padding: 10px; margin: 10px" >
        <div style="margin-bottom: 5px">
            <span style="font-size: large;"><b>${comment.cId}</b></span>
            <span style=" font-size: small;">${comment.cDate}</span>+

            <c:if test="${comment.cId == member.memId}">
                <span style="position: absolute;left: 490px">
                    <a href="/board/deleteComment?cNum=${comment.cNum}&cbNum=${comment.cbNum}">삭제</a>
                </span>
            </c:if>
        </div>
        <div>
            <span>${comment.cContent}</span>
        </div>
    </div>
</c:forEach>
</body>
</html>