package variableStudy1;

public class Show2 {
    public static void main(String[] args) {
        Show1 show1=new Show1();
        int mul= show1.p * 1;   //globar variable call from another class in show1 to show2 class
        System.out.println("my mul is " +mul);
        int div=show1.q / 9;    //this is static keyword use as another class
        System.out.println("my div is "+div);
    }
}
