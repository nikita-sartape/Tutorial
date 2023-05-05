//Wap String s1="program";
// val=2 o/p= clockwise-->amprogr  anticlockwise-->ogrampr

import java.util.*;
class rotate
{
  public static void main(String args[])
 {
     String s1="program";
     int val=2;
     int len=s1.length();
     String p1=s1.substring(0,len-val);
     String p2=s1.substring(len-val,len);
     String clock=p2+p1;
     System.out.println(clock);
     String p3=s1.substring(0,val);
     String p4=s1.substring(val,len);
     String anticlock=p4+p3;
     System.out.println(anticlock);
 }
}
     

