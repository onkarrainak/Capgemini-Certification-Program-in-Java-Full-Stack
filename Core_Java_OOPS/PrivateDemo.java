package onkar.Core_Java_OOPS;

/*
 * It cannot be accessed in
1) Same package subclass
2) Same package non subclass
3) Different package subclass
4) Different package non subclass
 */
class Vehicle{//same package non subclass
    private  void disVehicle() {
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle{
    void disCar() {
        //disVehicle();  ->Same package subclass
        System.out.println("Car");
    }
}
public class PrivateDemo {
    //When a method or variable is declared as private it can
    //be accessed only in that class.
    private int  s=100;
    private String display() {
        return "display"+s;
    }
    private PrivateDemo() {
        System.out.println("Private Constructor");
    }

    public static void main(String[] args) {
        PrivateDemo p=new PrivateDemo();
        System.out.println(p.display());
        Vehicle v=new Vehicle();
        //v.disVehicle();->Same package non subclass not accessible private method

    }

}