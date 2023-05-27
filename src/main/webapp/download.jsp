<%@page import="serverDto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> li=(List<StudentDto>)request.getAttribute("studentlist"); %>
<table border="">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Number</th>
<th>Delete</th>
</tr>
<% for(StudentDto dt:li){ %>
<tr>
<td><%=dt.getSid() %></td>
<td><%=dt.getSname() %></td>
<td><%=dt.getMail() %></td>
<td><%=dt.getPhno() %></td>
<td><a href="delete1?id=<%=dt.getSid()%>">remove</a></td>
</tr>
<%} %>
</table>

</body>
</html>