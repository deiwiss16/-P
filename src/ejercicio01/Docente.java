
package ejercicio01;

import java.util.Random;

public class Docente extends Persona {
    private String cursoDocente;
    private String facultadDocente;

    public Docente(String dni, String nombre, String apellido, String cursoDocente, String facultadDocente) {
        super(dni, nombre, apellido);
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }

    //Getters y Setters
    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
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
    public void calificarCurso(Curso curso) {
        Random rand = new Random();
        int nota = rand.nextInt(21);
        curso.setNota(nota);
    }
}
