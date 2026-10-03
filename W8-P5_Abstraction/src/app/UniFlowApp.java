package app;
import model.*;
import report.*;
public class UniFlowApp {
    public static void main(String[] args){
        AcademicModule module=new AdmissionModule();
        module.process();
        ReportGenerator report=new SimpleReportGenerator();
        System.out.println(report.generate());
    }
}
