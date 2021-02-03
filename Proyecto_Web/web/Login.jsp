<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Iniciar Sesion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="imagesLOG/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendorLOG/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fontsLOG/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fontsLOG/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendorLOG/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendorLOG/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendorLOG/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendorLOG/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendorLOG/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="cssLOG/util.css">
	<link rel="stylesheet" type="text/css" href="cssLOG/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	
	<div class="container-login100" style="background-image: url('imagesLOG/Fondo.jpg');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
				<span class="login100-form-title p-b-37">
					Iniciar sesion
				</span>
                                <form class="login100-form validate-form" action="ServletLogin" method="post">

				<div class="wrap-input100 validate-input m-b-20" data-validate="E-mail">
					<input class="input100" type="text" name="usuario" placeholder="Mail">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input m-b-25" data-validate = "Ingrese contraseña">
					<input class="input100" type="password" name="pass" placeholder="Contraseña">
					<span class="focus-input100"></span>
				</div>

				<div class="container-login100-form-btn">
                                    
					<button class="login100-form-btn">
						Iniciar sesion
					</button>
                                </div>

				

				<div class="text-center">
					<a href="Registro.jsp" class="txt2 hov1">
						Registrarse
					</a>
				</div>
			</form>

			
		</div>
	</div>
	
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendorLOG/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendorLOG/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendorLOG/bootstrap/js/popper.js"></script>
	<script src="vendorLOG/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendorLOG/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendorLOG/daterangepicker/moment.min.js"></script>
	<script src="vendorLOG/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendorLOG/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="jsLOG/main.js"></script>

</body>
</html>