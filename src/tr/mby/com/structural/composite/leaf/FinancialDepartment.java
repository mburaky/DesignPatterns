package tr.mby.com.structural.composite.leaf;

import tr.mby.com.structural.composite.component.Department;

public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public FinancialDepartment() {
    }

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(this.getName());
    }

}
