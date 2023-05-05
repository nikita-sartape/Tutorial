import java.util.*;
class Employee
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int age;
      char sex, marital_status;
      System.out.print("Enter age--> ");
      age=sc.nextInt();
      System.out.print("Enter sex--> ");
      sex=sc.next().charAt(0);
      System.out.print("Enter marital status--> ");
      marital_status=sc.next().charAt(0);

     if(sex == 'F') {
			System.out.println("You will work only in urban areas");
		}
		
	
		if(sex == 'M') {
			if((age >= 20) && (age < 40)) {
				System.out.println("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			else {
				System.out.println("ERROR");
			}
           }
    }
}
       
      
      
    