package com.combat.cmr;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.time.Instant;


import javax.print.DocFlavor.STRING;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    /**
     * Rigorous Test :-)
     */
   
    private static Robot robotUnderTest;
    private static Robot robotUnderTest1;
    private static Robot robotUnderTest2;
    private static Arena arenaUnderTest;
    private static Figter figterUnderTest;
    private static Instant startedAt ;

   
    

      
    @BeforeClass
        public static void intRobot () {
         robotUnderTest= new Robot("rob");  
            System.out.println("Appel de L'objet avant chaque test");
        }

        //*************************test de la  methode toString pour la class Robot ***************************** */
  
    @Test
    public void testToStringRobot ()
    {
        //ACT
       String result1 =   robotUnderTest.toString();
       //ASSERT
        assertEquals(result1, robotUnderTest.toString());    

    }

    //*************************test de la  methode toString pour la class Arena ***************************** */
    @BeforeClass
    public static void initArena () {
        arenaUnderTest = new Arena();  
        System.out.println("Appel de L'objet avant chaque test");
    }

    @Test 
    public void testToStringArena () 
    {
        //ACT
        String result2=   arenaUnderTest.toString();
        //ASSERT
        assertEquals(result2, arenaUnderTest.toString());

    }
//*************************test de la  methode toString pour la class Figter ***************************** */

    @Before
    public  void initFigter () {
       
        figterUnderTest = new Figter("Alexandre-Fotso" );  
        System.out.println("Appel de L'objet avant chaque test");
    }

    @Test 
    public void testToStringFigter () 
    {
        //ACT
        String result1=   figterUnderTest.toString();
        //ASSERT
        assertEquals(result1, figterUnderTest.toString());

    }

    @BeforeClass
    public static void initArenafight () {
        arenaUnderTest = new Arena();  
        robotUnderTest1 = new Robot("rob2");
        robotUnderTest2 = new Robot("rob2");
        System.out.println("Appel de L'objet avant chaque test");
    }
    public void testFire () {
        arenaUnderTest = new Arena();
        String result = robotUnderTest1.fire(robotUnderTest);
        assertEquals(result,robotUnderTest.fire(robotUnderTest));

    }
    @Test
    public void testFigter () {

        arenaUnderTest = new Arena();
        arenaUnderTest.fight(robotUnderTest1, robotUnderTest2);
        int val =  robotUnderTest2.getNbreVies(); 

        int result1 = 0; 
        assertEquals(result1, val );

    }
    @Test
    public void testNotDead () {
        robotUnderTest1 = new Robot("rob1");
        robotUnderTest2 = new Robot("rob2");

        arenaUnderTest.fight(robotUnderTest1, robotUnderTest);
        
       

        String result = "le robot " + robotUnderTest2.getNom() + "mort";
        

            assertEquals(result, robotUnderTest1.fire(robotUnderTest));
                



    }

    


  


}
