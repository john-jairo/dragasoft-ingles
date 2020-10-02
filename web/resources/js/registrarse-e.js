function registrarseE(){
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
        alert("Write the document number.");
        return false;
    }
    else if (Numero.length>11) {
        alert("The document number is very long.");
        return false;
    }
    else if (isNaN(Numero)) {
        alert("The document number must not have letters");
        return false;
    }
    if (Tipo === "") {
        alert("Write the type of document.");
        return false;
    }
    else if (Tipo.length>35) {
        alert("The document type is very long.");
        return false;
    }
    if (PrimerN === "") {
        alert("Write your first name.");
        return false;
    }
    else if (PrimerN.length>15) {
        alert("The first name is very long.");
        return false;
    }
    if (SegundoN === "") {
        alert("Write your middle name.");
        return false;
    }
    else if (SegundoN.length>15) {
        alert("The middle name is very long.");
        return false;
    }
    if (PrimerA === "") {
        alert("Write your first last name.");
        return false;
    }
    else if (PrimerA.length>15) {
        alert("The first surname is too long.");
        return false;
    }
    if (SegundoA === "") {
        alert("Write your second last name.");
        return false;
    }
    else if (SegundoA.length>15) {
        alert("The second surname is very long.");
        return false;
    }
     if (Correo === "") {
        alert("Enter an email address.");
        return false;
    }
    else if (Correo.length>30) {
        alert("the email is too long.");
        return false;
    }
    if (Contraseña === "") {
        alert("Enter the password.");
        return false;
    }
    else if (Contraseña.length>15) {
        alert("The password is too long.");
        return false;
    }
    if (Contrasena === "") {
        alert("Confirm password.");
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
    if (Telefono === "") {
        alert("Write the phone number.");
        return false;
    }
    else if (Telefono.length>11) {
        alert("The phone number is too long.");
        return false;
    }
    else if (isNaN(Telefono)) {
        alert("The phone number must not have letters");
        return false;
    }
    
}
        
        
        
	

  