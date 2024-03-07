import java.util.Collections;
import java.util.HashSet;

public class Bedna {
    private HashSet<Ovoce> hashSet = new HashSet<Ovoce>();

    public Bedna(HashSet<Ovoce> hashSet){
        this.hashSet = hashSet;
    }

    public HashSet<Ovoce> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<Ovoce> hashSet) {
        this.hashSet = hashSet;
    }

    public void pridejOvoce(String n, int c){
        Ovoce o = new Ovoce(n,c);
        this.hashSet.add(o);
    }

    public void vypis(){
        for (Ovoce ovoce: hashSet) {
            System.out.println(ovoce);
        }
    }

    public Ovoce nejdrazsiOvoce(){
        return Collections.max(hashSet);
    }

    public boolean najdiOvoce(String n, int c){
        for (Ovoce ovoce : hashSet) {
            if (ovoce.getNazev().equals(n) && ovoce.getCena() == c) {
                return true;
            }
        }
        return false;
    }

    public void smazOvoce(String n, int c){
        hashSet.removeIf(ov -> ov.getNazev().equals(n) && ov.getCena() == c);
    }

    public void vysypBednu(){
        hashSet.clear();
    }
}
