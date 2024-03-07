import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Ovoce o1a = new Ovoce("j", 4);
        Ovoce o1b = new Ovoce("j", 4);

        if (o1a.equals(o1b)){
            System.out.println("ROVNÁ SE");
        } else {
            System.out.println("NEROVNÁ SE");
        }

        /*----------------*/System.out.println("BEDNA");/*----------------*/

        Bedna bedna = new Bedna(new HashSet<>());

        bedna.pridejOvoce("a", 1);
        bedna.pridejOvoce("b", 2);
        bedna.pridejOvoce("c", 3);
        bedna.pridejOvoce("d", 4);

        System.out.println("Výpis: ");
        bedna.vypis();

        System.out.println("Max: ");
        System.out.println(bedna.nejdrazsiOvoce());

        System.out.println("Hledej: ");
        System.out.println(bedna.najdiOvoce("a", 1));
        System.out.println(bedna.najdiOvoce("a", 111));

        bedna.smazOvoce("a", 1);
        bedna.vypis();

        bedna.vysypBednu();

        /*----------------*/System.out.println("OBCHOD");/*----------------*/

        bedna.pridejOvoce("a", 1);
        bedna.pridejOvoce("b", 2);
        bedna.pridejOvoce("c", 3);
        bedna.pridejOvoce("d", 4);

        Bedna bedna2 = new Bedna(new HashSet<>());
        Obchod.sesypBedny(bedna,bedna2);
        System.out.println("tahle je teď naplněna");
        bedna2.vypis();
        bedna.vypis();

        /*----------------*/System.out.println("MISKA_OVOCE");/*----------------*/

        MiskaOvoce miska = new MiskaOvoce(new ArrayList<>());

        miska.pridejOvoce("a", 50);
        miska.pridejOvoce("b", 2);
        miska.pridejOvoce("c", 3);
        miska.pridejOvoce("d", 1);

        miska.vypis();

        miska.smazOvoce(2);

        System.out.println("odstraněno a seřazeno");
        miska.seradOvoce();
        miska.vypis();
    }
}