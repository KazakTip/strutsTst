package aForms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.ServletRequest;

/**
 * @author SBT-Kazakov-NO
 * @ created 06.02.2017
 * @ $Author$
 * @ $Revision$
 */
public class TstActionForm extends SomeActionFormBase
{
  private String userPswd;
  private String userName;
  
  public String getUserPswd()
  {
    return userPswd;
  }
  
  public void setUserPswd(String userPswd)
  {
    this.userPswd = userPswd;
  }
  
  public String getUserName()
  {
    return userName;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  
  @Override
  public ActionErrors validate(ActionMapping mapping, ServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
    
    if(userName == null)
    {
      errors.add("userName", new ActionMessage("Invalid username"));
    }
  
    if(userPswd == null)
    {
      errors.add("userPswd", new ActionMessage("Invalid user password"));
    }
    
    return errors;
  }
  
  @Override
  public void reset(ActionMapping mapping, ServletRequest request)
  {
    super.reset(mapping, request);
  }
}
