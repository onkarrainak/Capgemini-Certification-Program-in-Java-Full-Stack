package onkar.Core_Java_Threadprogramming;

public class FinalizeMethod 
{
    String s;
public FinalizeMethod(String s) {//Parameterized Constructor
    this.s = s;
}
public static void main(String[] args) {
    FinalizeMethod obj1 = new FinalizeMethod("t1");
    FinalizeMethod obj2 = new FinalizeMethod("t2");
    obj1 = obj2;
    obj1=null;
    obj2=null;
    System.gc();
}
@Override
protected void finalize() throws Throwable {
    System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
}
}