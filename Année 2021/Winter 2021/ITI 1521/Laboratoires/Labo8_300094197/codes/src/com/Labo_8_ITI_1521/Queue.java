package com.Labo_8_ITI_1521;

public interface Queue<E> {
     void enqueue( E obj );
     E dequeue();
     boolean isEmpty();
     int size();
}
