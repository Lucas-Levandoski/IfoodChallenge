<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sucesso!</title>
</head>
<body>
	<div class="container">
	<h1>Restaurante, preencha suas informacoes</h1>	
	<div class="card">
		<div class="card-body">
			<form action="<%=request.getContextPath()%>/Register" method="post">
				<div class="form-group row">
					<label for="firstName" class="col-sm-2 col-form-label">First
				      Name
				    </label>
				    <div class="col-sm-7">
					    <input type="text" class="form-control" name="firstName" placeholder="Enter first name">
				    </div>
				    <button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>