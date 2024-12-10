public class Modul {
    private String nomModul;

    public Modul(String nomModul) {
        this.nomModul = nomModul;
    }

    public String getNomModul() {
        return nomModul;
    }

    public void setNomModul(String nomModul) {
        this.nomModul = nomModul;
    }

    @Override
    public String toString() {
        return "Modul (" +
                "nomModul: '" + nomModul + '\'' +
                ')';
    }
}
