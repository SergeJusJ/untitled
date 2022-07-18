package inheritance;

import java.math.BigDecimal;

public class Taksofon extends Telefonas {
    private BigDecimal piniguLikutis;
    private static final BigDecimal SKAMB_KAINA = BigDecimal.valueOf(0.25);

    @Override
    public void paskambink(String telNumeris) {

        if (this.piniguLikutis.compareTo(SKAMB_KAINA) > -1) {
            this.piniguLikutis = this.piniguLikutis.subtract(SKAMB_KAINA); //atimti pinigu
            super.paskambink(telNumeris);
        } else {
            System.out.println( "Ner pinigu - papild sask. " + this.piniguLikutis);
        }


        super.paskambink(telNumeris);
    }

    public Taksofon(BigDecimal pinigelis) {
        super("cia [taksofonas :]");
        this.piniguLikutis = pinigelis;
    }

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void setPiniguLikutis(BigDecimal pinigelis) {
        this.piniguLikutis = this.piniguLikutis.add(pinigelis);
    }

    public String toString() {
        return String.format("Taxofonas{numeris: %s, pinigu likutis: %s}",
                super.getNumeris(),
                this.piniguLikutis
        );
    }

}
