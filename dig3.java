//wap to draw oval(circle)

/* <html>
   <applet code="dig3.class",width=300 height=300>
   </applet>
   </html> */

import java.awt.*;
import java.applet.*;
public class dig3 extends Applet
{
   public void paint(Graphics g)
   {
     setBackground(Color.yellow);
     g.setColor(Color.orange);
     g.fillOval(30,40,60,80);
   }
}

   