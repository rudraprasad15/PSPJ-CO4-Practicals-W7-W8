public class SmartLockerPolymorphismLab {
    static abstract class Recipient {
        protected final String name;
        Recipient(String name) { this.name = name; }
        abstract void notifyPickup(String code);
    }

    static class StudentRecipient extends Recipient {
        StudentRecipient(String name) { super(name); }
        @Override
        void notifyPickup(String code) {
            System.out.println("Student app -> " + name + ": collect with " + code);
        }
    }

    static class StaffRecipient extends Recipient {
        StaffRecipient(String name) { super(name); }
        @Override
        void notifyPickup(String code) {
            System.out.println("Staff email -> " + name + ": collect with " + code);
        }
    }

    public static void main(String[] args) {
        Recipient[] recipients = {
            new StudentRecipient("Asha"),
            new StaffRecipient("Dr Rao")
        };
        for (Recipient r : recipients) r.notifyPickup("4821");
    }
}
