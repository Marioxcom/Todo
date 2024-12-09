    //Asignaciones
public class Song {
    private int idSong;
    private String nameSong;
    private String artist;
    private int duration;
    private String genere;
    private static int contadorIdUser;


    //Constructor
    public Song(String nameSong, String artist, int duration, String genere) {
        this.idSong = contadorIdUser++;
        this.nameSong = nameSong;
        this.artist = artist;
        this.duration = duration;
        this.genere = genere;
    }

    //Getters and Setters
    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //toString: A la hora de nombrar, puedes añadir texto para que salgar antes del valor.
    @Override
    public String toString() {
        return "Song{" +
                "idSong=" + idSong +
                ", nameSong='" + nameSong + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", genere='" + genere + '\'' +
                '}';
    }
}
