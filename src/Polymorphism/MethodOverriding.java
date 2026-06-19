package Polymorphism;

public class MethodOverriding {
    public static void main(String[] args){
      MethodOverriding methodOverriding=new MethodOverriding();
      methodOverriding.test1(10,20);
      methodOverriding.test1("Shraddha"); //call from parent class
     //Method will called a per the object
      B b =new B();
      b.test1("Shweta");
      b.test1(40,30); //call from childd class
    }

    public void test1(String name) {
        System.out.println("My name is " + name);
    }

    public void test1(int p, int q) {
        int sum1 = p + q;
        System.out.println("My addition is " + sum1);
    }
}
 class B extends MethodOverriding{
    public void test1(String name){
        System.out.println("My name is "+ name);
    }
    public void test1(int j,int k){
        int sum2=j-k;
        System.out.println("My sub is " + sum2);
    }
}