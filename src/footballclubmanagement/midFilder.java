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
public class midFilder extends players implements contractPaper{
private int pass;
    public midFilder(String name, int age, String contractNumber, int jerseyNumber, double salary, int goal, int assist, int totalMatch, double fitness, int contractDuration,int pass) {
        super(name, age, contractNumber, jerseyNumber, salary, goal, assist, totalMatch, fitness, contractDuration);
    this.pass=pass;
    }

 
    void getBonus() {
        if ((pass / getTotalMatch()) > 80) {
            System.out.println(getName() + "Bonus amount is" + (getSalary() * 0.4));
        } else {
            System.out.println("No Bonus");
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
