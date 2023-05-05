//cube.....

/* <html>
   <applet code="dig6.class",width=300 height=300>
   </applet>
   </html> */

import java.awt.*;
import java.applet.*;
public class dig6 extends Applet
{
   public void paint(Graphics g)
   {
    int x[]={50,100,50,100};
    int y[]={30,30,80,80};
    g.drawPolygon(x,y,4);
    int a[]={30,80,30,80};
    int b[]={50,50,100,100};
    g.drawPolygon(a,b,4);
    g.drawLine(50,30,30,50);
    g.drawLine(100,30,80,50);
    g.drawLine(50,80,30,100);
    g.drawLine(100,80,80,100);
   }
}

   