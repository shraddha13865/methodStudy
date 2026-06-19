package methodParameterStudy2;

public class MethodParameter {
        public static void main(String[] args) {
            MethodParameter methodParameter=new MethodParameter();
            methodParameter.addition(); //calling method without parameter
            methodParameter.substraion(30,20); //calling method with two parameter
            methodParameter.multiplication(100); //calling method with single parameter

        }
        public void addition(){ // non static method
            // without parameter
            int num1=20;
            int num2=24;
            int num3=num1+num2;
            System.out.println("My addition is "+num3);
        }
        public void substraion(int p,int q){ // non static method
            // method with two parameter
            int sum=p-q;
            System.out.println("My substraction is "+sum);
        }
        public void multiplication(int a){// non static method
            //method with single parameter
            int sum=25*a;
            System.out.println("My multiplication is "+sum);


        }

    }
