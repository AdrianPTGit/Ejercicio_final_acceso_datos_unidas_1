package repository.interfazFicheros;

import model.Estudiante;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface RepositorioFicheroEstudiante {

    void guardarEstudiante(Estudiante estudiante) throws IOException;

    void eliminarEstudiante(int id);

    void buscarEstuiantePorId(int id, ArrayList<Estudiante> listaEstudiantes);

    ArrayList<Estudiante> mostarEstudiantes() throws FileNotFoundException;
}
