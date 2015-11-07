package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class EqNoeud extends NoeudUnaire {
    public EqNoeud()
    {
        super("=");
    }
    public double calcul()
    {
        return fils.calcul();
    }
}
