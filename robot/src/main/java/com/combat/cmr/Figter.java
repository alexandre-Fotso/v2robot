package com.combat.cmr;
import java.util.Random;

public class Figter extends Robot{
   // private int seed ;

    
    public Figter(String nom ) {
       
        super(nom); 
        //this.seed = randomNumberSeed ;
       
        //TODO Auto-generated constructor stub
    }

    /********************* methode boolean*************************/
    public static void fire (   Figter fotso , Robot rob) {
         
        Random objGenerator = new Random();
       
            while (fotso.getNbreVies() > 0 && rob.getNbreVies() >0 ) {
              //  System.out.println("Humain " + fotso.getNom() + "va tire");
                boolean randomBoolean = objGenerator.nextBoolean();
                        if (randomBoolean == false ) {
                            System.out.println("l'humain " + rob.getNom() + "a ete touche");
                            fotso.fire(rob);
                            if (rob.getNbreVies() == 0) {
                                System.out.println(" l'humain " +  fotso.getNom() + " a gagner"); 
                            }

                        }else {
                            System.out.println("tire du robot " +  rob.getNom()  ); 
                            rob.fire(fotso);
                            if (fotso.getNbreVies() == 0) {
                                System.out.println("le robot  " +  rob.getNom() + " a gagner le combat"); 
                            }
                        }
                       
                   
            }
        
    }
    public String  toString() {
        return "J'ai herite de la class robot et je simule le combat entre humain et robot le nom the humain est " + this.getNom() ;
     }
    
}
