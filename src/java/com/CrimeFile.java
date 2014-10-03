/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Anupama
 */
@Entity
public class CrimeFile implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    
    private int complaintno;
    private String crimeaddress;
   private String date;
   private String reportername;
    private String repaddress;
    private String repemail;
    private String businessname;
    private int reporterage;
    private int victimage;
    private long reportermb;
    private String crimetype;

    public String getCrimetype() {
        return crimetype;
    }

    public void setCrimetype(String crimetype) {
        this.crimetype = crimetype;
    }
   
     private long victimmb;
  
     private String businessaddress;
      private String victimname;
       private long businessphone;
        private String victimemail;
         private String victimaddress;
    private String repgender;
    private String victimgender;
    

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public long getBusinessphone() {
        return businessphone;
    }

    public void setBusinessphone(long businessphone) {
        this.businessphone = businessphone;
    }

    public int getComplaintno() {
        return complaintno;
    }

    public void setComplaintno(int complaintno) {
        this.complaintno = complaintno;
    }

    public String getCrimeaddress() {
        return crimeaddress;
    }

    public void setCrimeaddress(String crimeaddress) {
        this.crimeaddress = crimeaddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRepaddress() {
        return repaddress;
    }

    public void setRepaddress(String repaddress) {
        this.repaddress = repaddress;
    }

    public String getRepemail() {
        return repemail;
    }

    public void setRepemail(String repemail) {
        this.repemail = repemail;
    }

    public String getRepgender() {
        return repgender;
    }

    public void setRepgender(String repgender) {
        this.repgender = repgender;
    }

    public int getReporterage() {
        return reporterage;
    }

    public void setReporterage(int reporterage) {
        this.reporterage = reporterage;
    }

    public long getReportermb() {
        return reportermb;
    }

    public void setReportermb(long reportermb) {
        this.reportermb = reportermb;
    }

    public String getReportername() {
        return reportername;
    }

    public void setReportername(String reportername) {
        this.reportername = reportername;
    }

    public String getVictimaddress() {
        return victimaddress;
    }

    public void setVictimaddress(String victimaddress) {
        this.victimaddress = victimaddress;
    }

    public int getVictimage() {
        return victimage;
    }

    public void setVictimage(int victimage) {
        this.victimage = victimage;
    }

    public String getVictimemail() {
        return victimemail;
    }

    public void setVictimemail(String victimemail) {
        this.victimemail = victimemail;
    }

    public String getVictimgender() {
        return victimgender;
    }

    public void setVictimgender(String victimgender) {
        this.victimgender = victimgender;
    }

    public long getVictimmb() {
        return victimmb;
    }

    public void setVictimmb(long victimmb) {
        this.victimmb = victimmb;
    }

    public String getVictimname() {
        return victimname;
    }

    public void setVictimname(String victimname) {
        this.victimname = victimname;
    }
    
     public CrimeFile() {
    }

    public CrimeFile(String add,String date,String address,String address1,String address2,long mb,long mb1,long bhp,String crimetype,String email,String email1,String r,String r1,String vname,String bname,int age,int age1) {
        this.crimeaddress = add;
        this.date = date;
        this.repaddress = address;
        this.businessaddress = address1;
        this.victimaddress = address2;
        this.crimetype = crimetype;
        this.reportermb = mb;
        this.businessphone = bhp;
        this.repemail = email;
        this.victimemail = email1;
        this.repgender = r;
        this.victimgender = r1;
        this.reporterage = age;
        this.victimage = age1;
        this.businessname = bname;
        this.victimname = vname;
     
        
    }

    
}
