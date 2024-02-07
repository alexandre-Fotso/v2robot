package com.combat.cmr;

import java.io.PrintStream;

public class Robot {

  

   private String nom;
   private int nbreVies = 10;

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
      return " Robot " + this.nom;
   }

   public int getNbreVies() {
      return this.nbreVies;
   }

   public void fire(Robot rob) {
      System.out.println("le robot " + this.getNom() + "va tirer");
      rob.setNbreVies(this.getNbreVies() - 2);
      PrintStream var10000 = System.out;
      String var10001 = rob.getNom();
      var10000.println("le robot " + var10001 + "a ete touche pas le robot " + this.getNom() + "bar !!");
   }

   public void isDead() {
      if (this.nbreVies < 0) {
         System.out.println("il est mort");
      } else {
         System.out.println("il n'est pas mort");
      }

   }
}

    

