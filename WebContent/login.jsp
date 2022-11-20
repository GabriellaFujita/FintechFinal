<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <script src="JS/login.js"></script>

    <title>LOGIN</title>
  </head>

  <body>
    <div class="container">
      <div class="row vh-100 justify-content-center">
        <div class="col-12 col-md-8 col-lg-6 col-xl-5 col-xxl-4">
          <div class="row">
            <div class="logo col d-flex justify-content-center">
              <img class="imglogo" src="css/img/logo.png" alt="Logo do web app: símbolo do euro escrito economia coerente." >
            </div>
          </div>
          <form class="formulario">
            <div class="row">
                <div class="col d-flex justify-content-center">
                  <p class="ola">Olá, </p> 
                </div>
            </div>
            <div class="row">
              <div class="col d-flex justify-content-center">
                <p class="ola"> faça login na sua conta</p> 
              </div>
            </div>
            <div class="row">
              <div class="col input-group flex-nowrap my-3">
                <label for="email" class="visually-hidden">E-mail</label>
                <span class="input-group-text" id="addon-wrapping"><img src="css/img/user(2).png" height="25" width="25" ></span>
                <input type="email" name="email" id="email" class="form-control" placeholder="Digite seu e-mail">
              </div>
            </div>
            <div class="row">
              <div class="col input-group flex-nowrap">
                <label for="password" class="visually-hidden">Senha</label>
                <span class="input-group-text" id="addon-wrapping"><img src="css/img/senha (1).png" height="25" width="25" ></span>
                <input type="password" name="senha" id="senha" class="form-control" placeholder="Digite sua senha">
              </div>
            </div>
            <div class="row">
              <div class="col d-flex justify-content-end my-2">
                <a class="lembrarSenha" href="#">
                  Esqueci minha senha
                </a>  
              </div>
            </div>
            <div class="row">
              <div class="col d-flex justify-content-start my-3">
                <a href="#">
                  <button type="submit" class="btn" id="btn">Entrar</button>
                </a>  
              </div>
            </div>
          </form>

          <nav class="navbar sticky-bottom">
            <div class="container-fluid justify-content-center">
              <a class="navbar-brand" href="#">Criar minha conta</a>
            </div>
          </nav>

        </div>
      </div>
    </div>

    <script src="	https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
