<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2 align="center">Tutorial Form</h2>

<form class="form-horizontal" action="mentes" method="post">
  <div class="form-group">
    <label class="control-label col-sm-2" for="name">Név:</label>
    <div class="col-sm-10">
    	<input type="text" class="form-control" id="name" name="name">
  	</div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="age">Kor:</label>
    <div class="col-sm-10">
    	<input type="number" class="form-control" id="age" name="age">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email cím:</label>
    <div class="col-sm-10">
    	<input type="email" class="form-control" id="email" name="email">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
  		<button type="submit" class="btn btn-default">Mentés</button>
  	</div>
  </div>
</form>