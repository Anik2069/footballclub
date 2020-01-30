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
public class clubAgent extends agent{

    public clubAgent(String name, int age, String contractNumber, double salary, int contractDuration) {
        super(name, age, contractNumber, salary, contractDuration);
    }
    void arrangeFriendlyMatch(admin a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Friendly Match offer to admin:");
        String aa=sc.nextLine();
        if(a.checkClubAgentMassage(aa).equalsIgnoreCase("YES")|| a.checkClubAgentMassage(aa).equalsIgnoreCase("AGGREE")){
            System.out.println("Contract With oppsiton team for match");
                        
        }
        else
            System.out.println("We are not interested");
    }
    void loanPlayer(ArrayList<players> plist,int jersey){
        for(players p1:plist){
             for(playersAgents pp:p1.p){
            if(p1.getJerseyNumber()==jersey && pp.getPlayerNo()==jersey){
               
                System.out.println(pp.getName()+"Confirms"+p1.getName()+"Can  Play another team for 1 month");;
                }
                }
            
        }
        
        
    }

    void contractCommercial(){
        System.out.println("Contract With Comercial agent");
    }
}
