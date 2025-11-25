public class Shiritori {

    public String[] mots = new String[20];
    private int length = 0;
    public boolean gameOver = false;

    public String play(String mot){
        // Le premier caractère du mot suivant doit correspondre au dernier caractère du mot précédent.
        // Le mot ne doit pas avoir déjà été dit.

        boolean valide1 = true;
        // verif cond 1

        if(!(length == 0)){

            String dernierMot = mots[length-1];
            Character dernierChar = dernierMot.charAt(dernierMot.length()-1);
            Character premierChar = mot.charAt(0);

            if(!(dernierChar.equals(premierChar))){
                valide1 = false;
            }

            boolean valide2 = true;

            for(int i = 0; i<length; i++){
                if(mots[i].equals(mot)){
                    valide2 = false;
                }
            }

            if(valide1 && valide2){
                System.out.println(length);
                mots[length] = mot;

                length++;
                return getWords();
            } else {
                this.gameOver = true;
                return "game over";
            }
        } else {
            System.out.println(length);
            mots[length] = mot;

            length++;
            return getWords();
        }



    }

    public String getWords(){
        String result = "";
        for(int i = 0; i < length; i++){
            result = result + " " + mots[i];
        }
        return result;
    }
}
