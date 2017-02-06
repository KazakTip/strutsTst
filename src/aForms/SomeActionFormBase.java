package aForms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;

/**
 * @author SBT-Kazakov-NO
 * @ created 06.02.2017
 * @ $Author$
 * @ $Revision$
 */
public class SomeActionFormBase extends ActionForm
{
  @Override
  public ActionErrors validate(ActionMapping mapping, ServletRequest request)
  {
    return super.validate(mapping, request);
  }
  
  @Override
  public void reset(ActionMapping mapping, ServletRequest request)
  {
    super.reset(mapping, request);
  }
}
