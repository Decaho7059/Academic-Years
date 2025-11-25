import java.lang.Math;

public class TicTacToe {

    public static int row = 3;
    public static int col = 3;

    public static final String X = "x";
    public static final String O = "o";

    private String[][] matrix = new String[row][col];
    private int size = 0;

    public TicTacToe() {}

    public TicTacToe(TicTacToe t) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                this.matrix[i][j] = t.matrix[i][j];
            }
        }
        this.size = t.size;
    }

    public void add(String xo) {
        // null null null size 0
        // null null null
        // null null null
        // add o
        //  o 	null null size 1
        // null null null
        // null null null
        // add x
        //  o 	 x 	 null size 2
        // null null null
        // null null null
        // add o
        //  o 	 x 	 o 	  size 3
        // null null null
        // null null null
        // add x
        //  o 	 x 	  o   size 4
        //  x 	null null
        // null null null
        // System.out.println("before");
        // print();
        this.matrix[size/row][size%col] = xo;
        // System.out.println("after");
        // print();
        size++;
    }

    public boolean isFull() {
        if (size == 9) {
            System.out.println();
        }
        return size == row*col;
    }

    public boolean isValid() {
        // x <= ceil(row*col/2) Math.ceil(4.5) 5
        // o <= ceil(row*col/2) Math.ceil(4.5) 5
        return occurence(matrix, TicTacToe.X) <= Math.ceil((double)row*col/2) && occurence(matrix, TicTacToe.O) <= Math.ceil((double)row*col/2);
    }

    private static int occurence(String[][] matrix, String elem) {
        int counter = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if (matrix[i][j] != null && matrix[i][j].equals(elem)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void print() {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe tc = new TicTacToe();

        tc.add("x");
        tc.print();
        tc.add("x");
        tc.print();
        tc.add("x");
        tc.print();
        tc.add("o");
        tc.add("o");
        tc.add("o");
        tc.add("o");
        tc.add("x");
        tc.add("x");
        tc.print();


        System.out.println(tc.isFull());
        System.out.println(tc.isValid());
    }
}
