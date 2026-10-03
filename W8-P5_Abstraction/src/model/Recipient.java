package model;
public class Recipient implements Notifiable {
    private final String name;
    public Recipient(String name){this.name=name;}
    public void notifyUser(String message){System.out.println(name+": "+message);}
}
