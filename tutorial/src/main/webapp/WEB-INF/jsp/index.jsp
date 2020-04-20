<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Tutorial-${pageName}</title>

  <!-- Bootstrap core CSS https://maxcdn.bootstrapcdn.com -->
  <link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel="stylesheet">
   <!-- Bootstrap core JavaScript -->
  <script src="webjars/ajax/libs/jquery/3.5.0/jquery.min.js"></script>
<!--   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->

<script>
$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
});
</script>

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="#">${pageName}</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="index">Főoldal
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="userMentes">User mentés</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="kiir?page=0&count=3&sort=id">User lista</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
<jsp:include page="${viewName}.jsp"></jsp:include>

  

</body>

</html>