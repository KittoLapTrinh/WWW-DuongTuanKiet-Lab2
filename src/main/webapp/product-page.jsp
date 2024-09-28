<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 9/28/2024
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Page</title>
    <%@include file="cdn.jsp"%>
</head>
<body>
<%@include file="nav-bar.jsp"%>
<h2>List Products</h2>
<div class="container">
    <table class="table container table-bordered table-responsive">
        <thead class="table-dark text-center">
            <tr>
                <th>Product Name</th>
                <th>Manufacturer Name</th>
                <th>Unit</th>
                <th>Description</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
        </thead>
        <tbody class="text-center">

        </tbody>
    </table>
</div>

</body>
</html>
