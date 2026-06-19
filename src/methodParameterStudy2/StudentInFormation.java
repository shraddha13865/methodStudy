package methodParameterStudy2;

public class StudentInFormation {
    public static void main(String[] args) {
       StudentData(); //Calling by without paraeter
        StudentInFormation studentInFormation=new StudentInFormation();
        studentInFormation.studentData2( "Shraddha vikhe", (byte) 120,23,89.67f,
                'A',true);
    }
    //Student Information....>name(StringMethod),id (byte),rollNum(int),marks(float),
     //grade(char),atendance(boolean),

    public static void StudentData(){ // static method in without parameter
        String name = "Shraddha Vikhe";
        byte iD = 120;
        int rollNumber = 23;
        float marks = 89.62f;
        char grade = 'A';
        boolean attendance = true;
        System.out.println("============================");
        System.out.println("My name is "+name);
        System.out.println("My rollNum is "+rollNumber);
        System.out.println("My iD is "+iD);
        System.out.println("My marks is "+marks);
        System.out.println("My will get "+grade);
        System.out.println("My attendance is "+attendance);
        System.out.println("=============================");
    }
    //Student Information....>name(StringMethod),id (byte),rollNum(int),marks(float),
    //grade(char),attendace(boolean),
    //  non static method with parameter
    public void studentData2(String name,byte iD,int rollNumber,float marks,
                                   char grade,boolean atendance)
    {
        System.out.println("============================");
        System.out.println("My name is "+name);
        System.out.println("My rollNum is "+rollNumber);
        System.out.println("My iD is "+iD);
        System.out.println("My marks is "+marks);
        System.out.println("My will get "+grade);
        System.out.println("My attendance is "+atendance);
        System.out.println("=============================");

    }


}
