<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registro para empleado</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="cssREG/style.css">
</head>
<body>

    <div class="main">
        
        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form action= "ServletRegistro" method="POST" id="signup-form" class="signup-form">
                        <h2 class="form-title">Crear Empleado</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="nombre" id="name" placeholder="Ingrese su nombre"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="apellido" id="re_password" placeholder="Ingrese su apellido"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="edad" id="name" placeholder="Inserte su edad"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="puesto" id="re_password" placeholder="ingrese el ID del juego que tiene de puesto"/>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="email" id="email" placeholder="E-MAIL"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="password" id="password" placeholder="Contraseña"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="sueldo" id="re_password" placeholder="Inserte su Salario por mes*"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="dni" id="re_password" placeholder="Favor de ingresar DNI"/>
                        </div>
                        
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Sign up"/>
                        </div>
                    </form>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendorREG/jquery/jquery.min.js"></script>
    <script src="jsREG/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
