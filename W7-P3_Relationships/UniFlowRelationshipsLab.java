import java.util.ArrayList;
import java.util.List;

public class UniFlowRelationshipsLab {
    static class Course { final String code; Course(String code){this.code=code;} }

    static class Department {
        final String name;
        private final List<Course> courses=new ArrayList<>();
        Department(String name){this.name=name;}
        void addCourse(Course course){courses.add(course);}
    }

    static class Student {
        final String id;
        private final List<Course> registered=new ArrayList<>();
        Student(String id){this.id=id;}
        void register(Course course){registered.add(course);}
        int courseCount(){return registered.size();}
    }

    static class AcademicService {
        void register(Student student, Course course){
            student.register(course);
            System.out.println(student.id+" registered for "+course.code);
        }
    }

    public static void main(String[] args){
        Department cse=new Department("CSE");
        Course pspj=new Course("26SC1101E");
        cse.addCourse(pspj);
        Student student=new Student("24003");
        new AcademicService().register(student,pspj);
        System.out.println("Registered courses: "+student.courseCount());
    }
}
