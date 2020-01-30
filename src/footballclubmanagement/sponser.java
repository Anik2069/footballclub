
package footballclubmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C Bazaarnner
 */
abstract class sponser {
    ArrayList<sponserAgent> slist;
    private String companyName;
    private int companyContract;
    

    public sponser(ArrayList<sponserAgent> slist) {
        this.slist = slist;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyContract() {
        return companyContract;
    }

    public void setCompanyContract(int companyContract) {
        this.companyContract = companyContract;
    }
    
    void Bid(){
        double c=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Company Name\t\t\tBid Amount");
        for(sponserAgent s:slist){
            System.out.print(s.getCompanyName()+"\t\t\t\t");
             double b=sc.nextDouble();
             if(b>c){
                 c=b;
                 setCompanyName(s.getCompanyName());
             }
        }
    }
    abstract void assignSponser();
}
