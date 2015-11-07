package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public class AddNoeud extends NoeudBinaire {
    public AddNoeud ()
    {
        super("+");
    }
    public double calcul()
    {
        System.out.println(ng.toString()+this.toString()+nd+toString());
        return ng.calcul()+nd.calcul();
    }
}
