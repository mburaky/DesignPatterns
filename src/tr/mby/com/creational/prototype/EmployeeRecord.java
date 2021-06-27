package tr.mby.com.creational.prototype;

public class EmployeeRecord implements Prototype {

    String name;

    double salary;

    public EmployeeRecord(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showRecord() {
        System.out.println(
                "EmployeeRecord{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}'
        );
    }

    @Override
    public Prototype clone() {
        return new EmployeeRecord(name, salary);
    }
}
