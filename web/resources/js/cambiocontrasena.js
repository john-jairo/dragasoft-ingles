function cambiocontrasena(){
	var Contraseña,Contrasena;
	Contraseña = document.getElementById('Contraseña').value;
	Contrasena = document.getElementById('Contrasena').value;

    if (Contraseña === "") {
        alert("Escribe la nueva contraseña de tu cuenta.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("La contraseña es muy larga.");
        return false;
    }
    if (Contrasena === "") {
        alert("Repite la contraseña.");
        return false;
    }
    else if (Contrasena.length>15) {
        alert("La contraseña es muy larga.");
        return false;
    }
    if (Contraseña !== Contrasena) {
        alert("Las contraseñas no coinciden");
        return false;
    }
}
