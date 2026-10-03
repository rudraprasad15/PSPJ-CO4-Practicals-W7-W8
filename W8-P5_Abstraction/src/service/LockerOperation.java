package service;
public abstract class LockerOperation {
    public final void execute(){validate(); perform();}
    protected void validate(){System.out.println("Validation completed");}
    protected abstract void perform();
}
