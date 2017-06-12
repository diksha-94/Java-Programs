public class ClassOne
{
     public static void main(String[] args)
     {
         ClassTwo.methodOfClassTwo();
     }
}
 public class ClassTwo
{
     static void methodOfClassTwo()
     {
         System.out.println("From Class Two");
     }
}