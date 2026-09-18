public class Uloha {
    private String nazev;
    private int priorita;

    public Uloha(String nazev, int priorita) {
        this.nazev = nazev;
        if (priorita >= 1 && priorita <= 4) {
            this.priorita = priorita;
        }else{
            System.err.println("CHYBNA PRIORITA");
        }

    }


    public String toString() {
        return nazev + " " + priorita;
    }


    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPriorita() {
        return priorita;
    }
    public void setPriorita(int priorita){
        this.priorita = priorita;
    }

}
