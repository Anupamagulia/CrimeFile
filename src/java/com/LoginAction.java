/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Anupama
 */
public class LoginAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
   public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
            LoginActionFormBean res=(LoginActionFormBean)form;
              String add=res.getAdd();
    String date=res.getDate();
   String name=res.getName();
     String address=res.getAddress();
     String email=res.getEmail();
    String bname=res.getBname();
     int age=res.getAge();
     int age1=res.getAge1();
     long mb=res.getMb();
    String crimetype[]=res.getCrimetype();
 long mb1=res.getMb1();
  String address1=res.getAddress1();
     String vname=res.getVname();
        long bhp=res.getBhp();
        String email1=res.getEmail1();
         String address2=res.getAddress2();
     String r=res.getR();
     String r1=res.getR1();
            
            
            
            
            
            
            
            
            String crimes="";
            for(String c:crimetype)
                   crimes+=c+" ";
           
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(CrimeFile.class);
                ac.configure("hibernate.cfg.xml");
                new SchemaExport(ac).create(true, true);
                SessionFactory sessionFactory = ac.buildSessionFactory();
                Session ses = sessionFactory.openSession();
                 CrimeFile mwc = new CrimeFile(add,date,address,address1,address2,mb,mb1,bhp,crimes,email,email1,r,r1,vname,bname,age,age1);
                ses.beginTransaction();
                ses.save(mwc);
                ses.getTransaction().commit();
                ses.flush();
                ses.close();
        return mapping.findForward("home");
    }
}


