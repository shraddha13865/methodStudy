package variableStudy1;

public class Display {
    int y = 20;
    static int z=30;

    public static void main(String[] args) {
        Display display = new Display();
        display.dislay1();
        display2();

    }
    public void dislay1() {
        y=10;
        int p = 89;
        int q = 90;
        int num1=this.y-10;
        int sum1=this.y/10;   //nonstatic globlar variable call as local variable
        int sum = p + q;
        System.out.println("my num1 is "+num1);
        System.out.println("My div is "+sum1);
        System.out.println("My addition is " + sum);
    }

    public static void display2() {
        int x = 2;
        int y = 20;
        int sum1=y/10;    //local variable la static method madhy call karu sakto
        int sub1 = x - y;
        int sub2 = Display.z/y;    //static globar variable call as static method
        System.out.println("My div1 is "+sum1);
        System.out.println("my sub2 is "+sub2);
        System.out.println("my sub is " + sub1);
    }
}
