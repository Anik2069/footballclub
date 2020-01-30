
package footballclubmanagement;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;


public class admin {

    private String name;
    private String contractNumber;
    private double salary;

    public admin(String name, String contractNumber, double salary) {
        this.name = name;
        this.contractNumber = contractNumber;
        this.salary = salary;
    }

    public admin() {
    }
    
    
    
    
    Scanner sc = new Scanner(System.in);

    void updateGoals(int jersery, ArrayList<players> alist, int goal, int asist) {
        for (players a : alist) {
            if (a.getJerseyNumber() == jersery) {
                a.setGoal(goal);
                a.setSeasonGoal(goal);
                a.setTotalMatch(1);
                a.setSeasonPlayingMatch(1);
                a.setAssist(asist);
                 System.out.println(a.getName()+"'s Record is Updated");
            }

        }
       
            
    }

    void assignAgent(ArrayList<players> plist) {
        for (players pl : plist) {
            for (playersAgents n : pl.p) {
                if (n.getPlayerNo() == pl.getJerseyNumber()) {
                    String a = pl.getName();
                    n.setPlayerName(a);
                    System.out.println((n.getName()) + "Assign for " + pl.getName() + " Agents");
                }
            }
        }
    }

    String checkClubAgentMassage(String a) {
        System.out.println("Club Agent COnfirms that:" + a + "\nDo you agree:");
        String s = sc.nextLine();
        return s;

    }

    void matchSchdule() {
        System.out.println("Team:");
        String aa = sc.nextLine();
        System.out.println("Time:");
        String bb = sc.nextLine();
        System.out.println("Date:");
        String cc = sc.nextLine();
        String vv=aa+"    Time"+bb+"   Date:"+cc;
        try {
            File f = new File("matchSchdule.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(vv);
            fw.write("\r\n");
            
            

            fw.close();
        } catch (Exception e) {

        }

    }
    void givaFanNotification(){
        System.out.println("Messeage Is:");
        String aa = sc.nextLine();
          try {
            File f = new File("matchSchdule1.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(aa);
            fw.write("\r\n");
            
            

            fw.close();
        } catch (Exception e) {

        }

    }
    
    
    
    void checkPlayers(ArrayList<players> pList){
        System.out.println("Players Name\t\t\tGoals\t\t\tJersey No\t\t\tAsist");
        for(players p:pList){
            System.out.println(p.getName()+"\t\t\t"+p.getGoal()+"\t\t\t"+p.getJerseyNumber()+"\t\t\t"+p.getAssist());  
        }
        
    }
}
