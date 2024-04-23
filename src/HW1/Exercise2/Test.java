package HW1.Exercise2;

public class Test {

    public static void main(String[] args) {
        EmployeeView phD = new PhD("Karl",300);
        System.out.println(phD.getName());
        System.out.println(phD.getSalary());

        Tutor tutor = new Tutor("Klaus","Chemistry",100);
        System.out.println(tutor.getName());
        System.out.println(tutor.getSubject());
        System.out.println(tutor.getSalary());

        StudentView student = new Student("Emil","Economics");
        System.out.println(student.getName());
        System.out.println(student.getSubject());
    }
}
