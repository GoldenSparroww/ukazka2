import java.util.Iterator;

public class Obchod {
    public static void sesypBedny(Bedna b1, Bedna b2){

        Iterator<Ovoce> iterator = b1.getHashSet().iterator();

        while (iterator.hasNext()) {
            Ovoce ovoce = iterator.next();
            b2.getHashSet().add(ovoce);
            iterator.remove();
        }
    }
}
