/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anupama
 */
public class adminpg extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext sc=getServletContext();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","9211623779");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from crimefile");



        PrintWriter out = response.getWriter();
        try {
         //   HttpSession s=request.getSession(false);
          //   if(s!=null)

             {
                 out.println("<html>");
            out.println("<head>");
            out.println("<title>Admin page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>admin home page </h1>");
out.println("<center>");
            out.print("<table border=1><tr><th><h3>Complaint No.</th>"+"         "+"<th>NAME</th>"+"        ");
            out.print("<th>");
             
            out.print("</th>");
          out.println("<th>");
            out.println("</th>");
            out.println("<th>");
            out.println("</th>");
            out.println("</tr>");

            while(rs.next())
            {


              
                out.println("<tr><td>"+rs.getInt(1)+"</td>"+"	"+"<td>"+rs.getString(19)+"</td>"+"	"+"<td><a href='delete?un="+rs.getString(19)+"'>Delete</a></td>"+"<td> <a href='show?unn="+rs.getString(19)+"' >Show</a></td></tr>"+"<br>");

        }
          
            out.println("</table>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");

            }
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminpg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adminpg.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminpg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adminpg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
