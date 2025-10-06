package model;

public class Asignatura {
//Una asignatura tiene un id, nombre, créditos
    private int id;
    private String nombre;
    private int creditos;

    /*************************CONSTRUCTOR*****************************************************/
    public Asignatura(int id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    /*************************GET Y SET*******************************************************/
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    /*************************TO STRING*******************************************************/
    @Override
    public String toString() {
        return "Asignatura{" +
                "id:" + id +
                ", nombre:'" + nombre + '\'' +
                ", creditos:" + creditos +
                '}';
    }

}
