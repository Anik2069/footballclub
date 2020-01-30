package footballclubmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class FootballClubManagement {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<players> alist = new ArrayList<>();
        ArrayList<playersAgents> plist = new ArrayList<>();

        AttackingPlayers a1 = new AttackingPlayers("Neymar Jr", 26, "01989555656", 10, 700000, 90, 110, 103, 12, 5);
        alist.add(a1);
        admin a = new admin();
        fanFollowers f = new fanFollowers("Ashik", "Bangladesh");
        clubAgent cAgent = new clubAgent("Shuvo", 30, "contractNumber", 1000, 5);
        playersAgents pAgent = new playersAgents("Anik", 30, "contractNumber", 1000, 5, 10);
        playersAgents pAgent1 = new playersAgents("Anik", 30, "contractNumber", 1000, 5, 10);

        plist.add(pAgent);
        for (players pl : alist) {
            pl.p = plist;
        }

        goalkeeper g = new goalkeeper("Allison", 25, "contractNumber", 60, 60000, 0, 0, 60, 90, 12, 2);

        medicineStuff mStuff = new medicineStuff("Dr.Anik", 60, "contractNumber", 4, 44000, "Medical");

        coachingStuff cStuff = new coachingStuff("Tite", 56, "contractNumber", 5, 1000000, "Head Coach");

        sponserAgent s1 = new sponserAgent("Addidas", "Shuvo", 30, "contractNumber", 1000, 5);
        sponserAgent s2 = new sponserAgent("Nike   ", "Anik", 30, "contractNumber", 1000, 5);
        ArrayList<sponserAgent> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        jerseySponser s = new jerseySponser(sList);
        gameSponser s4 = new gameSponser(sList);
        commercialSponser s3 = new commercialSponser(sList);
        
        

        
        uppcominggoalkeepers ug1=new uppcominggoalkeepers(80,"de gea","mu united",80,3000000);
        uppcominggoalkeepers ug2=new uppcominggoalkeepers(80,"allison","as roma",95,8000000);
       uppcominggoalkeepers ug3=new uppcominggoalkeepers(80,"weverton","mancity",75,4000000);
       uppcominggoalkeepers ug4=new uppcominggoalkeepers(80,"ederson","barceloana",70,3000000);
        ArrayList<uppcominggoalkeepers>uglist=new ArrayList<uppcominggoalkeepers>();
        uglist.add(ug1);
        uglist.add(ug2);
        uglist.add(ug3);
        uglist.add(ug4);
       // f1.showdgoalkeepername(uglist);
        
        
        
        
        uppcomingmidfielder um1=new uppcomingmidfielder(85,"modric","realmadrid",20,3000000);
        uppcomingmidfielder um2=new uppcomingmidfielder(85,"aurther","as roma",15,4000000);
      uppcomingmidfielder um3=new uppcomingmidfielder(85,"casemiro","realmadrid",90,8000000);
       uppcomingmidfielder um4=new uppcomingmidfielder(85,"paulinho","barceloana",85,7000000);
        ArrayList<uppcomingmidfielder>umlist=new ArrayList<uppcomingmidfielder>();
        umlist.add(um1);
        umlist.add(um2);
        umlist.add(um3);
        umlist.add(um4);
      //  f1.showdgoaluppcomingmidfielder(umlist);


        
managingDirector mDirector=new managingDirector("Shohan", "1234", "contactno", "emailaddress");
        int i = 0;
        while (i < 10) {
            System.out.println("\t\t\tWelcomee to PSG Football Club");
            System.out.println("A.Admin\nB.Players\nC.Agents\nD.Stuff\nE.Sponser\nF.Fan & Followers\nG.Upper Managements");
            System.out.println("Enter Yours Choice:");
            System.out.println("");
            String n = sc.nextLine();

            switch (n) {
                case "A":
                    System.out.println("Update Goal");
                    a.updateGoals(10, alist, 1, 1);
                    System.out.println("Check pLayers");
                    a.checkPlayers(alist);
                    System.out.println("Make Schdule");
                    a.matchSchdule();
                    System.out.println("make fans & pLayers notification");
                    a.givaFanNotification();
                    break;
                case "B":
                    System.out.println("Players Get Bonus");
                    a1.getBonus();
                    System.out.println("Renew Contract");
                    a1.renewContract(a);
                    System.out.println("Cancel Contract");
                    a1.cancelContract(a);

                    break;
                case "C":
                    System.out.println("send a players for some times");
                    cAgent.loanPlayer(alist, 10);
                    System.out.println(" Commercial contract");
                    cAgent.contractCommercial();
                    System.out.println("Arrage friendly match");
                    cAgent.arrangeFriendlyMatch(a);
                    System.out.println("Contract with another team");
                    pAgent.contractwihotherteams(alist, 10);
                    System.out.println("Confirms adds");
                    s1.confirmsAdd(alist, 10);
                    break;
                case "D":
                    System.out.println("Update fitness");

                    mStuff.updateFitness(alist, 12);
                    System.out.println("inform admin");
                    mStuff.informadmin(alist);
                    System.out.println("checking Statis");
                    cStuff.checkStatistic(alist);
                    break;
                case "E":System.out.println("Extra Salary");
                s4.extraSalary(alist, 10, 2);
                    System.out.println("select sponser");
                    s3.assignSponser();
                    System.out.println("new Jersey");
                    s.offerNewJersey(a);
                    break;
                case "F":
                    System.out.println("Check schdulle & message");
                    f.checkSchdule();
                    f.checkNotification();
                    break;
                case "G":
                    System.out.println("Upcomming players");
                   
                    mDirector.showdgoalkeepername(uglist);
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}
