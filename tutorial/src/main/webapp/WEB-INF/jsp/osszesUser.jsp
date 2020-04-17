<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    

<table class="table">
  <thead>
    <tr>
      <th scope="col">#id</th>
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

<div>
	 ${number +1 }.Oldal , ${size } / ${totalElements} elem
	
 		<ul class="pagination">
 			<c:forEach begin="0" end="${totalPages-1}" var="page">
 				<li class="page-item">
 					<a class="page-link" href="/tutorial/kiir?page=${page}&sort=${sort}">${page+1}</a>
 				</li>
 			</c:forEach>
		</ul>
</div>

 <div>
  <label for="cars">Rendezés:</label>

<form action="kiir" method="get">
<input type="hidden" name="page" value="${number}">
<select name="sort" onchange='this.form.submit()'>
  <option value="id">id</option>
  <option value="name">Név</option>
  <option value="age">Kor</option>
  <option value="email">Email</option>
</select>
</form>
  
</div>                                           
