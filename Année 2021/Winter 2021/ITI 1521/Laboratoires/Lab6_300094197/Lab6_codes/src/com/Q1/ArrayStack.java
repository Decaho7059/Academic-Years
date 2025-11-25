package com.Q1;

public class ArrayStack<E> implements Stack<E> {
    /**
     * tableau de stockage des élémets dont on
     * aura besoin
     */
    private E[] tab;
    /**
     * première cellule libre du tableau tab
     */
    private int top ;

    /**
     * premier constructeur
     * @param size la taille du tableau
     */
    public ArrayStack(int size){
        tab = (E[])new Object[size];
        top = 0;

    }

    /**
     * renvoi vrai si la liste est vide
     * @return true
     */
    public boolean isEmpty() {
        return (top==0);
    }

    /**
     *  Renvoie l'élément supérieur de la pile sans le supprime
     * @return top
     */
    public E peek() {
        if (top==0) {
            return null;
        }
        return tab[top-1];
    }


    /**
     * Supprime et renvoie l'élément supérieur de cette pile
     * @return tab[i-1]
     */
    public E pop() {
        if (top==0){
            return null;
        }
        E item;
        item = tab[top-1];
        tab[top-1] = null;
        top--;
        return item;
    }

    /**
     * Place l'élément sur le dessus de cette pile
     * @param item item
     */
    public void push(E item) {
        if (!(top == tab.length)){
            tab[top++] = item;
        }
    }

    /**
     * Retire  tous les  éléments  de  cette  pile.
     * La  pile  sera  vide  suite  à  cet appe
     * @param item null
     */
    public void clear(E item) {
        for (int i = 0; i < tab.length ; i++) {
            tab[i] =null;
        }
        top=0;
    }
}
