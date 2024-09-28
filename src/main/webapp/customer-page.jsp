<%@ page import="backend.services.CustomerService" %>
<%@ page import="backend.repositories.CustomerRepository" %>
<%@ page import="backend.models.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="org.glassfish.jersey.internal.inject.Custom" %><%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 9/28/2024
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Page</title>
    <%@include file="cdn.jsp" %>

</head>
<body>
<%@include file="nav-bar.jsp"%>
<h2 class="text-center m-5">List Customer</h2>
    <div class="d-flex justify-content-center mb-3">
        <div class="col-6">
            <a type="button" class="btn btn-secondary" href="insert-customer.jsp">Insert</a>


        </div>
        <div class="col-5">
            <div class="input-group">
                <input type="text" placeholder="Search" class="form-control">
                <button class="btn btn-primary">Search</button>
            </div>
        </div>
    </div>

    <div class="container">
        <table class="table table-bordered table-responsive">
            <thead class="table-">
                <tr>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <%
               CustomerService customerService = new CustomerService();
               List<Customer> customers = customerService.getCustomers();
               for (Customer customer : customers) {
                   String delete = "controls?action=delete_cust&id=" + customer.getId();

            %>
            <tr>
                <td><%=customer.getAddress()%></td>
                <td><%=customer.getEmail()%></td>
                <td><%=customer.getName()%></td>
                <td><%=customer.getPhone()%></td>
                <td><a type="button" class="btn btn-sm btn-danger" href=<%=delete%>></a></td>
                <td><a type="button" class="btn btn-sm btn-warning" href="update-customer.jsp?id=<%=customer.getId()%>"></a></td>
            </tr>
            <%

            }
            %>

            </tbody>

        </table>

    </div>

</body>
</html>
