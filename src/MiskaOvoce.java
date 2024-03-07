import java.util.ArrayList;
import java.util.Collections;

public class MiskaOvoce {

    private ArrayList<Ovoce> arrayList = new ArrayList<>();

    public MiskaOvoce(ArrayList<Ovoce> arrayList){
        this.arrayList = arrayList;
    }

    public void pridejOvoce(String n, int c){
        this.arrayList.add(new Ovoce(n,c));
    }

    public void vypis(){
        for (Ovoce ovoce : arrayList) {
            System.out.println(ovoce);
        }
    }

    public void smazOvoce(int cisloPozice){
        this.arrayList.remove(cisloPozice);
    }

    public void seradOvoce(){
        Collections.sort(this.arrayList);
    }
}
