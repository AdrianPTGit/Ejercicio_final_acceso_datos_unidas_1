package repository.interfazFicheros;

import model.Asignatura;
import model.Estudiante;

import java.util.ArrayList;

public interface RepositorioFicheroAsignatura {
    public void guardarAsignatura(Asignatura asignatura);

    public void eliminarAsignatura();

    public Estudiante buscarAsignatura(String nombreAsignatura);

    public ArrayList<Asignatura> mostarAsignaturas();

}