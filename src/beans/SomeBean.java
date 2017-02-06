package beans;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * @author sbt-kazakov-no
 * @ created 03.02.2017
 * @ $Author$
 * @ $Revision$
 */
public class SomeBean extends BodyTagSupport
{
  
  private String someText = "Text123";
  public String getSomeText()
  {
    return someText;
  }
  public void setSomeText(String someText)
  {
    this.someText = someText;
  }
  
  private int    bitCount = 0;
  
  public int getBitCount()
  {
    return bitCount;
  }
  
  public void setBitCount(int bitesCount)
  {
    this.bitCount = bitesCount;
    /*try
    {
      super.pageContext.getOut().print("ghfhfgh");
    } catch(IOException e)
    {
      e.printStackTrace();
    }*/
  }
  
  @Override
  public int doAfterBody() throws JspException
  {
    try
    {
      BodyContent bc = getBodyContent();
      JspWriter out = bc.getEnclosingWriter();
      
      out.print("33");
      //super.pageContext.getOut().print("ghfhfgh");
    } catch(IOException e)
    {
      e.printStackTrace();
    }
    return super.doAfterBody();
  }
}
