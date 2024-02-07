package com.Combat.CMR;

import java.security.PrivateKey;

//************* CREATION DE LA CLASS ROBOT ************************///
public class Robot {
        private String  nom ;
        private int nbreVies = 10 ;

    //************* CREATION DU CONSTRUCTEUR LA CLASS ROBOT ************************///
    public Robot(String nom) {
        this.nom = nom;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbreVies(int nbreVies) {
        this.nbreVies = nbreVies;
    }

    public String getNom() {
        return " Robot " + nom;
    }

    public int getNbreVies() {
        return nbreVies;
    }
    //************* methode fight qui permet a un rob de tirer ************************///
    
    public void fire (Robot rob) {
        System.out.println("le robot " + this.getNom() + "va tirer");
        rob.setNbreVies(this.getNbreVies() - 2);
        System.out.println("le robot " + rob.getNom() + "a ete touche pas le robot " + this.getNom() + "bar !!");
    }
    public void isDead () {
        if (this.nbreVies < 0) {
            System.out.println("il est mort");
        } else  {
            System.out.println("il n'est pas mort");
        }
    }


}
