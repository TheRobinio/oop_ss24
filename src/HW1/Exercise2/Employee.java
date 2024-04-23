package HW1.Exercise2;

public class Employee extends UniMember implements EmployeeView{

    private float salary;
    public Employee(String name, float salary) {
        super(name);
        this.salary = salary;

    }

    @Override
    public float getSalary() {
        return salary;
    }
}
