    //Asignaciones
public class User {
    private int idUser;
    private String nameUser;
    private String emailUser;
    private static int contadorIdUser;

    //Constructor
    public User(String nameUser, String emailUser) {
        this.idUser = ++contadorIdUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }
    //Getters and Setters
    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    //toString: A la hora de nombrar, puedes añadir texto para que salgar antes del valor.
    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                '}';
    }
}
