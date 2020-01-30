/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.util.ArrayList;

/**
 *
 * @author C Bazaar
 */
public class sponserAgent extends agent {

    private String companyName;

    public sponserAgent(String companyName, String name, int age, String contractNumber, double salary, int contractDuration) {
        super(name, age, contractNumber, salary, contractDuration);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    void confirmsAdd(ArrayList<players> plist, int jersey) {
        for (players p : plist) {
            if (p.getJerseyNumber() == jersey) {
                System.out.println(getCompanyName() + "Adds by " + p.getName());
            }
        }

    }
}
