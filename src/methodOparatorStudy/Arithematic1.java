package methodOparatorStudy;

public class Arithematic1 {
    public static void main(String[] args) {
        addition(); //calling a method
        Arithematic1 arithematic1=new Arithematic1(); //creat a object from nonstatic method
         arithematic1.substraction();// calling a non static method

        // calling a non static method rom another class
         Arithematic2 arithematic2=new Arithematic2();
         arithematic2.mul(); //calling a non static method from another class
        Arithematic2.div(); //Calling a static method from another call
    }
    public static void addition(){
        int sum1=20;
        int sum2=30;
        int add=sum1+sum2;
        System.out.println("My addion is "+add);
    }
    public void substraction(){
        int x=20;    //declare and assigned
        int y=10;
        int sub=x-y;  //this is usage
        System.out.println("My substraction is "+sub);
    }
}
