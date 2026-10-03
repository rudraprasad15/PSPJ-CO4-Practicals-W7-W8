package app;
import model.*;
import service.*;
public class SmartLockerApp {
    public static void main(String[] args){
        Notifiable user=new Recipient("Asha");
        LockerOperation operation=new LockerOperation(){
            protected void perform(){System.out.println("Parcel assigned");}
        };
        operation.execute();
        user.notifyUser("Pickup code 4821");
    }
}
