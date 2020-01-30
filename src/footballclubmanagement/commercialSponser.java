
package footballclubmanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
public class commercialSponser extends sponser{

    public commercialSponser(ArrayList<sponserAgent> slist) {
        super(slist);
    }
    
     void assignSponser() {
       Bid();
       System.out.println("Now Commercial Sponser of our team is:"+getCompanyName());
    }
     
   void teleCastSchedule(){
        String aa=" ",bb=" ",cc=" ";
      try {
                     File f=new File ("matchSchdule.txt");
                     Scanner s=new Scanner(f);
                     while(s.hasNext()){
                      aa  =s.nextLine();
                     }
                }
                catch(Exception e){
                    
                }
      System.out.println("N Tv tive\nMatch:"+aa);
       System.out.println("Don't Miss it");      
   }
     
}
