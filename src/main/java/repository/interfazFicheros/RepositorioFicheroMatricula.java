package repository.interfazFicheros;

import model.Estudiante;
import model.Matricula;

import java.util.ArrayList;

public interface RepositorioFicheroMatricula {

    void guardarMatricula(Estudiante estudiante);

    void eliminarMatricula();

    Matricula buscarMatriculaPorId(int idMatricula);

    ArrayList<Matricula> mostarMatricuka();
}
