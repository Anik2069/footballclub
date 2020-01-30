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
public class upperManagements {
     private String name;
    private String id;
    private String contactno;
    private String emailaddress;

    public upperManagements(String name, String id, String contactno, String emailaddress) {
        this.name = name;
        this.id = id;
        this.contactno = contactno;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    
    
    
}
