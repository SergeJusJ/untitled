package inheritance;

public class MainTlefonas {
    public static void main(String[] args) {

        Telefonas telefonas1 = new Telefonas( "8566622222 ");

        Mobilus mob1 = new Mobilus("8600435554", "123 123 1321 32121");

        telefonas1.setMelodija("dzin dzin");
        System.out.println(telefonas1);
        telefonas1.paskambink(" 84655544414");

        mob1.setMelodija("tra lialia");

        mob1.fotografuok();
        mob1.fotografuok();
        mob1.fotografuok();

        System.out.println(mob1);

        mob1.paskambink("865555554 ");

    }
}
