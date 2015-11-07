package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public abstract class Noeud<T> {
    private T content;


    public Noeud (T c) {
        content = c;
    }
    public T getContent()
    {
        return content;
    }

    public abstract double calcul();
    public abstract boolean hasPlace();
    public abstract void add (Noeud n);
}
