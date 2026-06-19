package thisAndSuperKyword1;

public class Mother1 {
    String colour = "black";
    int  height=23;

    public void eyes() {
        int eyes=2;
        System.out.println("My mother have same " + eyes + " eyes");
    }

    public static void Nature() {
        System.out.println("My mother nature is good");
    }
    public void height() {
        System.out.println("My mother height is " + height);
    }
    class Daughter extends Mother1{
        void face(){
            System.out.println("My daught face colour same as mother colour " +super.colour);
        }

    }
}
    class Test {
    public static void main(String[] args) {
        Mother1 mother1 = new Mother1();
        mother1.eyes();
        mother1.height();
        Mother1.Nature();
        
        System.out.println("colour is " + mother1.colour);
    }
}