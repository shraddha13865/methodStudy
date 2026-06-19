package abtract1;

public class Cat extends Animal1 {

void drink(){
    System.out.println("My cat drinking a milk");

}
public static void main(String[] args) {
        Cat cat=new Cat();
        cat.run();
        cat.eat(); //compted method
        cat.sleep();

    }

    @Override
    public void eat() {
        System.out.println("My animal is eating");
    }

    @Override
    public void run() {
        System.out.println("My animal is running");

    }
}
