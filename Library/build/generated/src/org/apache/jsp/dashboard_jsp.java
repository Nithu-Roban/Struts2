package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_S_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_S_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_S_form_method_action.release();
    _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.release();
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
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-image: url(\"books.jpeg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                color: #ffffff; /* Set the text color to white */\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .library-container {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-size: 3em;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            font-size: 1.2em;\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        .buttons-container {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            font-size: 1em;\n");
      out.write("            margin: 0 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("             background-color:darkred ;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"library-container\">\n");
      out.write("        <h1>Welcome to Our Library</h1>\n");
      out.write("        <p>Explore our collection of books and enjoy reading!</p>\n");
      out.write("        <div class=\"buttons-container\">\n");
      out.write("              \n");
      out.write("                ");
      if (_jspx_meth_S_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("                ");
      if (_jspx_meth_S_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
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

  private boolean _jspx_meth_S_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  S:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_S_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_S_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_S_form_0.setPageContext(_jspx_page_context);
    _jspx_th_S_form_0.setParent(null);
    _jspx_th_S_form_0.setMethod("post");
    _jspx_th_S_form_0.setAction("Login.jsp");
    int _jspx_eval_S_form_0 = _jspx_th_S_form_0.doStartTag();
    if (_jspx_eval_S_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_S_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_S_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_S_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_S_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_S_form_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_S_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_S_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_S_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_S_form_method_action.reuse(_jspx_th_S_form_0);
      return true;
    }
    _jspx_tagPool_S_form_method_action.reuse(_jspx_th_S_form_0);
    return false;
  }

  private boolean _jspx_meth_S_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_S_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  S:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_S_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_S_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_S_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_S_form_0);
    _jspx_th_S_submit_0.setDynamicAttribute(null, "class", new String("button"));
    _jspx_th_S_submit_0.setDynamicAttribute(null, "style", new String("padding: 10px 20px;\n            font-size: 1em;\n            margin: 0 10px;\n            cursor: pointer;\n            background-color: black;\n            color: white;\n            border: none;\n            border-radius: 5px;\n             background-color:darkred ;"));
    _jspx_th_S_submit_0.setOnmouseover("this.style.backgroundColor='#c7c06e'");
    _jspx_th_S_submit_0.setOnmouseout("this.style.backgroundColor='#180303'");
    _jspx_th_S_submit_0.setValue("Login");
    int _jspx_eval_S_submit_0 = _jspx_th_S_submit_0.doStartTag();
    if (_jspx_eval_S_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_S_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_S_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_S_submit_0.doInitBody();
      }
      do {
        out.write(' ');
        int evalDoAfterBody = _jspx_th_S_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_S_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_S_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.reuse(_jspx_th_S_submit_0);
      return true;
    }
    _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.reuse(_jspx_th_S_submit_0);
    return false;
  }

  private boolean _jspx_meth_S_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  S:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_S_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_S_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_S_form_1.setPageContext(_jspx_page_context);
    _jspx_th_S_form_1.setParent(null);
    _jspx_th_S_form_1.setMethod("post");
    _jspx_th_S_form_1.setAction("Register.jsp");
    int _jspx_eval_S_form_1 = _jspx_th_S_form_1.doStartTag();
    if (_jspx_eval_S_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_S_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_S_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_S_form_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_S_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_S_form_1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_S_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_S_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_S_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_S_form_method_action.reuse(_jspx_th_S_form_1);
      return true;
    }
    _jspx_tagPool_S_form_method_action.reuse(_jspx_th_S_form_1);
    return false;
  }

  private boolean _jspx_meth_S_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_S_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  S:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_S_submit_1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_S_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_S_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_S_form_1);
    _jspx_th_S_submit_1.setDynamicAttribute(null, "class", new String("button"));
    _jspx_th_S_submit_1.setDynamicAttribute(null, "style", new String("padding: 10px 20px;\n            font-size: 1em;\n            margin: 0 10px;\n            cursor: pointer;\n            background-color: black;\n            color: white;\n            border: none;\n            border-radius: 5px;\n             background-color:darkred ; "));
    _jspx_th_S_submit_1.setOnmouseover("this.style.backgroundColor='#c7c06e'");
    _jspx_th_S_submit_1.setOnmouseout("this.style.backgroundColor='#180303'");
    _jspx_th_S_submit_1.setValue("Register");
    int _jspx_eval_S_submit_1 = _jspx_th_S_submit_1.doStartTag();
    if (_jspx_eval_S_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_S_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_S_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_S_submit_1.doInitBody();
      }
      do {
        out.write(' ');
        int evalDoAfterBody = _jspx_th_S_submit_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_S_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_S_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.reuse(_jspx_th_S_submit_1);
      return true;
    }
    _jspx_tagPool_S_submit_value_style_onmouseover_onmouseout_class.reuse(_jspx_th_S_submit_1);
    return false;
  }
}
