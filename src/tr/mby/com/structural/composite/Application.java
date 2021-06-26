package tr.mby.com.structural.composite;

import tr.mby.com.structural.composite.component.Department;
import tr.mby.com.structural.composite.composite.HeadDepartment;
import tr.mby.com.structural.composite.leaf.FinancialDepartment;
import tr.mby.com.structural.composite.leaf.SalesDepartment;

public class Application {

    public static void main(String[] args) {
        HeadDepartment head = new HeadDepartment(0, "Head Department");

        Department finance = new FinancialDepartment(1, "Financial Department");
        Department sales = new SalesDepartment(2, "Sales Department");

        head.addDepartment(finance);
        head.addDepartment(sales);

        head.printDepartmentName();

        // OUTPUT
        // Departments under Head Department
        // Financial Department
        // Sales Department
    }
}
