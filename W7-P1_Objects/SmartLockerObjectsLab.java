public class SmartLockerObjectsLab {
    static class Parcel {
        String parcelId;
        double weightKg;

        Parcel() { this("UNASSIGNED", 0.0); }
        Parcel(String parcelId) { this(parcelId, 0.0); }
        Parcel(String parcelId, double weightKg) {
            this.parcelId = parcelId;
            this.weightKg = weightKg;
        }

        void display() {
            System.out.printf("Parcel %s | %.2f kg%n", parcelId, weightKg);
        }
    }

    static class Recipient {
        String name;
        Recipient(String name) { this.name = name; }
    }

    static class Locker {
        int lockerNumber;
        Parcel parcel;

        Locker(int lockerNumber) { this.lockerNumber = lockerNumber; }

        void assign(Parcel parcel) { this.parcel = parcel; }

        void display() {
            System.out.println("Locker " + lockerNumber +
                (parcel == null ? " is empty" : " stores " + parcel.parcelId));
        }
    }

    public static void main(String[] args) {
        Parcel first = new Parcel();
        Parcel second = new Parcel("PKG-101", 2.50);
        Recipient recipient = new Recipient("Asha");
        Locker locker = new Locker(12);

        locker.assign(second);

        first.display();
        second.display();
        locker.display();
        System.out.println("Recipient: " + recipient.name);
    }
}
