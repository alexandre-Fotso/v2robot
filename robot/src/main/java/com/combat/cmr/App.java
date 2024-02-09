package com.combat.cmr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
            Robot rob1 = new Robot("bob1");
            System.out.println("bonjour " + rob1.getNom());
            Robot rob2 = new Robot("bob2");
            System.out.println("bonjour " + rob2.getNom() + rob1.toString()) ;


            Arena.fight(rob1, rob2);

            int val = rob1.getNbreVies();
            System.out.println( val ) ;

          
            
         
    }
}
