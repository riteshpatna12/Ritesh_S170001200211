package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageCountries_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_title_size_path_maxlength_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_title_size_path_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_form_form_method_commandName_action.release();
    _jspx_tagPool_form_errors_path_cssClass_nobody.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_form_input_title_size_path_maxlength_nobody.release();
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
      out.write("        <title>Bookshop-->ManageCountries</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/BookShop/css/admin.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </br>\n");
      out.write("        ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setMethod("post");
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/admin/saveCountry", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_0.setCommandName("country");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        ");
            if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("    \n");
            out.write("        <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
            out.write("            <tr>\n");
            out.write("                <td>\n");
            out.write("                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
            out.write("                        <tr>\n");
            out.write("                            <td class=\"manageForms\">Manage Countries</td>\n");
            out.write("                            <td align=\"center\" class=\"error\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                            <td class=\"Information\">\n");
            out.write("                                It is Mandatory to enter information in all Information<br>capture\n");
            out.write("                                boxes which have a<span class=\"mandatory\">*</span>adjacent\n");
            out.write("                            </td>\n");
            out.write("                        </tr>\n");
            out.write("                    </table>\n");
            out.write("                </td>\n");
            out.write("            </tr>\n");
            out.write("            \n");
            out.write("            <tr><td class=\"hrLine\">&nbsp;</td></tr>\n");
            out.write("            <tr>\n");
            out.write("                <td>\n");
            out.write("                    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" >\n");
            out.write("                        <tr>\n");
            out.write("                            <td>\n");
            out.write("                                <table border=\"0\" cellpadding=\"4\" cellspacing=\"4\" width=\"100%\">\n");
            out.write("                                    <tr>\n");
            out.write("                                        <td class=\"sectionName\" colspan=\"2\">\n");
            out.write("                                            <br/>Country Details<br/><br/>\n");
            out.write("                                        </td>\n");
            out.write("                                    </tr>\n");
            out.write("                                    <tr>\n");
            out.write("                                        <td width=\"10%\">Country Name<span class=\"mandatory\">*</span>:</td>\n");
            out.write("                                        <td>\n");
            out.write("                                            ");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br>\n");
            out.write("                                            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_0.setPath("country");
            _jspx_th_form_errors_0.setCssClass("error");
            int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
              if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_0.doFinally();
              _jspx_tagPool_form_errors_path_cssClass_nobody.reuse(_jspx_th_form_errors_0);
            }
            out.write("\n");
            out.write("                                        </td>    \n");
            out.write("                                    </tr>\n");
            out.write("                                </table>\n");
            out.write("                            </td>\n");
            out.write("                        </tr>\n");
            out.write("                        <tr><td>&nbsp;</td></tr>\n");
            out.write("                        \n");
            out.write("                        <tr>\n");
            out.write("                            <td colspan=\"2\" class=\"centerAlign\">\n");
            out.write("                                <input type=\"submit\" class=\"groovybutton\" value=\"Save\"/>\n");
            out.write("                                <input type=\"reset\" value=\"clear\" class=\"groovybutton\" onclick=\"javascript:document.location.href='/BookShop/admin/manageCountries'\"/>  \n");
            out.write("                            </td>\n");
            out.write("                        </tr>\n");
            out.write("                    </table>\n");
            out.write("                </td>\n");
            out.write("            </tr>\n");
            out.write("            <tr><td>&nbsp;</td></tr>\n");
            out.write("            <tr><td class=\"hrLine\">&nbsp;</td></tr>\n");
            out.write("        </table>\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_method_commandName_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                      \n");
      out.write("    \n");
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

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_0.setPath("countryNo");
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_title_size_path_maxlength_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("country");
    _jspx_th_form_input_0.setTitle("Enter the country name");
    _jspx_th_form_input_0.setMaxlength("25");
    _jspx_th_form_input_0.setSize("50");
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_title_size_path_maxlength_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty countryList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <table class=\"data\" width=\"100%\">\n");
        out.write("            <tr>\n");
        out.write("                <th width=\"94%\">Country Name</th>\n");
        out.write("                <th width=\"3\">&nbsp;</th>\n");
        out.write("                <th width=\"3\">&nbsp;</th>\n");
        out.write("            </tr>\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("        </table> \n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("country");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${country.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><a href=\"/BookShop/admin/deleteCountry/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${country.countryNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <img title=\"Click to Delete\" src=\"/BookShop/images/delete.jpg\"/></a></td>\n");
          out.write("                    <td><a href=\"/BookShop/admin/editCountry/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${country.countryNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <img title=\"Click to edit\" src=\"/BookShop/images/edit.jpg\"/></a></td>    \n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
