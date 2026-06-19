package hierachical_inheritance;

public class Encapsulation {

    private int balanced = 100;

    public void deposite(int money) {
        balanced = balanced + money;
    }

    public void withdraw(int money) {
        balanced = balanced - money;
    }

    public void balancedInq() {
        System.out.println("My bank balanced is " + balanced);
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.deposite(3000);
        encapsulation.withdraw(200);
        encapsulation.balancedInq();
    }
}