import java.io.IOException;

public class UniFlowExceptionLab {
    static class InvalidMarksException extends RuntimeException {
        InvalidMarksException(String message){super(message);}
    }

    static class Student {
        private int marks;

        Student(int marks){updateMarks(marks);}

        void updateMarks(int proposed){
            if(proposed<0||proposed>100)
                throw new InvalidMarksException("Marks must be from 0 to 100");
            marks=proposed;
        }

        int getMarks(){return marks;}
    }

    static void loadRecords(boolean fail) throws IOException {
        if(fail) throw new IOException("Records could not be loaded");
    }

    public static void main(String[] args){
        Student student=new Student(86);

        try {
            student.updateMarks(135);
            loadRecords(false);
        } catch(InvalidMarksException ex) {
            System.out.println(ex.getMessage());
        } catch(IllegalArgumentException | IllegalStateException ex) {
            System.out.println("Invalid operation: "+ex.getMessage());
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Marks after attempt: "+student.getMarks());
        }
    }
}
