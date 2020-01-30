/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
public class fanFollowers {
    private String name;
    private String country;

    public fanFollowers(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
 void checkSchdule(){
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
      System.out.println("Match:"+aa);
        
 }   
 
 void checkNotification(){
      String aa=" ",bb=" ",cc=" ";
      try {
                     File f=new File ("matchSchdule1.txt");
                     Scanner s=new Scanner(f);
                     while(s.hasNext()){
                      aa  =s.nextLine();
                     }
                }
                catch(Exception e){
                    
                }
      System.out.println(aa);
        
 }
}
