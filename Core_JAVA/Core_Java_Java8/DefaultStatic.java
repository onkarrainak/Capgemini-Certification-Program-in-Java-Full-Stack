package onkar.Core_Java_Java8;


interface MyInter1 {
    //Inside interface u defined abstract as well as default and static method
    void msg();//by default method is abstract
//default & static method u defined with body
    default void display() {
        System.out.println("Default method of interface");
    }
    static void displayStatic() {
        System.out.println("Static display method");
    }
    
}
interface MyInter2 {
    void msg2();
}

public class DefaultStatic implements MyInter1, MyInter2 {
    public static void main(String[] args) {
        // DefaultMethodEx d=new DefaultMethodEx();
        DefaultStatic d = new DefaultStatic();
        d.msg();
        d.msg2();
        d.display();
        MyInter1.displayStatic();
    }
    @Override
    public void msg() {
        System.out.println("My abstract method of interface MyInter1");
    }
    @Override
    public void msg2() {
        System.out.println("My abstract method of another interface MyInter2");
    }
}
