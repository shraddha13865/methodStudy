package loop_statement;

public class While_loop {
    public static void main(String[] args) {
        //print even numer 1 to10
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("=====================");

        String name = "aisha";
        int a = 1;
        while (a <= 5) {
            System.out.println(name);
            a++;
        }
        System.out.println("=====================");

        int b = 3;
        while (b <= 3) {
            System.out.println(b);
            b=b+3;
        }
    }
}









