<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">Email</th>
    </tr>
    </thead>
    <tbody>
	<c:forEach var="user" items="${userek}">
		<tr>
		<th scope="row">${user.id }</th>
		<td>${user.name}</td>
		<td>${user.age}</td>
		<td>${user.email}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
