import java.util.*;
class palindromestr
{
  public static void main(String args[])
 {
   String s1="mada";
   
   int i=0,j=s1.length()-1;
    for(;i<s1.length()/2;i++,j--)
    {
          if(s1.charAt(i)!=s1.charAt(j))
          {
            System.out.println(" not palindrome string"); 
            break;
   
          }
     }
     if(i==s1.length())
     {   
        System.out.println(" palindrome string");
     }
    

   }
}
        
     
          
   
  
  
  
  