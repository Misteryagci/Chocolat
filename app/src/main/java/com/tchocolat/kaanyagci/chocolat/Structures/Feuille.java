package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class Feuille extends Noeud<Double>{
    public Feuille (double d)
    {
        super (d);
    }
    public double calcul(){
        return super.getContent().doubleValue();
    }

    public boolean hasPlace()
    {
        return false;
    }
    public void add(Noeud n)
    {

    }
}
