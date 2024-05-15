package onkar.Core_Java_Threadprogramming;

class PowerNum {
    synchronized void displayPower(int num) {
        int temp = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "^" + i + "=" + num * temp);
            //System.out.println(num + "*" + i + "=" + num * i);
            temp = temp * num;
        
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
        }
    }
}
class Power1 extends Thread {
    PowerNum p;
    Power1(PowerNum p) {
        this.p = p;
    }
    public void run() {
        p.displayPower(2);
    }
}
class Power2 extends Thread {
    PowerNum p;
    Power2(PowerNum p) {
        this.p = p;
    }
    public void run() {
        p.displayPower(3);
    }
}
public class SynchronizeEx {
    public static void main(String[] args) {
        PowerNum p1=new PowerNum();
        Power1 power1=new Power1(p1);
        power1.start();
        Power2 power2=new Power2(p1);
        power2.start();
    }
}
