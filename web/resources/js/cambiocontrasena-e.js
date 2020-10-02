function cambiocontrasenaE(){
	var Contraseña,Contrasena;
	Contraseña = document.getElementById('Contraseña').value;
	Contrasena = document.getElementById('Contrasena').value;

    if (Contraseña === "") {
        alert("Enter the new password for your account.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("The password is too long.");
        return false;
    }
    if (Contrasena === "") {
        alert("Repeat password.");
        return false;
    }
    else if (Contrasena.length>15) {
        alert("The password is too long.");
        return false;
    }
    if (Contraseña !== Contrasena) {
        alert("Passwords do not match");
        return false;
    }
}
