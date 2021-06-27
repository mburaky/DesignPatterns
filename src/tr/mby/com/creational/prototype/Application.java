package tr.mby.com.creational.prototype;

public class Application {

    public static void main(String[] args) {

        EmployeeRecord e1 = new EmployeeRecord("Employee", 4000);
        EmployeeRecord e2 = (EmployeeRecord) e1.clone();

        e1.showRecord();
        System.out.println(e1);

        e2.showRecord();
        System.out.println(e2);

        // OUTPUT
        // EmployeeRecord{name='Employee', salary=4000.0}
        // tr.mby.com.creational.prototype.EmployeeRecord@1c20c684 -> Different objects references

        // EmployeeRecord{name='Employee', salary=4000.0}
        // tr.mby.com.creational.prototype.EmployeeRecord@1fb3ebeb -> Different objects references
    }
}
