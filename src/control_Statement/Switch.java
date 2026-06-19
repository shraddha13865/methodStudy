package control_Statement;

public class Switch {
    public static void main(String[] args) {
        // day -7
        //day-1 -monday
        //day-7-sunday
        int days = 7;
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalide days");
                break;
        }
        //Oparator ....>addition,sub,mul,div,modulo
        // addition..>my addition is a+b
        //modulo....>my remainder is a%b
        int a = 78;
        int b = 80;
        char oparator = '*';
        switch (oparator) {
            case '+':
                System.out.println("My addition is " + (a + b));
                break;
            case '-':
                System.out.println("My substraction is " + (a - b));
                break;
            case '*':
                System.out.println("My multiplication is " + (a * b));
                break;
            case '/':
                System.out.println("My divisin is " + (a / b));
                break;
            case '%':
                System.out.println("My modulo is " + (a % b));
                break;
            default:
                System.out.println("invalite oparator show");
                break;
        }

        int runs = 4;
        switch (runs) {
            case 1:
                System.out.println("my runs score 1");
                break;
            case 2:
                System.out.println("my runs score 2");
                break;
            case 3:
                System.out.println("my runs score 3");
                break;
            case 4:
                System.out.println("my runs score 4");
                break;
            case 5:
                System.out.println("my runs score 5");
                break;
            default:
                System.out.println("invalide runs");
                break;

        }
        int number = 10;
        if (number % 3 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        int month = 12;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
            System.out.println("month is invalid");
            break;
        }
    }
}