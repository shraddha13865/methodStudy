package inheritanceStudy1;

public class Employee {
    int salary = 200000;
    String name = "Aisha";

    protected void work() {
        System.out.println("My Employee is working");
    }
}
    class Manager extends Employee {
        int bonus = 34000;

       protected void manage() {
            System.out.println("My manager is managing team");
        }

        public static void main(String[] args) {
            Manager manager = new Manager();
            System.out.println(manager.name);
            System.out.println(manager.salary);
            System.out.println(manager.bonus);
            manager.work();
            manager.manage();
        }
     }

