import java.util.EmptyStackException;

public class LinkedStack<E> implements Stack<E> {

    private static class Elem<T> {
        private T value;
        private Elem<T> next;

        private Elem(T value, Elem<T> next){
            this.value = value;
            this.next = next;
        }
    }

    private Elem<E> top;

    public boolean isEmpty(){
        return top == null;
    }

    public E peek(){
        if(top == null){
            return null;
        }
        return top.value;
    }

    public E pop(){
        E value = top.value;
        top = top.next;
        return value;
    }

    public void push(E e){
        top = new Elem<>(e, top);
    }
}
