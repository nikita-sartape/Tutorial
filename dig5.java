//polygon.....

/* <html>
   <applet code="dig5.class",width=300 height=300>
   </applet>
   </html> */

import java.awt.*;
import java.applet.*;
public class dig5 extends Applet
{
   public void paint(Graphics g)
   {
    int x[]={100,150,50};
    int y[]={50,100,100};
    g.drawPolygon(x,y,3);
    int a[]={50,150,100};
    int b[]={60,60,110};
    g.drawPolygon(a,b,3);
    g.drawOval(80,60,40,40);
   }
}

   