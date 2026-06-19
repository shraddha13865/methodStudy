package staticMethod;

public class StaticMethod1 {
    public static void main(String[] args) {
      show2();  //call with methodName();
      show3();  //Calling static method from same class
      show4();

        // className.methodName();
        StaticMethod2.show5();   //calling static method from aother class
        StaticMethod2.show6();
    }
    public static void show1(){
        System.out.println("This is a regular static method show1..>");
    }
    public static void show2(){
        System.out.println("This is a regular staic method show2...>");
    }
    public static void show3(){
        System.out.println("This is a regular static method show4...>");
    }
    public static void show4(){
        System.out.println("This is a regular static method show5...>");
    }
}
