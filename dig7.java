//polygon.....

/* <html>
   <applet code="dig7.class",width=300 height=300>
   </applet>
   </html> */

import java.awt.*;
import java.applet.*;
public class dig7 extends Applet
{
   public void paint(Graphics g)
   {
    
    g.drawOval(50,30,80,80);
    //g.drawOval(100,100,10,10);
    g.drawOval(60,60,10,10);
    int a[]={50,30,70};
    int b[]={80,40,30};
    g.drawPolygon(a,b,3);
    
   }

}

   