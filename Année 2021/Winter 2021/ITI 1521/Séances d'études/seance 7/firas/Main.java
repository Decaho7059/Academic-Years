public class Main {

    public static void main(String[] args) {
        Stack<String> stringStack = new LinkedStack<>();

//        stringStack.push("A");
//        stringStack.push("B");
//        stringStack.push("C");
//        stringStack.push("D");

        System.out.println(stringStack.peek());
        System.out.println(stringStack.peek());

        while (!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
        }
    }
}
