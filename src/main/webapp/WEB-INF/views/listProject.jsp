<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${projects}" var="s" varStatus="st">
        <tr>
            <td>${s.projectNo}</td>
            <td>${s.projectName}</td>
        </tr>
    </c:forEach>
</table>