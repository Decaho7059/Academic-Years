import java.util.ArrayList;


public class ArrayListQueue<E> implements Queue<E> {

    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E o) {
        list.add(o);
    }

    public E dequeue() {
        return list.remove(0);
    }

    public static void main(String[] args) {
        ArrayListQueue<TicTacToe> candidate = new ArrayListQueue<TicTacToe>();
        ArrayListQueue<TicTacToe> solutions = new ArrayListQueue<TicTacToe>();

        candidate.enqueue(new TicTacToe());
        TicTacToe temp, c1, c2;

        while(!candidate.isEmpty()) {
            temp = candidate.dequeue();
            // temp.print();
            // System.out.println(temp.isFull());
            // System.out.println(temp.isValid());
            if(temp.isFull()) {
                if(temp.isValid()) {
                    solutions.enqueue(temp);
                }
            } else {
                c1 = new TicTacToe(temp);
                c2 = new TicTacToe(temp);

                c1.add(TicTacToe.X);
                c2.add(TicTacToe.O);

                if(c1.isValid()) {
                    candidate.enqueue(c1);
                }
                if(c2.isValid()) {
                    candidate.enqueue(c2);
                }
            }
        }

        while(!solutions.isEmpty()) {
            solutions.dequeue().print();
            System.out.println();
        }

    }

}
