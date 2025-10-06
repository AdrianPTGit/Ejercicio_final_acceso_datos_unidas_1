package repository.interfazFicheros;

import model.Estudiante;

import java.util.ArrayList;

public interface RepositorioFicheroEstudiante {

    void guardarEstudiante(Estudiante estudiante);

    void eliminarEstudiante();

    Estudiante buscarEstuiantePorId(int id);

    ArrayList<Estudiante> mostarEstudiantes();
}
