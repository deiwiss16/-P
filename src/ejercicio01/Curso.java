
package ejercicio01;

public class Curso {

    private String nombreCurso;
    private int nota;

public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.nota = -1;
}

public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
}
