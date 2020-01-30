package footballclubmanagement;

import java.util.ArrayList;

public class playersAgents extends agent {

    private int playerNo;
    private String playerName;
    public playersAgents(String name, int age, String contractNumber, double salary, int contractDuration,int playerNo) {
        super(name, age, contractNumber, salary, contractDuration);
        this.playerNo=playerNo;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

       
 //   void 

    public int getPlayerNo() {
        return playerNo;
    }
    void contractwihotherteams(ArrayList<players> plist,int jersey){
        for(players p:plist){
            if(p.getJerseyNumber()==jersey){
                System.out.println(getName()+"COnfirms thats"+p.getName()+"COntraact another team");
            }
        }
        
        
    }
    

}
