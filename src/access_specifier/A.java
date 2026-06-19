package access_specifier;

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.test2();
    }

    int m = 20;

    void test2() {
        System.out.println("this is defalut method from A class");
        System.out.println(m * 5);
    }

    class Test2 {
        int n = 30;

        protected void test3() {
            System.out.println("this is a protected method fron A class");
        }

        public void test4() {
            System.out.println("this is public method from A class");
        }
    }
}