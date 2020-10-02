function registroCuenta(){
	var Correo,Contraseña;
	Correo = document.getElementById('Correo').value;
	Contraseña = document.getElementById('Contraseña').value;

    if (Correo === "") {
        alert("Escribe una dirección de correo electrónico.");
        return false;
    }
    else if (Correo.length>30) {
        alert("El correo es muy largo.");
        return false;
    }
    if (Contraseña === "") {
        alert("Escribe la ultima contraseña de tu cuenta.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("La contraseña es muy larga.");
        return false;
    }
}
