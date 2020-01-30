/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.util.ArrayList;

/**
 *
 * @author C Bazaar
 */
public class managingDirector extends upperManagements{

    public managingDirector(String name, String id, String contactno, String emailaddress) {
        super(name, id, contactno, emailaddress);
    }
    
    public void showstrikername(ArrayList<upcomingstriker> ulist) {
        System.out.println("new strikers information for upcoming season are:\n");
        for (upcomingstriker u : ulist) {
            System.out.println("\n\nstrikername:" + u.getName() + "\tpreviousclub:" + u.getPreviousclub() + "\tgoalno:" + u.getGoalno() + "\tpassacuray:" + u.getPassacuray() + "\tsellmoney:" + u.getSellmoney());
        }
    }

    public void showdefendername(ArrayList<uppcomingdefender> ulist) {
        System.out.println("\n\nnew defender information for upcoming season are:\n");
        for (uppcomingdefender u : ulist) {
            System.out.println("\n\ndefenderername:" + u.getName() + "\tpreviousclub:" + u.getPreviousclub() + "\tgoalno:" + u.getGoalno() + "\tpassacuray:" + u.getDefendacuray() + "\tsellmoney:" + u.getSellmoney());
        }
    }

    public void showdgoalkeepername(ArrayList<uppcominggoalkeepers> ulist) {
        System.out.println("\n\nnew goalkeeper information for upcoming season are:\n");
        for (uppcominggoalkeepers u : ulist) {
            System.out.println("\n\ngoalkeepername:" + u.getName() + "\tpreviousclub:" + u.getPreviousclub() + "\tgoal saves::" + u.getGoalsaves() + "\tsellmoney:" + u.getSellmoney());
        }
    }

    public void showdgoaluppcomingmidfielder(ArrayList<uppcomingmidfielder> ulist) {
        System.out.println("new midfielder information for upcoming season are:\n");
        for (uppcomingmidfielder u : ulist) {
            System.out.println("\n\ngoalkeepername:" + u.getName() + "\tpreviousclub:" + u.getPreviousclub() + "\tgoalno:" + u.getGoalno() + "\tpassacuray:" + u.getPassacuray() + "\tsellmoney:" + u.getSellmoney());
        }
    }

}
