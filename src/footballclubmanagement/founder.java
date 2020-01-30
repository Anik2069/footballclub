/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
public class founder extends upperManagements{

    public founder(String name, String id, String contactno, String emailaddress) {
        super(name, id, contactno, emailaddress);
    }
   void checkPlayers(ArrayList<players> pList){
        System.out.println("Players Name\t\t\tGoals\t\t\tJersey No\t\t\tAsist");
        for(players p:pList){
            System.out.println(p.getName()+"\t\t\t"+p.getGoal()+"\t\t\t"+p.getJerseyNumber()+"\t\t\t"+p.getAssist());  
        }
        
    }
    void updateStadium(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want update your Stadium:");
        String a=sc.nextLine();
        if(a.equalsIgnoreCase("Yes")){
            System.out.println("Contract with civil engineers");
        }
        
    }
}
