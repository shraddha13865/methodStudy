package interface1;

public class MyClass1 implements MyInterface{
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        myClass1.show1();
        myClass1.show2();
        myClass1.show3();
        myClass1.show4(); //calling incomplte medthod from myclass

    }
            @Override
            public void show1() {
                System.out.println("Show1 class implements from Myclass");
            }

            @Override
            public void show2() {
                System.out.println("Show1 class implements from Myclass");
            }

            @Override
            public void show3() {
                System.out.println("Show1 class implements from Myclass");
            }

            @Override
            public void show4() {
                System.out.println("Show1 class implements from Myclass");
            }
        }



