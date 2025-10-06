package model;

import java.util.Date;
//La matriculación agrupa al estudiante con la asignatura, y guarda la fecha y la nota de esa matrícula.
public class Matricula {
   private int idMatricula;
   Estudiante idEstudiante;
   Date fecha;
   Double nota;

    /*************************CONSTRUCTOR*****************************************************/
    public Matricula(int idMatricula, Estudiante idEstudiante, Date fecha, Double nota) {
        this.idMatricula=idMatricula;
        this.idEstudiante = idEstudiante;
        this.fecha = fecha;
        this.nota = nota;
    }
    /*************************GET Y SET*****************************************************/
    public Estudiante getId() {
        return idEstudiante;
    }

    public void setNombre(Estudiante id) {
        this.idEstudiante = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
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
                "idMatricula=" + idMatricula +
                ", idEstudiante=" + idEstudiante +
                ", fecha=" + fecha +
                ", nota=" + nota +
                '}';
    }
}


