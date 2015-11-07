package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class DivNoeud extends NoeudBinaire {
    public DivNoeud ()
    {
        super ("/");
    }
    public double calcul()
    {
        return ng.calcul()/nd.calcul();
    }
}
