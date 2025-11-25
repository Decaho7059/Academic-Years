public class ListePile<E> implements Pile<E>{

    private Elem<E> top;

    private class Elem<E> {
        private E valeur;
        private Elem suivant;

        public Elem(E valeur, Elem suivant){
            this.valeur = valeur;
            this.suivant = suivant;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public E peek(){
        return top.valeur;
    }

    public E pop(){
        E e = top.valeur;
        top = top.suivant;
        return e;
    }

    public void push(E e){
        Elem<E> nouvelElem = new Elem<>(e, top);
        top = nouvelElem;
    }

    public E test(E e){
        return e;
    }
}
