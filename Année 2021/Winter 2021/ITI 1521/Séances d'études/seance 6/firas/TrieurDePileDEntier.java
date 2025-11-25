import jdk.nashorn.internal.ir.WhileNode;

public class TrieurDePileDEntier {

    public ListePile<Integer> triPileDEntier(ListePile<Integer> pile){

        // 4, 2, 6, 5
        // => 6, 5, 4, 2

        ListePile<Integer> pileTemp = new ListePile<>();

        Integer tmp = null;

        while (!pile.isEmpty()){

            tmp = pile.pop();

            while (!pileTemp.isEmpty() && pileTemp.peek() > tmp){
                pile.push(pileTemp.pop());
            }

            pileTemp.push(tmp);

        }

        return pileTemp;
    }
}
