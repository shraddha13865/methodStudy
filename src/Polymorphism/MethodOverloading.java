package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
      MethodOverloading m=new MethodOverloading();
      m.test1(10, 20);
      m.test1(10);
    }
    public void test1(int i, int i1){
        System.out.println("test1 is a method");
    }
    public void test1(int a){
        System.out.println("test1 is method "+a);
        System.out.println(a);
    }

}
