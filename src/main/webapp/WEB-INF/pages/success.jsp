<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/12/12
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<%= pageContext.getAttribute("cpt")%>
<script type="text/javascript" src="${pageContext.getAttribute("cpt")}/scripts/jquery-1.9.1.min.js"></script>
<html>
<head>
    <title>success</title>
</head>
<body>
     <h1>父子容器创建成功</h1>
     <table border="1" cellpadding="5px" cellspacing="0">
         <tr>
             <th>id</th>
             <th>lastName</th>
             <th>email</th>
             <th>gender</th>
             <th>departmentName</th>
             <th>EDIT</th>
             <th>DELETE</th>
         </tr>
         <c:forEach items="${requestScope.employees}" var="item">
             <tr>
                 <td>${item.id}</td>
                 <td>${item.lastName}</td>
                 <td>${item.email}</td>
                 <td>${item.id == 0?"女":"男"}</td>
                 <td>${item.department.departmentName}</td>
                 <td><a href="${pageContext.getAttribute("cpt")}/emp/${item.id}">edit</a></td>
                 <td><a href="${pageContext.getAttribute("cpt")}/emp/${item.id}" class="delBtn">delete</a></td>
             </tr>
         </c:forEach>
     </table>
</body>
</html>
