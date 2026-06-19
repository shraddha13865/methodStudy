package hierachical_inheritance;

public class Father {
    int eyes = 2;
    String colour = "white";

    public void nature() {
        System.out.println("my father nature is good");
    }
}
    class Mother extends Father {
        public void bahavier() {
            System.out.println("My mother behavier is good");
            System.out.println("my colour and father colour is same as " + colour);
        }
    }

    class Son extends Mother {
        public void choices() {
            System.out.println("My choices are different");
            System.out.println("my mother have " + eyes + " eyes");
        }
    }
        class Hierachical_inheritance {
            public static void main(String[] args) {
                Father father = new Father();
                father.nature();
                Mother mother = new Mother();
                mother.bahavier();
                mother.nature();
                Son son = new Son();
                son.nature();
                son.bahavier();
                son.choices();

            }
        }
