public interface Pile<E> {
    boolean isEmpty();
    E peek();
    E pop();
    void push(E e);
}
