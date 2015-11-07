package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class SqrtNoeud extends NoeudUnaire {
    public SqrtNoeud()
    {
        super("sqrt");
    }
    public double calcul()
    {
        return Math.sqrt(fils.calcul());
    }
}
