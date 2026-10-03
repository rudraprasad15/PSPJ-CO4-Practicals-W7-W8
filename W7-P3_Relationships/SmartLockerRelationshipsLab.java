public class SmartLockerRelationshipsLab {
    static class Parcel { final String id; Parcel(String id){this.id=id;} }
    static class Recipient { final String name; Recipient(String name){this.name=name;} }

    static class Locker {
        final int number; private Parcel parcel;
        Locker(int number){this.number=number;}
        boolean isEmpty(){return parcel==null;}
        void store(Parcel parcel){
            if(!isEmpty()) throw new IllegalStateException("Locker occupied");
            this.parcel=parcel;
        }
        Parcel release(){
            Parcel released=parcel;
            parcel=null;
            return released;
        }
    }

    static class LockerService {
        void assign(Locker locker, Parcel parcel, Recipient recipient){
            locker.store(parcel);
            System.out.println(parcel.id+" assigned to locker "+locker.number+" for "+recipient.name);
        }
        void collect(Locker locker){
            Parcel parcel=locker.release();
            System.out.println(parcel.id+" collected; locker "+locker.number+" is empty="+locker.isEmpty());
        }
    }

    public static void main(String[] args){
        Parcel parcel=new Parcel("PKG-301");
        Recipient recipient=new Recipient("Asha");
        Locker locker=new Locker(7);
        LockerService service=new LockerService();
        service.assign(locker,parcel,recipient);
        service.collect(locker);
    }
}
