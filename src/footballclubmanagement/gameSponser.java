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
public class gameSponser extends sponser implements contractPaper {

    public gameSponser(ArrayList<sponserAgent> slist) {
        super(slist);
    }

    void assignSponser() {
        Scanner sc = new Scanner(System.in);

        Bid();
        System.out.println("Now Game Sponser of our team is:" + getCompanyName());
        System.out.println("Enter Duration years of contract:");
        int year = sc.nextInt();

        setCompanyContract(year);
        System.out.println("Thanks");
    }

    void extraSalary(ArrayList<players> p, int jersey, int goal) {
        for (players pl : p) {
            if (pl.getJerseyNumber() == jersey && goal == 1) {
                System.out.println(pl.getGoal() + "get bonus for his" + goal + "classical goals");
                System.out.println("AMount is:" + pl.getSalary() * 0.2);

            } else if (pl.getJerseyNumber() == jersey && goal > 1) {
                System.out.println(pl.getGoal() + "get bonus for his" + goal + "classical goals");
                System.out.println("AMount is:" + pl.getSalary() * 0.3);

            }

        }

    }

    public void renewContract(admin a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getCompanyName() + "Wants to his renew Contracts");

        String name = getCompanyName() + "Wants to his renew Contracts";
        if (a.checkClubAgentMassage(name).equalsIgnoreCase("YES") || a.checkClubAgentMassage(name).equalsIgnoreCase("AGGREE")) {
            System.out.println("We are  interested\nThanks");
            System.out.println("Enter new Duration years:");
            int year = sc.nextInt();
            sc.nextInt();
            int b = getCompanyContract();

            setCompanyContract(year);

            System.out.println(getCompanyName() + "Contract is updated to" + b + "to" + getCompanyContract());

        } else {
            System.out.println("We are not interested\nThanks");
            System.out.println("New Sponer Bid starts now");
            assignSponser();
        }

    }

    public void cancelContract(admin a) {
        System.out.println(getCompanyName() + "Wants to his renew Contracts");

        String name = getCompanyName() + "Wants to his renew Contracts";
        if (a.checkClubAgentMassage(name).equalsIgnoreCase("YES") || a.checkClubAgentMassage(name).equalsIgnoreCase("AGGREE")) {
            System.out.println("Your contract is successfully Cancel\nThanks");
            System.out.println("New Sponer Bid starts now");
            assignSponser();
        } else {
            System.out.println("We are not interested\nThanks");
        }

    }

}
