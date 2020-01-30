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
public class upcommingplayers {

    private String name;
    private String previousclub;
    private int goalno;
   // private double passacuray;
    private double sellmoney;

    public upcommingplayers(String name, String previousclub, int goalno, double sellmoney) {
        this.name = name;
        this.previousclub = previousclub;
        this.goalno = goalno;
        this.sellmoney = sellmoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviousclub() {
        return previousclub;
    }

    public void setPreviousclub(String previousclub) {
        this.previousclub = previousclub;
    }

    public int getGoalno() {
        return goalno;
    }

    public void setGoalno(int goalno) {
        this.goalno = goalno;
    }

    public double getSellmoney() {
        return sellmoney;
    }

    public void setSellmoney(double sellmoney) {
        this.sellmoney = sellmoney;
    }
    
}
