package abstracTelef;

public abstract class Telefonas {
    private String numeris;
    private String melodija;

    public Telefonas(String numeris) {
        this.numeris = numeris;
    }

    public abstract void paskambink (String telNumeris);

    /*public void paskambink(String telNumeris){
        System.out.println("Abonementas "+ this.numeris + "skambina i " + telNumeris);
                    }*/

    public String getNumeris() {
        return numeris;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public String toString() {
        return String.format("Telefonas{numeris: %s, melodija: %s}",
                            this.numeris,
                            this.melodija
                );
    }
}
