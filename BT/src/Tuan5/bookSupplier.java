/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

/**
 *
 * @author Hieu
 */
public class bookSupplier {
    private int ID, Contact;
    private String Name;
    private String Type;
    private String Address;
    private String Email;
    private String Remarks;

    public bookSupplier(){
        
    }

    public bookSupplier(int ID, int Contact, String Name, String Type, String Address, String Email, String Remarks) {
        this.ID = ID;
        this.Contact = Contact;
        this.Name = Name;
        this.Type = Type;
        this.Address = Address;
        this.Email = Email;
        this.Remarks = Remarks;
    }

  
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }


 

   
    

    
    
    
}
