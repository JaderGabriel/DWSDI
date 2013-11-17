<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css"> 
        <meta charset="utf-8">
        <title>WebAluno Sistema Acadêmico &middot; </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <style type="text/css">
            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #f5f5f5;
            }

            .form-signin {
                max-width: 300px;
                padding: 19px 29px 29px;
                margin: 0 auto 20px;
                background-color: #fff;
                border: 1px solid #e5e5e5;
                -webkit-border-radius: 5px;
                -moz-border-radius: 5px;
                border-radius: 5px;
                -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
            }
            .form-signin .form-signin-heading,
            .form-signin .checkbox {
                margin-bottom: 10px;
            }
            .form-signin input[type="text"],
            .form-signin input[type="password"] {
                font-size: 16px;
                height: auto;
                margin-bottom: 15px;
                padding: 7px 9px;
            }

        </style>
        <link href="../assets/css/bootstrap-responsive.css" rel="stylesheet">

     
    </head>

    <body>
        <div class="container">

            <form class="form-signin" action="Login" method="POST">
                <center> <h2 class="form-signin-heading">WebAluno</h2></center>
                <p align="justify"><h5>Por favor, realize o login no sistema.</h5></p>    
                Tipo de usuário
                <br> 
                <select id="usuario" name="selecao">
                    <option>Selecione... </option>
                    <option>Aluno </option>
                    <option>Professor </option>
                    <option>Funcionário</option>
                </select>   
                <br>
                <input type="text" name="user" class="input-block-level" placeholder="Usuário">
                <input type="password" name="senha" class="input-block-level" placeholder="Senha">
                <input class="btn btn-large btn-primary" type="reset" value="Limpar"/>
                <input class="btn btn-large btn-primary" type="submit" name="loginB" value="LOGAR"/>
                <br>
                <br>
                Esqueceu a senha?
            </form>

        </div> <!-- /container -->
        
     
    </body>
</html>
