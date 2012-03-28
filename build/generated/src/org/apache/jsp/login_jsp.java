package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Login using jsp</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("        <H1>LOGIN FORM</H1>\n");
      out.write("        ");

        String myname =  (String)session.getAttribute("username");
       
        if(myname!=null)
            {
             out.println("Welcome  "+myname+"  , <a href=\"logout.jsp\" >Logout</a>");
            }
        else 
            {
            
      out.write("\n");
      out.write("            <form action=\"checkLogin.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Username  : </td><td> <input name=\"username\" size=15 type=\"text\" /> </td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Password  : </td><td> <input name=\"password\" size=15 type=\"password\" /> </td> \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"login\" />\n");
      out.write("            </form>\n");
      out.write("            ");
 
            }
        
            
            
      out.write("\n");
      out.write("        \n");
      out.write("    </BODY>\n");
      out.write("</HTML> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
