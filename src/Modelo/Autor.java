package Modelo;

import java.sql.Date;

public class Autor {

    // Atributos privados (propiedades del autor)
    private int id_autor; // Identificador único del autor
    private String cedula; // Documento de identidad del autor
    private String nombres; // Nombres del autor
    private String Apellidos; // Apellidos del autor (Nota: empieza con mayúscula, no es habitual)
    private String email; // Dirección de correo electrónico del autor
    private Date fechaNac; // Fecha de nacimiento del autor

    // Constructor que inicializa todos los atributos, incluyendo el ID
    public Autor(int id_autor, String cedula, String nombres, String Apellidos,
            String email, Date fechaNac) {
        this.id_autor = id_autor; // Asigna el ID del autor
        this.cedula = cedula; // Asigna la cédula del autor
        this.nombres = nombres; // Asigna los nombres del autor
        this.Apellidos = Apellidos; // Asigna los apellidos del autor
        this.email = email; // Asigna el email del autor
        this.fechaNac = fechaNac; // Asigna la fecha de nacimiento del autor
    }

    // Constructor que inicializa los atributos excepto el ID
    public Autor(String cedula, String nombres, String Apellidos,
            String email, Date fechaNac) {
        this.cedula = cedula; // Asigna la cédula del autor
        this.nombres = nombres; // Asigna los nombres del autor
        this.Apellidos = Apellidos; // Asigna los apellidos del autor
        this.email = email; // Asigna el email del autor
        this.fechaNac = fechaNac; // Asigna la fecha de nacimiento del autor
    }

    // Método getter para obtener el ID del autor
    public int getId_autor() {
        return id_autor;
    }

    // Método setter para modificar el ID del autor
    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    // Método getter para obtener la cédula del autor
    public String getCedula() {
        return cedula;
    }

    // Método setter para modificar la cédula del autor
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Método getter para obtener los nombres del autor
    public String getNombres() {
        return nombres;
    }

    // Método setter para modificar los nombres del autor
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    // Método getter para obtener los apellidos del autor
    public String getApellidos() {
        return Apellidos;
    }

    // Método setter para modificar los apellidos del autor
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    // Método getter para obtener el email del autor
    public String getEmail() {
        return email;
    }

    // Método setter para modificar el email del autor
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para obtener la fecha de nacimiento del autor
    public Date getFechaNac() {
        return fechaNac;
    }

    // Método setter para modificar la fecha de nacimiento del autor
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
