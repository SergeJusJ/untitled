package abstracTelef;

import java.math.BigDecimal;

public class MainAbstrTlefonas {
    public static void main(String[] args) {

       // Telefonas telefonas1 = new Telefonas( "8566622222 ");

        Mobilus mob1 = new Mobilus("8600435554", "123 123 1321 32121");

        Taksofon taksF = new Taksofon(BigDecimal.valueOf(0.6));

       /* telefonas1.setMelodija("dzin dzin");
        System.out.println(telefonas1);
        telefonas1.paskambink(" 84655544414");
*/

        mob1.setMelodija("tra lialia");

        mob1.fotografuok();
        mob1.fotografuok();
        mob1.fotografuok();
        System.out.println(mob1);


        taksF.paskambink("65464564654");
        taksF.paskambink("654645646546");
        System.out.println(taksF);
        taksF.setPiniguLikutis(BigDecimal.TEN);
        taksF.paskambink("65464564654");
        taksF.paskambink("654645646546");

        System.out.println(taksF);




        mob1.paskambink("865555554 ");

    }
}
