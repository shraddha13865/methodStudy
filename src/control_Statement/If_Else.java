package control_Statement;

public class If_Else {
    public static void main(String[] args) {
        //if my marks is greater than 89 then i will pass
        //other wise i will fail
        int marks = 67;
        if (marks >= 89) {
            System.out.println("i will pass");
        } else {
            System.out.println("i wll fail");
        }
        //if my name is aisha then my name is correct
        //other wise my name is wrong
        String name = "Shraddha vikhe";
        if (name == "Aisha vikhe") {
            System.out.println("My name is coreect");
        } else {
            System.out.println("My name is wrong");
        }
        //if my rollnumber is less than <1 then i am in first class
        //otherwise i am second in class

        int rollnumber=1;
        if(rollnumber<=1){
            System.out.println("I am in first class");
        }
        else {
            System.out.println("I am in second class");
        }

    }
}
