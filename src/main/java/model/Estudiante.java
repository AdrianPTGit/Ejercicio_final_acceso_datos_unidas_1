package model;

public class Estudiante {
    //Un alumno tiene los campos id, nombre y email
    private int idEstudiante;
    private String nombre;
    private String email;

    /*************************CONSTRUCTOR*****************************************************/
    public Estudiante(int id, String nombre, String email) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.email = email;
    }
    /*************************GET Y SET*******************************************************/
    public int getId() {
        return idEstudiante;
    }

    public void setId(int id) {
        this.idEstudiante = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*************************TO STRING*******************************************************/
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
