function registrarse(){
	var Numero,Tipo,PrimerN,SegundoN,PrimerA,SegundoA,Correo,Contraseña,Contrasena,Telefono;
	Numero = document.getElementById('Numero').value;
        Tipo = document.getElementById('Tipo').value;
        PrimerN = document.getElementById('PrimerN').value;
        SegundoN = document.getElementById('SegundoN').value;
        PrimerA = document.getElementById('PrimerA').value;
        SegundoA = document.getElementById('SegundoA').value;
        Correo = document.getElementById('Correo').value;
        Contraseña = document.getElementById('Contraseña').value;
        Contrasena = document.getElementById('Contrasena').value;
        Telefono = document.getElementById('Telefono').value;
        
    if (Numero === "") {
        alert("Escribe el numero de documento.");
        return false;
    }
    else if (Numero.length>11) {
        alert("El numero de documento es muy largo.");
        return false;
    }
    else if (isNaN(Numero)) {
        alert("El numero de documento no debe llevar letras");
        return false;
    }
    if (Tipo === "") {
        alert("Escribe el tipo de documento.");
        return false;
    }
    else if (Tipo.length>35) {
        alert("El tipo de documento es muy largo.");
        return false;
    }
    if (PrimerN === "") {
        alert("Escribe tu primer nombre.");
        return false;
    }
    else if (PrimerN.length>15) {
        alert("El primer nombre es muy largo.");
        return false;
    }
    if (SegundoN === "") {
        alert("Escribe tu segundo nombre.");
        return false;
    }
    else if (SegundoN.length>15) {
        alert("El segundo nombre es muy largo.");
        return false;
    }
    if (PrimerA === "") {
        alert("Escribe tu primer apellido.");
        return false;
    }
    else if (PrimerA.length>15) {
        alert("El primer apellido es muy largo.");
        return false;
    }
    if (SegundoA === "") {
        alert("Escribe tu segundo apellido.");
        return false;
    }
    else if (SegundoA.length>15) {
        alert("El segundo apellido es muy largo.");
        return false;
    }
     if (Correo === "") {
        alert("Escribe una dirección de correo electrónico.");
        return false;
    }
    else if (Correo.length>30) {
        alert("El correo electrónico es muy largo.");
        return false;
    }
    if (Contraseña === "") {
        alert("Escribe la contraseña.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("La contraseña es muy larga.");
        return false;
    }
    if (Contrasena === "") {
        alert("Confirma la contraseña.");
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
    if (Telefono === "") {
        alert("Escribe el numero de telefono.");
        return false;
    }
    else if (Telefono.length>11) {
        alert("El numero de telefono es muy largo.");
        return false;
    }
    else if (isNaN(Telefono)) {
        alert("El numero de telefono no debe llevar letras");
        return false;
    }
    
}
        
        
        
	

  