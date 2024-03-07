public class Ovoce implements Comparable<Ovoce> {
    private String nazev;
    private double cena;

    public Ovoce(String nazev, double cena){
        this.nazev = nazev;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString(){
        return "Nazev: "+nazev+" | Cena: "+cena+" Kc/kg";
    }


    @Override
    public int compareTo(Ovoce o) {
        if (this.cena == o.getCena()){
            return this.nazev.compareTo(o.getNazev());
        } else {
            if (this.cena > o.getCena()){
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public boolean equals(Object O){
        return this.toString().equals(O.toString());
    }
}
