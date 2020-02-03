<%--
  Created by IntelliJ IDEA.
  User: havaz
  Date: 1/30/2020
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach var="item" items="${menu}">
        <li>
            ${item}
        </li>
    </c:forEach>
</ul>
