package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class SubsNoeud extends NoeudBinaire {
    public SubsNoeud ()
    {
        super ("-");
    }
    public double calcul()
    {
        return ng.calcul()-nd.calcul();
    }
}
