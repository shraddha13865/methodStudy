package thisAndSuperKyword1;

public class A1 {
    int x = 10;

    void display() {   //user define method
        int x = 20; //local variable
        int a = 20;
        int b = 90;
        int sum = a * b; //usse to local vaue by default
        System.out.println("My multiplication is " + sum);
        System.out.println(this.x - a + " This is my substraction ");
        //the local and globar variable both r same we use this keyword
        System.out.println(x * 2);
    }
    public A1() { //constructor
        x = 20;
        int y = 20;
        int sum2 = x - y;
        System.out.println("My sum2 value is " + sum2);
    }
}
    class B1 extends A1{
     void Show1() {
         System.out.println(super.x * 20 +" This is my mutiplication in super class ");
         //globlar variable of x in super class
     }
        public static void main(String [] args) {
            B1 b1=new B1();
            b1.display();
            b1.Show1();
           // A1 a1=new A1(); //calling constructor method


        }




    }

