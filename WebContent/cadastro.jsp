<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/cadastro.css">
        <script src="JS/cadastro.js"></script>
    
        <title>Cadastro</title>
      </head>
      <body>
        <div class="container">
          <div class="row vh-100 justify-content-center">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5 col-xxl-4">
                <nav class="navbar sticky-top">
                    <div class="container-fluid flex-nowrap justify-content-start">
                      <h3 class="nav-txt">
                        <img src="css/img/euro.png" alt="Ícone do euro" height="50" width="50" class="d-inline-block align-text-bottom">
                        Cadastro
                      </h3>
                    </div>
                  </nav>
                
              <form>
                <div class="mb-3">
                    <label for="nome" class="form-label" required>Nome Completo</label>
                    <input type="nome" class="form-control" id="input-nome">                
                </div>
                <div class="mb-3">
                    <label for="input-data-nascimento" class="form-label">Data de Nascimento</label>
                    <input type="dt-nascimento" class="form-control" id="input-dt-nasc">
                </div>
                <select class="form-select" aria-label="Default select example">
                    <option selected>Gênero</option>
                    <option value="1">Feminino</option>
                    <option value="2">Masculino</option>
                    <option value="3">Outro</option>
                </select>
                <div class="mb-3">
                    <label for="input-email-cadastro" class="form-label">E-mail de contato</label>
                    <input type="email" class="form-control" id="input-e-mail">
                </div>
                <div class="mb-3">
                    <label for="input-senha" class="form-label">Senha</label>
                    <input type="senha" class="form-control" id="input-senha">
                </div>
                <span id="passwordHelpInline" class="form-text">
                    Deve ter de 8 a 20 caracteres.
                </span>
                <div class="mb-3">
                    <label for="input-senha-confirm" class="form-label">Confirme sua senha</label>
                    <input type="senha-conf" class="form-control" id="input-senha-conf">
                </div>            
    
                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn" href="login.jsp">Cadastrar</button>
                </div>
                </form>
    
            </div>
          </div>
        </div>
    
        <script src="	https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
      </body>
    </html>