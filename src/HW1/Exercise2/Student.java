package HW1.Exercise2;

public class Student extends UniMember implements StudentView
{

    private String subject;

    public Student(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    @Override
    public String getSubject() {
        return subject;
    }
}
