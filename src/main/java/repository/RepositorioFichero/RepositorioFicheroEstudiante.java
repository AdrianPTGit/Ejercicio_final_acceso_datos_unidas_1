package repository.RepositorioFichero;

import model.Estudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositorioFicheroEstudiante implements repository.interfazFicheros.RepositorioFicheroEstudiante {

    final String nombreFicheroEstudiante;

    public RepositorioFicheroEstudiante(String nombreFicheroEstudiante) {
        this.nombreFicheroEstudiante = nombreFicheroEstudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(nombreFicheroEstudiante, true));
        pw.println(estudiante.getId()+","+estudiante.getNombre()+","+estudiante.getEmail());
        pw.close();
    }


    public void eliminarEstudiante(int id, ArrayList<Estudiante> estudiante){
        int idEstudianteBuscado=id;

        for (Estudiante e: estudiante) {
            if (e.getId() == idEstudianteBuscado) {
                System.out.println("Ya existe el estudiante en el fichero: "+nombreFicheroEstudiante);
                estudiante.remove(estudiante);

            } else {
                System.out.println("El estudiante no existe en el fichero: "+nombreFicheroEstudiante);
            }
        }
    }


    public void buscarEstuiantePorId(int id, ArrayList<Estudiante> estudiante) {
        int idEstudianteBuscado=id;

        for (Estudiante e: estudiante){
            if (e.getId() == idEstudianteBuscado) {
                System.out.println("Ya existe el estudiante en el fichero: "+nombreFicheroEstudiante);

            } else{
                System.out.println("El estudiante no existe en el fichero: "+nombreFicheroEstudiante);
            }
        }
    }

    @Override
    public ArrayList<Estudiante> mostarEstudiantes() throws FileNotFoundException {

        ArrayList<Estudiante> estudiantesEncontrados = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(nombreFicheroEstudiante));
        while (scanner.hasNextLine()){
            String[] datos=scanner.nextLine().split(",");
            estudiantesEncontrados.add(new Estudiante(
                    Integer.parseInt(datos[0]),
                    String.valueOf(datos[1]),
                    String.valueOf(datos[3]))
            );
        }
        scanner.close();
        return estudiantesEncontrados;
    }
}
