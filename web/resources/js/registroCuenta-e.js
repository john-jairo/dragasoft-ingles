function registroCuentaE(){
	var Correo,Contraseña;
	Correo = document.getElementById('Correo').value;
	Contraseña = document.getElementById('Contraseña').value;

    if (Correo === "") {
        alert("Please enter a valid email address.");
        return false;
    }
    else if (Correo.length>30) {
        alert("The mail is very long.");
        return false;
    }
    if (Contraseña === "") {
        alert("Write the last password of your account.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("The password is too long.");
        return false;
    }
}
