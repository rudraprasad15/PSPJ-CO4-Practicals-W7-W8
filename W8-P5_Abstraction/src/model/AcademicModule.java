package model;
public abstract class AcademicModule {
    protected final String name;
    protected AcademicModule(String name){this.name=name;}
    public abstract void process();
}
