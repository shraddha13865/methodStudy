package variableStudy1;

public class Show1 {
    int p=10;   //globar variable
    static int q=30;  //static variable

    public static void main(String[] args) {

       Show1 show1=new Show1();
       show1.display();
       sub();
    }
        public void display(){
        int p=33;      //locall variable are variable always non-static keyword
        int sum=p+100;
            System.out.println("my addition is "+sum);
            int sum1=this.p+100;   //local variablle and globar varable both be same
                          //       so we use (this.p) variable
            System.out.println("my addition2 is "+sum1);
        }
        public static void sub(){
           int a=9;           //local variable hum static methodd main likh sakte hai par
                        //non static method apn static madhy nhi lihu sak
            int sub=a-10;
            int q=22;
            System.out.println("my sub is "+sub);
            int sub1=q-10;
            int sum2=Show1.q-123;    //classname.variablename
            System.out.println("my sub1 is "+sub1);
            System.out.println("my sum2 is "+sum2);


        }
}
