package HW1.Exercise2;

public class UniMember implements UniMemberView {

    private final String name;

    public UniMember(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
