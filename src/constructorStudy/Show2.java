package constructorStudy;

public class Show2 {

    String name="Aisha vikhe";
    int age=23;
    int rollnumber=345;
    byte id=120;
    boolean ispass=true;

    public static void main(String[] args) {
        Show2 show = new Show2(22);
        Show2 show1 = new Show2("shraddha ", 23, 324, (byte) 12, true);

        Show2 show2 =new Show2("Aisha",23,345,(byte)120,true);
    }
    Show2(int a) {
        int sum = 100 + a;
        System.out.println("my sum is " + sum);
    }
    public Show2(String name, int age, int rollnumber, byte id, boolean ispass) {
        this.name=name;
        this.age=age;
        this.id=id;
        this.rollnumber=rollnumber;
        this.ispass=ispass;

        System.out.println();
        System.out.println("my name is " + name);
        System.out.println("my age is " + age);
        System.out.println("my age is " + rollnumber);
        System.out.println("my age is " + id);
        System.out.println("my age is " + ispass);

    }
}







