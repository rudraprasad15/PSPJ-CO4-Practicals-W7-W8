public class UniFlowEncapsulationLab {
    static class Student {
        private static int count;
        private final String id;
        private String name;
        private int marks;
        private double attendance;

        Student(String id, String name, int marks, double attendance) {
            if (id == null || id.isBlank())
                throw new IllegalArgumentException("ID required");
            this.id = id;
            setName(name);
            setMarks(marks);
            setAttendance(attendance);
            count++;
        }

        void setName(String name) {
            if (name == null || name.isBlank())
                throw new IllegalArgumentException("Name required");
            this.name = name;
        }

        void setMarks(int marks) {
            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException("Marks 0-100");
            this.marks = marks;
        }

        void setAttendance(double attendance) {
            if (attendance < 0 || attendance > 100)
                throw new IllegalArgumentException("Attendance 0-100");
            this.attendance = attendance;
        }

        static int getCount() { return count; }

        @Override
        public String toString() {
            return String.format(
                "Student{%s, %s, marks=%d, attendance=%.1f%%}",
                id, name, marks, attendance
            );
        }
    }

    public static void main(String[] args) {
        Student s = new Student("24002", "Meera", 86, 92.5);
        s.setMarks(90);

        System.out.println(s);
        System.out.println("Students created: " + Student.getCount());
    }
}
