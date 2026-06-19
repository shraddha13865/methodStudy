package control_Statement;

public class Else_If {
    public static void main(String[] args) {
        //if rollnumber is less than...>20 then first group
        //else if rollnumber is less than ...>45 then second group
        //otherwise....>third group
        int rollnumber = 10;
        if (rollnumber <= 20) {
            System.out.println("First Group");
        } else if (rollnumber <= 45) {
            System.out.println("Second Group");
        } else {
            System.out.println("Third Group");
        }
        //if my grade is A then i will get distinction
        //else if my grade is B then i will first in group
        //else if my grade is C then i will second in group
        //otherwise else i will fail
        char grade = 'A';
        if (grade == 'A')
        {
            System.out.println("I will get distinction");
        } else if (grade == 'B')
        {
            System.out.println("I will frist group");
        } else if (grade == 'C')
        {
            System.out.println("I will second group");
        } else {
            System.out.println("I will fail");
        }
        byte id = 120;
        if (id >= 890) {
            System.out.println("ID is greterthan");
        } else if (id >= 900) {
            System.out.println("ID is not greater than");
        } else if (id >= 689) {
            System.out.println("ID is greater than");
        } else {
            System.out.println("Id is invalid");
        }
        int number = 4;
        if (number % 2 == 00) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}


