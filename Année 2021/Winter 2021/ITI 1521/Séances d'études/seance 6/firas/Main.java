public class Main {
    public static void main(String[] args) {
        ListePile<String> listePileChaineDeCharactere = new ListePile<>();
        ListePile<Integer> listePileEntier = new ListePile<>();

        //System.out.println(listePileChaineDeCharactere.test("test"));
        //System.out.println(listePileEntier.test(12));

        listePileEntier.push(4);
        listePileEntier.push(2);
        listePileEntier.push(6);
        listePileEntier.push(5);

//        for(int i = 0; i < 1; i++){
//            System.out.println(listePileEntier.pop());
//            if(!listePileEntier.isEmpty()){
//                i--;
//            }
//        }

//        while (!listePileEntier.isEmpty()){
//            System.out.println(listePileEntier.pop());
//        }

        TrieurDePileDEntier trieur = new TrieurDePileDEntier();

        Pile<Integer> pileTriee = trieur.triPileDEntier(listePileEntier);

        while (!pileTriee.isEmpty()){
            System.out.println(pileTriee.pop());
        }


    }
}
