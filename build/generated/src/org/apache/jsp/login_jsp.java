package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_javascript_formName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_form_onsubmit_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_checkbox_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_text_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_radio_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_st_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_st_javascript_formName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_st_form_onsubmit_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_st_checkbox_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_st_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_st_radio_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_st_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_st_javascript_formName_nobody.release();
    _jspx_tagPool_st_form_onsubmit_enctype_action.release();
    _jspx_tagPool_st_checkbox_value_property_nobody.release();
    _jspx_tagPool_st_text_property_nobody.release();
    _jspx_tagPool_st_radio_value_property_nobody.release();
    _jspx_tagPool_st_submit_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       ");
      if (_jspx_meth_st_javascript_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <center>\n");
      out.write("          <h1><font size=\"13\" color=\"Red\">ONLINE CRIME REPORTING SYSTEM</font></h1>\n");
      out.write("      </center> <p>Please complete this form as accurately and completely as possible. This will help us screen your report for potential investigation. Whenever you only have partial information (like part of a license plate number, or a person's description), please give us whatever Information you have!</p>\n");
      out.write("          <p>Fields marked * are required</p>\n");
      out.write("          <h4><font size=\"5\" color=\"Red\">Crime Information</font></h4>\n");
      out.write("          \n");
      out.write("          <h4>*Select the Type of Crime(s) you are reporting (select as many as apply):</h4>\n");
      out.write("          \n");
      out.write("     \n");
      out.write("              \n");
      out.write("                 ");
      if (_jspx_meth_st_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_st_javascript_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_st_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_st_javascript_formName_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_st_javascript_0.setPageContext(_jspx_page_context);
    _jspx_th_st_javascript_0.setParent(null);
    _jspx_th_st_javascript_0.setFormName("LoginActionFormBean");
    int _jspx_eval_st_javascript_0 = _jspx_th_st_javascript_0.doStartTag();
    if (_jspx_th_st_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_javascript_formName_nobody.reuse(_jspx_th_st_javascript_0);
      return true;
    }
    _jspx_tagPool_st_javascript_formName_nobody.reuse(_jspx_th_st_javascript_0);
    return false;
  }

  private boolean _jspx_meth_st_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:form
    org.apache.struts.taglib.html.FormTag _jspx_th_st_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_st_form_onsubmit_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_st_form_0.setPageContext(_jspx_page_context);
    _jspx_th_st_form_0.setParent(null);
    _jspx_th_st_form_0.setAction("login.do");
    _jspx_th_st_form_0.setOnsubmit("return validateLoginActionFormBean(this)");
    _jspx_th_st_form_0.setEnctype("multipart/form-data");
    int _jspx_eval_st_form_0 = _jspx_th_st_form_0.doStartTag();
    if (_jspx_eval_st_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                     ");
        if (_jspx_meth_st_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Theft of Services<br>\n");
        out.write("                ");
        if (_jspx_meth_st_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Murder<br>\n");
        out.write("                ");
        if (_jspx_meth_st_checkbox_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Kidnapping<br>\n");
        out.write("                ");
        if (_jspx_meth_st_checkbox_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Burglery<br>\n");
        out.write("             \n");
        out.write("               \n");
        out.write("                *Address/Location Where Crime Occurred:");
        if (_jspx_meth_st_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                <p>Date and Time Crime Occurred:\n");
        out.write("                </p>\n");
        out.write("                *On/From Date:");
        if (_jspx_meth_st_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("(mm/dd/yyyy)<br>\n");
        out.write("                <h4><font size=\"5\" color=\"Red\">Person Reporting Crime</font></h4>\n");
        out.write("                *Name:");
        if (_jspx_meth_st_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                *Age:");
        if (_jspx_meth_st_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                Gender: ");
        if (_jspx_meth_st_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Male  ");
        if (_jspx_meth_st_radio_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Female\n");
        out.write("                <br>\n");
        out.write("                \n");
        out.write("               \n");
        out.write("             \n");
        out.write("                Home Address:");
        if (_jspx_meth_st_text_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                <br>\n");
        out.write("                Mobile no:");
        if (_jspx_meth_st_text_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                 Email: ");
        if (_jspx_meth_st_text_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("               <h4><font size=\"5\" color=\"Red\">Victim Information</font></h4>  \n");
        out.write("              \n");
        out.write("               <p>Fill out only if different than person reporting crime above.</p>\n");
        out.write("               \n");
        out.write("               <h4><font size=\"4\" color=\"blue\">Business ( only if victim is a business NOT a person)</font></h4>\n");
        out.write("              Business Name:");
        if (_jspx_meth_st_text_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("               Business Address:");
        if (_jspx_meth_st_text_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("  Business Phone no:");
        if (_jspx_meth_st_text_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("               <br>\n");
        out.write("               <h4><font size=\"4\" color=\"blue\">Person (use only if victim is a person, NOT a business)</font></h4><br>\n");
        out.write("               *Name:");
        if (_jspx_meth_st_text_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("  <br>\n");
        out.write("                *Age:");
        if (_jspx_meth_st_text_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                Gender: ");
        if (_jspx_meth_st_radio_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Male  ");
        if (_jspx_meth_st_radio_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("Female\n");
        out.write("                <br>\n");
        out.write("               \n");
        out.write("                Home Address:");
        if (_jspx_meth_st_text_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                <br>\n");
        out.write("                Mobile Phone:");
        if (_jspx_meth_st_text_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("                 Email: ");
        if (_jspx_meth_st_text_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("<br>\n");
        out.write("               \n");
        out.write("              ");
        if (_jspx_meth_st_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_st_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        \n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_st_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_st_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_form_onsubmit_enctype_action.reuse(_jspx_th_st_form_0);
      return true;
    }
    _jspx_tagPool_st_form_onsubmit_enctype_action.reuse(_jspx_th_st_form_0);
    return false;
  }

  private boolean _jspx_meth_st_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_st_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_st_checkbox_value_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_st_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_st_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_checkbox_0.setProperty("crimetype");
    _jspx_th_st_checkbox_0.setValue("Theft");
    int _jspx_eval_st_checkbox_0 = _jspx_th_st_checkbox_0.doStartTag();
    if (_jspx_th_st_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_0);
      return true;
    }
    _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_st_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_st_checkbox_1 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_st_checkbox_value_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_st_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_st_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_checkbox_1.setProperty("crimetype");
    _jspx_th_st_checkbox_1.setValue("Murder");
    int _jspx_eval_st_checkbox_1 = _jspx_th_st_checkbox_1.doStartTag();
    if (_jspx_th_st_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_1);
      return true;
    }
    _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_st_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_st_checkbox_2 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_st_checkbox_value_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_st_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_st_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_checkbox_2.setProperty("crimetype");
    _jspx_th_st_checkbox_2.setValue("Kidnapping");
    int _jspx_eval_st_checkbox_2 = _jspx_th_st_checkbox_2.doStartTag();
    if (_jspx_th_st_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_2);
      return true;
    }
    _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_st_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_st_checkbox_3 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_st_checkbox_value_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_st_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_st_checkbox_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_checkbox_3.setProperty("crimetype");
    _jspx_th_st_checkbox_3.setValue("Burglery");
    int _jspx_eval_st_checkbox_3 = _jspx_th_st_checkbox_3.doStartTag();
    if (_jspx_th_st_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_3);
      return true;
    }
    _jspx_tagPool_st_checkbox_value_property_nobody.reuse(_jspx_th_st_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_st_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_0.setPageContext(_jspx_page_context);
    _jspx_th_st_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_0.setProperty("add");
    int _jspx_eval_st_text_0 = _jspx_th_st_text_0.doStartTag();
    if (_jspx_th_st_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_0);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_0);
    return false;
  }

  private boolean _jspx_meth_st_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_1.setPageContext(_jspx_page_context);
    _jspx_th_st_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_1.setProperty("date");
    int _jspx_eval_st_text_1 = _jspx_th_st_text_1.doStartTag();
    if (_jspx_th_st_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_1);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_1);
    return false;
  }

  private boolean _jspx_meth_st_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_2.setPageContext(_jspx_page_context);
    _jspx_th_st_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_2.setProperty("name");
    int _jspx_eval_st_text_2 = _jspx_th_st_text_2.doStartTag();
    if (_jspx_th_st_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_2);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_2);
    return false;
  }

  private boolean _jspx_meth_st_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_3.setPageContext(_jspx_page_context);
    _jspx_th_st_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_3.setProperty("age");
    int _jspx_eval_st_text_3 = _jspx_th_st_text_3.doStartTag();
    if (_jspx_th_st_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_3);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_3);
    return false;
  }

  private boolean _jspx_meth_st_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_st_radio_0 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_st_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_st_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_st_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_radio_0.setProperty("r");
    _jspx_th_st_radio_0.setValue("Male");
    int _jspx_eval_st_radio_0 = _jspx_th_st_radio_0.doStartTag();
    if (_jspx_th_st_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_0);
      return true;
    }
    _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_0);
    return false;
  }

  private boolean _jspx_meth_st_radio_1(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_st_radio_1 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_st_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_st_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_st_radio_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_radio_1.setProperty("r");
    _jspx_th_st_radio_1.setValue("Female");
    int _jspx_eval_st_radio_1 = _jspx_th_st_radio_1.doStartTag();
    if (_jspx_th_st_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_1);
      return true;
    }
    _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_1);
    return false;
  }

  private boolean _jspx_meth_st_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_4.setPageContext(_jspx_page_context);
    _jspx_th_st_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_4.setProperty("address");
    int _jspx_eval_st_text_4 = _jspx_th_st_text_4.doStartTag();
    if (_jspx_th_st_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_4);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_4);
    return false;
  }

  private boolean _jspx_meth_st_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_5.setPageContext(_jspx_page_context);
    _jspx_th_st_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_5.setProperty("mb");
    int _jspx_eval_st_text_5 = _jspx_th_st_text_5.doStartTag();
    if (_jspx_th_st_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_5);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_5);
    return false;
  }

  private boolean _jspx_meth_st_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_6.setPageContext(_jspx_page_context);
    _jspx_th_st_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_6.setProperty("email");
    int _jspx_eval_st_text_6 = _jspx_th_st_text_6.doStartTag();
    if (_jspx_th_st_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_6);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_6);
    return false;
  }

  private boolean _jspx_meth_st_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_7.setPageContext(_jspx_page_context);
    _jspx_th_st_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_7.setProperty("bname");
    int _jspx_eval_st_text_7 = _jspx_th_st_text_7.doStartTag();
    if (_jspx_th_st_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_7);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_7);
    return false;
  }

  private boolean _jspx_meth_st_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_8.setPageContext(_jspx_page_context);
    _jspx_th_st_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_8.setProperty("address1");
    int _jspx_eval_st_text_8 = _jspx_th_st_text_8.doStartTag();
    if (_jspx_th_st_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_8);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_8);
    return false;
  }

  private boolean _jspx_meth_st_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_9.setPageContext(_jspx_page_context);
    _jspx_th_st_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_9.setProperty("bhp");
    int _jspx_eval_st_text_9 = _jspx_th_st_text_9.doStartTag();
    if (_jspx_th_st_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_9);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_9);
    return false;
  }

  private boolean _jspx_meth_st_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_10 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_10.setPageContext(_jspx_page_context);
    _jspx_th_st_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_10.setProperty("vname");
    int _jspx_eval_st_text_10 = _jspx_th_st_text_10.doStartTag();
    if (_jspx_th_st_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_10);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_10);
    return false;
  }

  private boolean _jspx_meth_st_text_11(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_11 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_11.setPageContext(_jspx_page_context);
    _jspx_th_st_text_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_11.setProperty("age1");
    int _jspx_eval_st_text_11 = _jspx_th_st_text_11.doStartTag();
    if (_jspx_th_st_text_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_11);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_11);
    return false;
  }

  private boolean _jspx_meth_st_radio_2(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_st_radio_2 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_st_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_st_radio_2.setPageContext(_jspx_page_context);
    _jspx_th_st_radio_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_radio_2.setProperty("r1");
    _jspx_th_st_radio_2.setValue("Male");
    int _jspx_eval_st_radio_2 = _jspx_th_st_radio_2.doStartTag();
    if (_jspx_th_st_radio_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_2);
      return true;
    }
    _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_2);
    return false;
  }

  private boolean _jspx_meth_st_radio_3(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_st_radio_3 = (org.apache.struts.taglib.html.RadioTag) _jspx_tagPool_st_radio_value_property_nobody.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_st_radio_3.setPageContext(_jspx_page_context);
    _jspx_th_st_radio_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_radio_3.setProperty("r1");
    _jspx_th_st_radio_3.setValue("Female");
    int _jspx_eval_st_radio_3 = _jspx_th_st_radio_3.doStartTag();
    if (_jspx_th_st_radio_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_3);
      return true;
    }
    _jspx_tagPool_st_radio_value_property_nobody.reuse(_jspx_th_st_radio_3);
    return false;
  }

  private boolean _jspx_meth_st_text_12(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_12 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_12.setPageContext(_jspx_page_context);
    _jspx_th_st_text_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_12.setProperty("address2");
    int _jspx_eval_st_text_12 = _jspx_th_st_text_12.doStartTag();
    if (_jspx_th_st_text_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_12);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_12);
    return false;
  }

  private boolean _jspx_meth_st_text_13(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_13 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_13.setPageContext(_jspx_page_context);
    _jspx_th_st_text_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_13.setProperty("mb1");
    int _jspx_eval_st_text_13 = _jspx_th_st_text_13.doStartTag();
    if (_jspx_th_st_text_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_13);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_13);
    return false;
  }

  private boolean _jspx_meth_st_text_14(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:text
    org.apache.struts.taglib.html.TextTag _jspx_th_st_text_14 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_st_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_st_text_14.setPageContext(_jspx_page_context);
    _jspx_th_st_text_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_text_14.setProperty("email1");
    int _jspx_eval_st_text_14 = _jspx_th_st_text_14.doStartTag();
    if (_jspx_th_st_text_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_14);
      return true;
    }
    _jspx_tagPool_st_text_property_nobody.reuse(_jspx_th_st_text_14);
    return false;
  }

  private boolean _jspx_meth_st_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_st_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_st_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_st_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_st_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_form_0);
    _jspx_th_st_submit_0.setValue("Register");
    int _jspx_eval_st_submit_0 = _jspx_th_st_submit_0.doStartTag();
    if (_jspx_th_st_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_st_submit_value_nobody.reuse(_jspx_th_st_submit_0);
      return true;
    }
    _jspx_tagPool_st_submit_value_nobody.reuse(_jspx_th_st_submit_0);
    return false;
  }
}
