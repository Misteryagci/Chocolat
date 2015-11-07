package com.tchocolat.kaanyagci.chocolat.Structures;

/**
 * Created by kaanyagci on 06/11/15.
 */
public abstract class NoeudUnaire extends Noeud<String> {
    protected Noeud fils;

    public NoeudUnaire (String v){
        super(v);
        fils=null;
    }

    public void setFils(Noeud n)
    {
        fils = n;
    }

    public boolean hasPlace()
    {
        return fils==null;
    }

    public void add (Noeud n)
    {
        if (fils == null)
        {
            fils = n;
        }
    }
}
