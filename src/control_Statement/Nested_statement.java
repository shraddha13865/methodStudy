package control_Statement;

public class Nested_statement {
    public static void main(String [] args) {
        int marks = 80;
        if (marks <= 35) {
            System.out.println("pass");
            if (marks <= 75) {
                System.out.println("Distinct");
            } else {
                System.out.println("normal pass");}
            }else {
                System.out.println("fail");
            }
        }
    }