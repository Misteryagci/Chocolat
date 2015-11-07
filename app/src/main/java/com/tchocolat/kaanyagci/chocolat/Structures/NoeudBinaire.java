package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public abstract class NoeudBinaire extends Noeud<String>{

    protected Noeud ng;
    protected Noeud nd;
    public NoeudBinaire(String c)
    {
        super(c);
        ng = null;
        nd = null;
    }
    public void setNg(Noeud n) {
        ng  = n;
    }
    public void setNd(Noeud n){
        nd = n;
    }
    public void add(Noeud n)
    {
        if (ng == null)
        {
            nd=n;
        }
        else
        {
            ng=n;
        }
    }

    public Noeud getNg()
    {
        return ng;
    }

    public Noeud getNd()
    {
        return nd;
    }
    public boolean hasPlace()
    {
        return (ng == null) || (nd == null);
    }

}
