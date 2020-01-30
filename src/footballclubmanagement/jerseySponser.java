package footballclubmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
public class jerseySponser extends sponser {

    public jerseySponser(ArrayList<sponserAgent> slist) {
        super(slist);
    }

    void assignSponser() {
       Bid();
       System.out.println("Now Jersey Sponser of our team is:"+getCompanyName());
    }
    void offerNewJersey(admin a){
        System.out.println("Our Team is Upto Date");
        System.out.println(getCompanyName()+"Offer new JErsey");
        String name=getCompanyName()+"Offer new JErsey";
        if(a.checkClubAgentMassage(name).equalsIgnoreCase("YES")|| a.checkClubAgentMassage(name).equalsIgnoreCase("AGGREE")){
            System.out.println("We are  interested\nThanks");
                        
        }
        else
            System.out.println("We are not interested\nThanks");
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
