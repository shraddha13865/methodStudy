package loop_statement;

public class For_loop1 {

    public static void main(String[] args) {

        for (int a = 3; a <= 30; a = a + 3) {
            System.out.println(a);
        }
        System.out.println("==============================");

        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.println(a);
        }
        System.out.println("===============================");

        for (float p = 1.0f; p <= 10.5f; p++) {
            System.out.println(p);
        }
        System.out.println("===============================");

        //My group member should be here
        String[] name = {"Shraddha Vikhe", "Abiyanta Chavan", "Nitesh Katyare",
                "Ashwini Gawali"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("===============================");
        //this loop print even number from 1 to 10
        //if number is diviibl by 2 then it is even

        for (int x = 1; x <= 10; x++)
            if (x % 2 == 0) {
                System.out.println(x);
            }
        System.out.println("===============================");
        //this loop print odd number from 1 to 30
        //if number is not diviibl by 2 then it is odd
        for (int sum1 = 1; sum1 <= 30; sum1++)
            if (sum1 % 2 != 0) {
                System.out.println(sum1);
            }
        System.out.println("===============================");


        //print number from 30 to 5 in reverse
        for (int i = 30; i >= 5; i = i - 5) {
            System.out.println(i);
        }
        System.out.println("===============================");

        //Print a name 3 time
        for (int i = 1; i <= 3; i++) {
            System.out.println("i love uuuu mah baby...>T");
        }
        System.out.println("===============================");

        for (int b = 1; b <= 20; b++) {
            System.out.println("5 * " + b + " = " + (5 * b));
        }
    }
}
