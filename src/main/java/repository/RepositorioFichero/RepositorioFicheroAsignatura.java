package repository.RepositorioFichero;

import model.Asignatura;
import model.Estudiante;

import java.util.ArrayList;

public class RepositorioFicheroAsignatura implements repository.interfazFicheros.RepositorioFicheroAsignatura {


    @Override
    public void guardarAsignatura(Asignatura asignatura) {

    }

    @Override
    public void eliminarAsignatura() {

    }

    @Override
    public Estudiante buscarAsignatura(String nombreAsignatura) {
        return null;
    }

    @Override
    public ArrayList<Asignatura> mostarAsignaturas() {
        return null;
    }
}
