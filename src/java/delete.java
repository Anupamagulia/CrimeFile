/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anupama
 */
public class delete extends HttpServlet {
   
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
        PrintWriter out = response.getWriter();
         ServletContext sc=getServletContext();

            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","9211623779");

             String p=request.getParameter("un");
             Statement st=(Statement) con.createStatement();

       


/*int rfs=st.executeUpdate("delete from tab1 where name='"+p+"'");*/

 
            Statement ps2=(Statement) con.createStatement();
            int status2=ps2.executeUpdate("delete from crimefile where victimname='"+p+"'");
            ResultSet rs=st.executeQuery("select* from crimefile");

        try {
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminpg</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>admin home page </h1>");

            out.print("<table border=1><tr><th><h3>complaintno</th>"+"         "+"<th>Businessaddress</th>"+"      "+"<th>Businessname</th>"+"      "+"<th>Businessphone</th>"+"      "+"<th>crimeaddress</th>"+"      "+"<th>crimetype</th>"+"      "+"<th>date</th>"+"       "+"<th>reporteraddress</th>"+"      "+"<th>reportermail</th>"+"      "+"<th>reporterphone</th>"+"     "+"<th>victimname</th>"+"        "+"<th>victimaddress</th>"+"       "+"<th>victimphone</th>"+"        ");
            
            out.println("</tr>");

            while(rs.next())
            {


              
                out.println("<tr><td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"      "+"<td>"+rs.getString(3)+"</td>"+"	"+"<td>"+rs.getLong(4)+"</td>"+"      "+"<td>"+rs.getString(5)+"</td>"+"  "+"<td>"+rs.getString(6)+"</td>"+"      "+"<td>"+rs.getString(7)+"</td>"+"       "+"<td>"+rs.getString(8)+"</td>"+"      "+"<td>"+rs.getString(9)+"</td>"+"   "+"<td>"+rs.getString(10)+"</td>"+"   "+"<td>"+rs.getInt(11)+"</td>"+"<td>"+rs.getLong(12)+"</td>"+"	"+"<td>"+rs.getString(19)+"</td>"+"   "+"<td>"+rs.getString(14)+"</td>"+"    "+"<td>"+rs.getLong(18)+"</td>"+"<br>");

        }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");




            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet delete</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet delete at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
        catch(Exception e)
{
out.println(e.getMessage());
}finally {
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
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
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
