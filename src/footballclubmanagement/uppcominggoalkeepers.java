/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

/**
 *
 * @author C Bazaar
 */
public class uppcominggoalkeepers extends upcommingplayers{
    private int goalsaves;

    public uppcominggoalkeepers(int goalsaves, String name, String previousclub, int goalno, double sellmoney) {
        super(name, previousclub, goalno, sellmoney);
        this.goalsaves = goalsaves;
    }

    public int getGoalsaves() {
        return goalsaves;
    }

    public void setGoalsaves(int goalsaves) {
        this.goalsaves = goalsaves;
    }
    
}
