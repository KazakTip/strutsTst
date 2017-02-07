package Actions;

import aForms.TstActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SBT-Kazakov-NO
 * @ created 06.02.2017
 * @ $Author$
 * @ $Revision$
 */
public class TstAction extends Action
{
  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception
  {
    return mapping.findForward("Success");
  }
  
  @Override
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
  {
    ActionForward retFrw;
    TstActionForm frm = (TstActionForm)form;
    
    switch(frm.getFrwSel())
    {
      case 0:
      {
        retFrw = mapping.findForward("Success");
        break;
      }
      case 1:
      {
        retFrw = mapping.findForward("goTiles");
        break;
      }
      case 2:
      {
        retFrw = mapping.findForward("goTiles2");
        break;
      }
      default:
        retFrw = mapping.findForward("Success");
    }
    
    
    return retFrw;
  }
}
