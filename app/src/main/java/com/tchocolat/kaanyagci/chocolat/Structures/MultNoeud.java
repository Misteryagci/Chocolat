package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class MultNoeud extends NoeudBinaire {
    public MultNoeud ()
    {
        super("x");
    }
    public double calcul()
    {
        return ng.calcul()*nd.calcul();
    }
}
