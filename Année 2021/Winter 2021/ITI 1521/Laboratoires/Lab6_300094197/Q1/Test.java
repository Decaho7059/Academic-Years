package Q1;

public class Test {
    public static void main(String[] args) {
        /**
         * cree un objet de type arrayStack
         */
        ArrayStack<String> list= new ArrayStack(10);

        /**
         * Empiler la pile avec 10 éléments
         */
        list.push("0");
        list.push("2");
        list.push("4");
        list.push("6");
        list.push("8");
        list.push("10");
        list.push("12");
        list.push("14");
        list.push("16");
        list.push("18");

        /**
         * Vider complètement la pile
         */
        list.clear(list.peek());

        /**
         * Empiler à nouveau la pile avec 10 éléments
         */
        list.push("0");
        list.push("2");
        list.push("4");
        list.push("6");
        list.push("8");
        list.push("10");
        list.push("12");
        list.push("14");
        list.push("16");
        list.push("18");

        /**
         * Dépiler la pile en affichant
         */
        while(!list.isEmpty()){
            System.out.println("Second time :"+list.pop());
        }
    }
}

