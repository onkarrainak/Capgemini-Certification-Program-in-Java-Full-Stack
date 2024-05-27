package onkar.Core_Java_Java8;

@FunctionalInterface
interface Myinterface1 {
    int add(int a, int b);
}
@FunctionalInterface
interface MyinterfaceMul {
    int mul(int a, int b);
}
@FunctionalInterface
interface ReverseString {
    String rev(String s);
}
public class LambdaWithParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Myinterface1 myinterface = (int a, int b) -> a + b;
        System.out.println("Addition is : " + myinterface.add(2, 3));
        MyinterfaceMul myInterface1 = (int a, int b) -> a * b;
        System.out.println("Multiplication is : " + myInterface1.mul(3, 3));
        ReverseString reverseString = (String s) -> {
            String str = " ";
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                str = str + ch;
            }
            return str;
        };
        System.out.println("My Reverse String is : " + reverseString.rev("onkar"));
    }
}
