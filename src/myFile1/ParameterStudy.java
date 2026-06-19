package myFile1;

public class ParameterStudy {
    public static void main(String[] args) {
        ParameterStudy parameterStudy=new ParameterStudy();
        parameterStudy.addition(); //calling by non static method in zero parameter
        ParameterStudy.studentInformation("Pravin sir",25,78.98f,true,'A');
    }
    public void addition(){ // non static method and no parameter
        int a=40;        // declare and assigned
        int b=30;
        int sum=a+b;
        System.out.println("This is my addition "+sum); //this is usage
    }
    public static void studentInformation(String name, int rollNumber, float marks,
                                          boolean result,char div){
       // with parameter
        System.out.println("========================");
        System.out.println("My name is "+name);
        System.out.println("My rollNumber is"+rollNumber);
        System.out.println("My marks is "+marks);
        System.out.println("My result is "+result);
        System.out.println("My division is "+div);
        System.out.println("=========================");
    }
}
