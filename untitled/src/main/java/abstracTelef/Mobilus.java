package abstracTelef;

public class Mobilus extends Telefonas {
    private String simNr;
    private int nuotrSkaic;


    public Mobilus(String numeris, String simNr) {
        super(numeris);
        this.simNr = simNr;
        this.nuotrSkaic = 0;
    }

    public String getSimNr() {
        return simNr;
    }

    public int getNuotrSkaic() {
        return nuotrSkaic;
    }

    public void fotografuok() {
        nuotrSkaic++;
    }

    @Override
    public void paskambink(String telNumeris) {
        System.out.println(super.getNumeris());
    }

    public String toString() {
        return String.format("Mob. Telefonas{numeris: %s, simNr: %s, melodija: %s, nuotraukos %s}",
                super.getNumeris(),
                this.simNr,
                this.getMelodija(),
                this.nuotrSkaic
        );
    }
}
