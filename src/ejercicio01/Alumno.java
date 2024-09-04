package ejercicio01;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Alumno extends Persona {

    private String codigoAlumno;
    private List<Curso> listaCursos;

    public Alumno(String codigo, String nombre, List<Curso> listaCursos) {
        super(codigo, nombre, "");
        this.codigoAlumno = codigo;
        this.listaCursos = listaCursos;
        leeCursosAlumno("cursosAlumnos.txt");
    }

    //Getters y Setters
    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Otros métodos
    private void leeCursosAlumno(String fileName) {
        listaCursos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaCursos.add(new Curso(linea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
