<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css"> 
        <meta charset="utf-8">
        <title>WebAluno Sistema Acad�mico</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <style>
            body {
                padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
            }
        </style>
        <link href="../assets/css/bootstrap-responsive.css" rel="stylesheet">

        
    </head>

    <body>

        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="#">Sistema Acad�mico</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="./cadastrarAluno.jsp">Cadastrar</a></li>
                            <li><a href="./visualizarAluno.jsp">Buscar Dados</a></li>
                            <li><a href="./sobre.jsp">Sobre</a></li>
                            <li><a href="./index.jsp">Sair</a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
        </div>

        <div class="container">
            <h3>Visualiza��o dos dados</h3>
            <p>    <table class="table table-bordered">
                <thead>
                <tr>
                  <th>#</th>
                  <th>Nome</th>
                  <th>Senha</th>
                  <th>Faltas</th>
                  <th>Turma</th>
                  <th>Situa��o</th>
                  <th>Nota</th>
                  <th>E-mail</th>
                </tr>
              </thead>

            </table><br> </p>

        </div> <!-- /container -->

      
    </body>
</html>
