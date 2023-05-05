//polygon.....

/* <html>
   <applet code="dig4.class",width=300 height=300>
   </applet>
   </html> */

import java.awt.*;
import java.applet.*;
public class dig4 extends Applet
{
   public void paint(Graphics g)
   {
    int x[]={30,100,200,180,150,50};
    int y[]={40,30,70,180,70,200};
    g.drawPolygon(x,y,6);
   }
}

   