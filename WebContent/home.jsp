<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/home.css">
    <script src="JS/login.js"></script>

    <title>Home</title>
  </head>

  <body>
    <div class="container">
      <div class="row vh-100 justify-content-center">
        <div class="col-12 col-md-8 col-lg-6 col-xl-5 col-xxl-4">
            <nav class="navbar sticky-top">
                <div class="container-fluid flex-nowrap justify-content-start">
                  <h3 class="nav-txt">
                <img src="css/img/euro.png" alt="icone do euro" width="50" height="50" class="d-inline-block align-text-bottom">
                    Seja bem vindo!
                  </h3>
                </div>
              </nav>
              <div class="card-saldo">
                <div class="card-header">
                    Saldo em conta
                </div>
                <ul class="list-group list-group-flush">
                  <li class="list-group-item">R$XXXX,XX</li>
                </ul>
              </div>
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Receitas</h5>
                  <p class="card-text">Total: R$XXXX,XX</p>
                  <a href="#" class="card-link">Detalhes</a>
                </div>
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">Gastos</h5>
                    <p class="card-text">Total: R$XXXX,XX</p>
                    <a href="#" class="card-link">Detalhes</a>
                  </div>
                </div>
                <nav class="navbar sticky-bottom">
                  <div class="container-fluid d-flex justify-content-around">
                      <a class="navbar-brand" href="#">
                        <img src="css/img/botao-home.png" alt="Home" width="40" height="40">
                      </a>
                      <a class="navbar-brand" href="#">
                        <img src="css/img/investimento.png" alt="Investimentos" width="40" height="40">
                      </a>
                      <a class="navbar-brand" href="#">
                        <img src="css/img/alvo.png" alt="Metas" width="40" height="40">
                      </a>
                      <a class="navbar-brand" href="#">
                        <img src="css/img/transacao.png" alt="Transações" width="40" height="40">
                      </a>
                  </div>
                </nav>

        </div>
      </div>
    </div>

    <script src="	https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>