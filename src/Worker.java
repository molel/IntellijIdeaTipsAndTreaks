public class Worker extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, float weight, float height, int salary) {
        super(name, age, weight, height);
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("I'm working...");
    }

}
