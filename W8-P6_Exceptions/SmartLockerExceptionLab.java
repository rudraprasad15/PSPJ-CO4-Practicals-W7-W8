import java.util.Scanner;

public class SmartLockerExceptionLab {
    static class InvalidCollectionCodeException extends Exception {
        InvalidCollectionCodeException(String message){super(message);}
    }

    static class Locker {
        private String parcelId;
        private final String code;

        Locker(String code){this.code=code;}

        void assign(String id){
            if(id==null||id.isBlank())
                throw new IllegalArgumentException("Parcel ID required");
            if(parcelId!=null)
                throw new IllegalStateException("Locker occupied");
            parcelId=id;
        }

        void collect(String entered) throws InvalidCollectionCodeException {
            if(!code.equals(entered))
                throw new InvalidCollectionCodeException("Collection code is incorrect");
            parcelId=null;
        }

        String state(){return parcelId==null?"EMPTY":"OCCUPIED by "+parcelId;}
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Locker locker=new Locker("4821");
        locker.assign("PKG-601");

        try {
            System.out.print("Collection code: ");
            locker.collect(input.nextLine());
            System.out.println("Collection completed");
        } catch(InvalidCollectionCodeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Final locker state: "+locker.state());
            input.close();
        }
    }
}
