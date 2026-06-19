package methodOparatorStudy;

public class MathOparation {
    public static void main(String[] args) {
        MathOparation mathOparation=new MathOparation();
        mathOparation.addition(); //calling non static method same class
        substraction(); // calling static method same class

        MathOparation2 mathOparation2=new MathOparation2();
        mathOparation2.modulo(); // calling by non static method from another class
        MathOparation2.multiplication(); // Calling by static method from another class
    }
    public void addition(){ //non static method
        int sum1=10;
        int sum2=20;
        int addition=sum1+sum2;
        System.out.println("My addition is "+addition);
    }
    public static void substraction(){
        int num1=25;
        int num2=50;
        int substraction=num1-num2;
        System.out.println("My substraction is "+substraction);
    }


}
