package com.Combat.CMR;


public class Main {
    public static void main(String[] args) {
        //*******creation of the first robot called bob ************//
        Robot rob1 = new Robot("D2R2");
            System.out.println("bonjour " +  rob1.getNom());
        //*******creation of the second robot called bob2 ************//
        Robot rob2 = new Robot("Data");
            System.out.println("bonjour " +  rob1.getNom());
//********effective combat of the two robots*****************//
        Arena.fight(rob1 , rob2);
    }
}