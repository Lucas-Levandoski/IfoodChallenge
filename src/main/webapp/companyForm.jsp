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
	<h1>Cadastro Restaurante</h1>
	<form action="produto" method="post">
		<div class="form-group">
			<label for="id-nome">Nome</label>
			<input type="text" name="nome" id="id-nome" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-valor">Endereco</label>
			<input type="text" name="valor" id="id-valor" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-quantidade">horario de funcionamento</label>
			<input type="text" name="quantidade" id="id-quantidade" class="form-control">
		</div>
		<div class="form-group">
			<label for="id-fabricacao"></label>
			<input type="text" name="fabricacao" id="id-fabricacao" class="form-control">
		</div>
		<input type="submit" value="Salvar" class="btn btn-primary">
	</form>
</div>
</body>
</html>


