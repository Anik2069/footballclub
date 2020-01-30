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
public class uppcomingmidfielder extends upcommingplayers {
    private double passacuray;

    public uppcomingmidfielder(double passacuray, String name, String previousclub, int goalno, double sellmoney) {
        super(name, previousclub, goalno, sellmoney);
        this.passacuray = passacuray;
    }

    public double getPassacuray() {
        return passacuray;
    }

    public void setPassacuray(double passacuray) {
        this.passacuray = passacuray;
    }
    
}
