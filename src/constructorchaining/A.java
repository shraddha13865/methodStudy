package constructorchaining;

public class A {
    public A() {
        this("shraddha");
        System.out.println("user define without parameterized contructor");
    }

    public A(String name) {
        this(10, 20);
        System.out.println("My name is  " + name);
    }

    public A(int a, int b) {
        this(10);
        int sum1 = a + b;
        System.out.println("my addition is " + sum1);
    }

    public A(float a) {
        System.out.println(a * 10 + " My mul answer");
    }

    public static void main(String[] args) {
        A a = new A();
    }
}
