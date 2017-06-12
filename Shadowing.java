class SuperClass
{
    int x = 10;
 
    static int y = 20;
}
 
class SubClass extends SuperClass
{
    //subclass hides superclass variables with same name
 
    int x = 30;
 
    static int y = 40;
}
 
public class Shadowing
{
 
    public static void main(String[] args)
    {
        SubClass subClass = new SubClass();  //Creating object to SubClass
 
        System.out.println(subClass.x);   //Output : 30
        System.out.println(SubClass.y);   //Output : 40
 
        //accessing super class hidden variables in the same object.
 
        SuperClass superClass = subClass;   //casting from subclass to superclass
 
        System.out.println(superClass.x);     //Output : 10
        System.out.println(superClass.y);     //Output : 20
    }
}