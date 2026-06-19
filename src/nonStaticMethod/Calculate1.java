package nonStaticMethod;

public class Calculate1 {
    public static void main(String[] args) {
        test1();   //static method from same class

        // non static regular method we need to create obj
        //Calling static method from same class
        Calculate1 cal=new Calculate1();
        cal.display1();      //calling non static method from same class
        cal.display4();
        cal.display2();
    }
    public void display1() { // non static regular method
        System.out.println("Non static method display1 from class Calculate1");
    }
    public static void test1()// this is static regular method
    {
        System.out.println("My work is done");
    }
    public void display2()
    { //non static regular method
        System.out.println("Non static method display2 from class Claculate1");
    }
    public void display4()
    { //non static regular method
        System.out.println("Non static method display from class Calculate1");
    }

}
