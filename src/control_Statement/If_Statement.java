package control_Statement;


public class If_Statement {
    public static void main(String[] args) {
        //  if my name is Asha then.....>name is correct
        String name = "Aisha";
        if (name == "Aisha") {
            System.out.println("My name is correct");   //answer is true ...>body executed
        }
        //if my rollnumber is > 23 then ....>my rollnumber is right
        int rollnumber=23;
        if(rollnumber>20)
        {
            System.out.println("My rollnumber is greterthan 23");   //answer is true ...>body executed
        }
        //if my division is A ...>then my grade is A
        char division ='B';
        if (division=='A')
        {
            System.out.println("My division is A");  //answer is false ...>body is not executed
        }
        // if my marks is not equal to 89 then print the message
        int marks=100;
        if(marks!=89)
        {
            System.out.println("Marks are not 89 ");    //answer is true....>body is not executed
        }

    }
}
