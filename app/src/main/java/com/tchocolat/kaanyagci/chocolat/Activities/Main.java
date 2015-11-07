package com.tchocolat.kaanyagci.chocolat.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.tchocolat.kaanyagci.chocolat.R;
import com.tchocolat.kaanyagci.chocolat.Structures.AddNoeud;
import com.tchocolat.kaanyagci.chocolat.Structures.DivNoeud;
import com.tchocolat.kaanyagci.chocolat.Structures.EqNoeud;
import com.tchocolat.kaanyagci.chocolat.Structures.Feuille;
import com.tchocolat.kaanyagci.chocolat.Structures.Noeud;
import com.tchocolat.kaanyagci.chocolat.Structures.NoeudBinaire;
import com.tchocolat.kaanyagci.chocolat.Structures.NoeudUnaire;
import com.tchocolat.kaanyagci.chocolat.Structures.SubsNoeud;

public class Main extends Activity {

    private static Noeud res;
    private boolean start,first;
    private TextView ecran,clear_button,point_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        res = null;
        getActionBar().hide();
        start=true;
        first=true;
        setContentView(R.layout.activity_main);
        ecran = ((TextView)findViewById(R.id.ecran));
        clear_button = ((TextView)findViewById(R.id.clean_button));
        point_button = ((TextView)findViewById(R.id.point_button));


    }

    private boolean checkZero()
    {
        return ecran.getText().toString().equals("0");
    }
    private double getEcran()
    {
        return Double.parseDouble(ecran.getText().toString());
    }
    private int getButtonValue(View v)
    {
        return Integer.parseInt(((TextView) v).getText().toString());
    }
    //Private functions
    public void showNumber (View v)
    {
        if (res != null)
        {
            clear_button.setText("AC");
        }
       if (first) {
           //Si l'écran est 0
            ecran.setText("" + getButtonValue(v));
           if (res == null) {
               //Si ce n'est pas le 1er chiffre
               clear_button.setText("C");
           }
       }
       else {
           ecran.setText(""+ecran.getText().toString()+getButtonValue(v));
       }
        first=false;
    }

    public void showPoint(View v)
    {
        ecran.setText(ecran.getText().toString()+".");
        first=false;
        point_button.setClickable(false);

    }


    public void addition(View v) {
        if (res == null) {
            //Si il n'y a pas de noeud d'avant ça
            //On stocke le numéro affiche sur l'écran dans une feuille
            res = new Feuille(getEcran());
            //On crée un noeud d'addition
            AddNoeud an = new AddNoeud();
            //On met la feuille à noeud gauche
            an.setNg(res);
            //On change le res avec le noeud d'addition
            res = an;
        }
        else
        {
            //Si il y a déjà un noeud
            if (res.hasPlace())
            {
                //Si il y a encore la place dans res
                //On met la feuille de l'écran dans res
                if (res instanceof NoeudBinaire)
                {
                    ((NoeudBinaire)res).setNd(new Feuille(getEcran()));
                }
                else
                {
                    ((NoeudUnaire)res).setFils(new Feuille(getEcran()));
                }
                //On le calcul
                double resultat = res.calcul();
                //On met ce numéro sur l'écran
                ecran.setText(""+resultat);
                //On crée un nouveau noeud d'addition
                AddNoeud an = new AddNoeud();
                //On met le res comme son noeud gauche
                an.setNg(new Feuille(resultat));
                //On change le res avec ce noeud d'addition
                res = an;
            }
        }
        first = true;
    }
    public void division(View v) {
        if (res == null) {
            //Si il n'y a pas de noeud d'avant ça
            //On stocke le numéro affiche sur l'écran dans une feuille
            res = new Feuille(getEcran());
            //On crée un noeud d'addition
            DivNoeud an = new DivNoeud();
            //On met la feuille à noeud gauche
            an.setNg(res);
            //On change le res avec le noeud d'addition
            res = an;
        }
        else
        {
            //Si il y a déjà un noeud
            if (res.hasPlace())
            {
                //Si il y a encore la place dans res
                //On met la feuille de l'écran dans res
                if (res instanceof NoeudBinaire)
                {
                    ((NoeudBinaire)res).setNd(new Feuille(getEcran()));
                }
                else
                {
                    ((NoeudUnaire)res).setFils(new Feuille(getEcran()));
                }
                //On le calcul
                double resultat = res.calcul();
                //On met ce numéro sur l'écran
                ecran.setText(""+resultat);
                //On crée un nouveau noeud d'addition
                DivNoeud an = new DivNoeud();
                //On met le res comme son noeud gauche
                an.setNg(new Feuille(resultat));
                //On change le res avec ce noeud d'addition
                res = an;
            }
        }
        first = true;
    }
    public void minus(View v) {
        if (res == null) {
            //Si il n'y a pas de noeud d'avant ça
            //On stocke le numéro affiche sur l'écran dans une feuille
            res = new Feuille(getEcran());
            //On crée un noeud d'addition
            SubsNoeud an = new SubsNoeud();
            //On met la feuille à noeud gauche
            an.setNg(res);
            //On change le res avec le noeud d'addition
            res = an;
        }
        else
        {
            //Si il y a déjà un noeud
            if (res.hasPlace())
            {
                //Si il y a encore la place dans res
                //On met la feuille de l'écran dans res
                if (res instanceof NoeudBinaire)
                {
                    ((NoeudBinaire)res).setNd(new Feuille(getEcran()));
                }
                else
                {
                    ((NoeudUnaire)res).setFils(new Feuille(getEcran()));
                }
                //On le calcul
                double resultat = res.calcul();
                //On met ce numéro sur l'écran
                ecran.setText(""+resultat);
                //On crée un nouveau noeud d'addition
                SubsNoeud an = new SubsNoeud();
                //On met le res comme son noeud gauche
                an.setNg(new Feuille(resultat));
                //On change le res avec ce noeud d'addition
                res = an;
            }
        }
        first = true;
    }
    public void equals(View v) {
        if (res == null) {
            //Si il n'y a pas de noeud d'avant ça
            //On stocke le numéro affiche sur l'écran dans une feuille
            res = new Feuille(getEcran());
            //On crée un noeud d'addition
            EqNoeud an = new EqNoeud();
            //On met la feuille à noeud gauche
            an.setFils(res);
            //On change le res avec le noeud d'addition
            res = an;
        }
        else
        {
            //Si il y a déjà un noeud
            if (res.hasPlace())
            {
                //Si il y a encore la place dans res
                //On met la feuille de l'écran dans res
                if (res instanceof NoeudBinaire)
                {
                    ((NoeudBinaire)res).setNd(new Feuille(getEcran()));
                }
                else
                {
                    ((NoeudUnaire)res).setFils(new Feuille(getEcran()));
                }
                //On le calcul
                double resultat = res.calcul();
                //On met ce numéro sur l'écran
                ecran.setText(""+resultat);
                //On crée un nouveau noeud d'addition
                EqNoeud an = new EqNoeud() ;
                //On met le res comme son noeud gauche
                an.setFils(new Feuille(resultat));
                //On change le res avec ce noeud d'addition
                res = an;
            }
        }
        first = true;
    }
    public void clear(View v)
    {
        if (((TextView)v).getText().toString().equals("C"))
        {
            ecran.setText("0");
        }
        else
        {
           res = null;
            first = true;
            clear_button.setText("C");
        }
    }

}
