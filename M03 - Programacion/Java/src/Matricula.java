public class Matricula {
    private Alumne alumne;
    private Modul modul;
    private int nota;

    public Matricula(Alumne alumne, Modul modul, int nota) {
        this.alumne = alumne;
        this.modul = modul;
        this.nota = nota;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matricula {" + alumne + "} {" + modul + "} = nota: " + nota + " }";
    }
}
