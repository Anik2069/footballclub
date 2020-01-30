/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
public class goalkeeper extends players implements contractPaper{
    private int saveGoal;
    public goalkeeper(String name, int age, String contractNumber, int jerseyNumber, double salary, int goal, int assist, int totalMatch,int savegoal,double fitness,int contractDuration) {
        super(name, age, contractNumber, jerseyNumber, salary, goal, assist, totalMatch,fitness,contractDuration);
        saveGoal=savegoal;
    }
    void getBonus(){
        double saving=saveGoal/getTotalMatch()*100;
        if(saving>=80.00){
            System.out.println(getName()+"get bonus"+(getSalary()*0.3));
        }
    }
    public void renewContract(admin a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getName() + "Wants to his renew Contracts");

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
