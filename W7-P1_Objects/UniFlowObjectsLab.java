public class UniFlowObjectsLab {
    static class Student {
        String id;
        String name;
        double cgpa;

        Student(String id, String name) { this(id, name, 0.0); }

        Student(String id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        void display() {
            System.out.printf("%s | %s | CGPA %.2f%n", id, name, cgpa);
        }
    }

    static class Course {
        String code;
        String title;
        Course(String code, String title) {
            this.code = code;
            this.title = title;
        }
    }

    public static void main(String[] args) {
        Student original = new Student("24001", "Ravi", 8.20);
        Student alias = original;
        alias.cgpa = 8.55;

        original.display();

        Course pspj = new Course("26SC1101E", "PSPJ");
        System.out.println("Course: " + pspj.code + " " + pspj.title);

        Student pending = null;
        System.out.println("Pending reference is null: " + (pending == null));
    }
}
