package com.combat.cmr;

import java.io.PrintStream;

public class Robot {

  

   private String nom;
   private int nbreVies;

   public Robot(String nom) {
      this.nom = nom;
      this.nbreVies = 10;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public void setNbreVies(int nbreVies) {
      this.nbreVies = nbreVies;
   }

   public String getNom() {
      return   this.nom;
   }

   public int getNbreVies() {
      return this.nbreVies;
   }

   public String fire (Robot rob) {
     if ( rob.isDead() == true) {
         return "le robot " + rob.getNom() + "mort";

     }else {
      System.out.println("le robot " + this.getNom() + "va tirer");
      rob.setNbreVies(this.getNbreVies() - 2);
      PrintStream var10000 = System.out;
      String var10001 = rob.getNom();
       return"le robot " + var10001 + "a ete touche pas le robot " + this.getNom() + "bar !!";

     }
      
   }

   public boolean isDead() {
      if (this.nbreVies == 0) {
        System.out.println("le robot  " + this.nom +  "mort");
         return true;

      } else {
         System.out.println("le robot " + this.nom + "nest pas mort mort");
         return false;

      }

   }

   public String  toString() {
      return "je suis un Robot appele" + this.getNom() + "avec pour nbre de vie " + this.getNbreVies() ;
   }
}

    

