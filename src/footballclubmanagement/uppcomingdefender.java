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
public class uppcomingdefender extends upcommingplayers{
    private double defendacuray;

    public uppcomingdefender(double defendacuray, String name, String previousclub, int goalno, double sellmoney) {
        super(name, previousclub, goalno, sellmoney);
        this.defendacuray = defendacuray;
    }

    public double getDefendacuray() {
        return defendacuray;
    }

    public void setDefendacuray(double defendacuray) {
        this.defendacuray = defendacuray;
    }
    
}
