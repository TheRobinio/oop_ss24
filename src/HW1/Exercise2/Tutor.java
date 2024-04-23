package HW1.Exercise2;

public class Tutor extends Student  implements EmployeeView{

    private float salary;

    public Tutor(String name, String subjects, float salary) {
        super(name, subjects);
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return salary;
    }
}
