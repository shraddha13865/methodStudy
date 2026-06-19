package access_specifier2;

import access_specifier.A;

public class C extends A{
    public static void main(String[] args) {
        C c =new C();  //creating object of subclass to call protected method from acces
        // specifier package
       // System.out.println(c.n); //to ascess protected variable
     //   c.test3(); // to call protected method
     //   A a=new A();
     //   a.test4();
    }
}
