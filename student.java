import java.util.*;
class student
{
    int rollno;
    String name;
    int oops,dbms,cns;


void get()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter rolln,name and three subject marks....");
  rollno=sc.nextInt();
  name=sc.next();
  oops=sc.nextInt();
  dbms=sc.nextInt();
  cns=sc.nextInt();
  
}
int calculate()
{
   int per= (oops+dbms+cns)/300;
   int percentage= per*100;
   return percentage;
}
}