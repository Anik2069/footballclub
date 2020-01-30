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
public class coachingStuff extends stuff{

    public coachingStuff(String name, int age, String contractNumber, int contractDuration, double salary, String department) {
        super(name, age, contractNumber, contractDuration, salary, department);
    }
    void checkStatistic(ArrayList<players> plist){
        System.out.println("Players Name\t\t\tGoal\t\t\tJerSey No\t\t\tFitness");
        for(players p:plist){
            System.out.println(p.getName()+"\t\t\t"+p.getGoal()+"\t\t\t"+p.getJerseyNumber()+"\t\t\t\t"+p.getFitness());
        }
    }
    public void renewContract(admin a) {
        Scanner sc = new Scanner(System.in);

        String name = getName() + "Wants to his renew Contracts";
        if (a.checkClubAgentMassage(name).equalsIgnoreCase("YES") || a.checkClubAgentMassage(name).equalsIgnoreCase("AGGREE")) {
            System.out.println("We are  interested\nThanks");
            System.out.println("Enter new Duration years:");
            int year = sc.nextInt();
            sc.nextInt();
            int b=getContractDuration();
            
            setContractDuration(year);
                    
            System.out.println(getName()+"Contract is updated to"+b+"to"+getContractDuration());

        } else {
            System.out.println("We are not interested\nThanks");
        }

    }

    public void cancelContract(admin a) {
        System.out.println(getName() + "Wants to his renew Contracts");

        String name = getName() + "Wants to his renew Contracts";
        if (a.checkClubAgentMassage(name).equalsIgnoreCase("YES") || a.checkClubAgentMassage(name).equalsIgnoreCase("AGGREE")) {
            System.out.println("Your Can be transfer from our team\nThanks");
           
        } else {
            System.out.println("We are not interested\nThanks");
        }

    
}
}