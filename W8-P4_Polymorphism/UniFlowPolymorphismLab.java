public class UniFlowPolymorphismLab {
    static class Person {
        protected final String name;
        Person(String name) { this.name = name; }
        String roleSummary() { return "Person: " + name; }
    }

    static class Student extends Person {
        Student(String name) { super(name); }
        @Override
        String roleSummary() { return "Student " + name + " learns"; }
    }

    static class Faculty extends Person {
        Faculty(String name) { super(name); }
        @Override
        String roleSummary() { return "Faculty " + name + " teaches"; }
    }

    static class Administrator extends Person {
        Administrator(String name) { super(name); }
        @Override
        String roleSummary() { return "Administrator " + name + " manages"; }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Student("Ravi"),
            new Faculty("Meera"),
            new Administrator("Kiran")
        };
        for (Person person : people) System.out.println(person.roleSummary());
    }
}
