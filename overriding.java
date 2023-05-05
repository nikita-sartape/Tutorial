class A
{
  void add(int a,int b)
  {
    int c=a+b;
    System.out.println(c);
  }
}
class B extends A
{
   void add(int a,int b)
   {
     System.out.println("a= "+a);
     System.out.println("b= "+b);
     int c=a+b;
     System.out.println("c= "+c);
  }
}
class overriding
{
   public static void main(String args[])
   {
      B obj = new B();
      obj.add(25,25);
   }
}       
       
      