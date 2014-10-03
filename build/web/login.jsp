<%-- 
    Document   : login
    Created on : 4 Aug, 2013, 4:05:03 PM
    Author     : Anupama
--%>

<%@taglib prefix="st" uri="/WEB-INF/struts-html.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <st:javascript formName="LoginActionFormBean"/>
       
    </head>
    <body>
      <center>
          <h1><font size="13" color="Red">ONLINE CRIME REPORTING SYSTEM</font></h1>
      </center> <p>Please complete this form as accurately and completely as possible. This will help us screen your report for potential investigation. Whenever you only have partial information (like part of a license plate number, or a person's description), please give us whatever Information you have!</p>
          <p>Fields marked * are required</p>
          <h4><font size="5" color="Red">Crime Information</font></h4>
          
          <h4>*Select the Type of Crime(s) you are reporting (select as many as apply):</h4>
          
     
              
                 <st:form action="login.do" onsubmit="return validateLoginActionFormBean(this)" > 
                     <st:checkbox property="crimetype" value="Theft"/>Theft of Services<br>
                <st:checkbox property="crimetype" value="Murder"/>Murder<br>
                <st:checkbox property="crimetype" value="Kidnapping"/>Kidnapping<br>
                <st:checkbox property="crimetype" value="Burglery"/>Burglery<br>
             
               
                *Address/Location Where Crime Occurred:<st:text property="add"/><br>
                <p>Date and Time Crime Occurred:
                </p>
                *On/From Date:<st:text property="date"/>(mm/dd/yyyy)<br>
                <h4><font size="5" color="Red">Person Reporting Crime</font></h4>
                *Name:<st:text property="name"/><br>
                *Age:<st:text property="age"/><br>
                Gender: <st:radio property="r" value="Male"/>Male  <st:radio property="r" value="Female"/>Female
                <br>
                
               
             
                Home Address:<st:text property="address"/>
                <br>
                Mobile no:<st:text property="mb"/><br>
                 Email: <st:text property="email"/><br>
               <h4><font size="5" color="Red">Victim Information</font></h4>  
              
               <p>Fill out only if different than person reporting crime above.</p>
               
               <h4><font size="4" color="blue">Business ( only if victim is a business NOT a person)</font></h4>
              Business Name:<st:text property="bname"/><br>
               Business Address:<st:text property="address1"/>  Business Phone no:<st:text property="bhp"/>
               <br>
               <h4><font size="4" color="blue">Person (use only if victim is a person, NOT a business)</font></h4><br>
               *Name:<st:text property="vname"/>  <br>
                *Age:<st:text property="age1"/><br>
                Gender: <st:radio property="r1" value="Male"/>Male  <st:radio property="r1" value="Female"/>Female
                <br>
               
                Home Address:<st:text property="address2"/>
                <br>
                Mobile Phone:<st:text property="mb1"/><br>
                 Email: <st:text property="email1"/><br>
               
              <st:submit value="Register"/>
        
   </st:form>
    </body>
</html>
