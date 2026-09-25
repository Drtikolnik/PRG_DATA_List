package obousmerny;

public class Song {

    private String nazev;
    private String interpret;
    private double delka;

    public Song(String nazev, String interpret, double delka) {
        this.nazev = nazev;
        this.interpret = interpret;
        this.delka = delka;
    }

    public String toString() {
        return nazev + ", " + interpret + ", " + delka;
    }




    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public Double getDelka() {
        return delka;
    }

    public void setDelka(double delka) {
        this.delka = delka;
    }
}
