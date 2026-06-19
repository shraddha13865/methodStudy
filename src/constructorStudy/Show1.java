package constructorStudy;

public class Show1 {
    int p=30;   // declaration .....>globar/instance
    int q=20;   // declaration .....>globar
//constructor is always non static
    public static void main(String[] args) {
        Show1 show1=new Show1();
        show1.add();
        Show1 show2=new Show1(7,20);
        Show1 show3=new Show1(90,87);
    }
    public void add() {
        int p=20;
        int q=89;
        int sum =p+q;
        System.out.println("My addition is " + sum);
    }
    public Show1() {
        int sum =this.p-this.q;
        System.out.println("My substraction is " +sum);
    }
    public Show1(int x, int y) {
         p = x;
         q= y;

        int sum1 =this.p * this.q;
        int sum=p*q;
        System.out.println("My sum is " + sum);
        System.out.println("My sum1 is " + sum1);

    }
}