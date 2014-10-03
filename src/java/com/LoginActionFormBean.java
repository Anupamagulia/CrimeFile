/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Anupama
 */
public class LoginActionFormBean extends org.apache.struts.action.ActionForm {
    
    private String add;
   private String date;
   private String name;
    private String address;
    private String email;
    private String bname;
    private int age;
    private int age1;
    private long mb;
   private String crimetype[];

    
     private long mb1;
  
     private String address1;
      private String vname;
       private long bhp;
        private String email1;
         private String address2;
    private String r;
    private String r1;

    public String[] getCrimetype() {
        return crimetype;
    }

    public void setCrimetype(String[] crimetype) {
        this.crimetype = crimetype;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public long getBhp() {
        return bhp;
    }

    public void setBhp(long bhp) {
        this.bhp = bhp;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public long getMb() {
        return mb;
    }

    public void setMb(long mb) {
        this.mb = mb;
    }

    public long getMb1() {
        return mb1;
    }

    public void setMb1(long mb1) {
        this.mb1 = mb1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }
           
         
         
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public String getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {
        this.r = r;
    }

    /**
     * @return the r1
     */
    public String getR1() {
        return r1;
    }

    /**
     * @param r1 the r1 to set
     */
    public void setR1(String r1) {
        this.r1 = r1;
    }
    
    
    
    
    
  
    public LoginActionFormBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        return errors;
    }
}
