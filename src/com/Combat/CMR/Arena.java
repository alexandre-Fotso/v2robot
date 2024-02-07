package com.Combat.CMR;

public class Arena {
                    public static void fight (Robot rob1 , Robot rob2) {
            while (rob1.getNbreVies() > 0  && rob2.getNbreVies() >0 ) {
                rob1.fire(rob2);
                if (rob2.getNbreVies() == 0) {
                    System.out.println("le robot" + rob1.getNom() + "a gagne le match");
                    break;
                }
                rob2.fire(rob1);
                if (rob1.getNbreVies() == 0) {
                    System.out.println("le robot" + rob2.getNom() + "a gagne le match");
                    break;
                }
            }
        }

}
