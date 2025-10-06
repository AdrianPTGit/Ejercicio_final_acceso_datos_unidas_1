package model;

import java.util.Date;
//La matriculación agrupa al estudiante con la asignatura, y guarda la fecha y la nota de esa matrícula.
public class Matricula {
   Asignatura nombre;
   Date fecha;
   Double nota;

    /*************************CONSTRUCTOR*****************************************************/
    public Matricula(Asignatura nombre, Date fecha, Double nota) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.nota = nota;
    }
    /*************************GET Y SET*****************************************************/
    public Asignatura getNombre() {
        return nombre;
    }

    public void setNombre(Asignatura nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    /*************************TOSTRING*****************************************************/

    @Override
    public String toString() {
        return "Matricula{" +
                "nombre:" + nombre +
                ", fecha:" + fecha +
                ", nota:" + nota +
                '}';
    }
}


