public class SmartLockerEncapsulationLab {
    static class Parcel {
        private static int count = 0;
        public static final double MAX_WEIGHT_KG = 20.0;
        private final String parcelId;
        private double weightKg;

        Parcel(String parcelId, double weightKg) {
            if (parcelId == null || parcelId.isBlank())
                throw new IllegalArgumentException("Parcel ID is required");
            this.parcelId = parcelId;
            setWeightKg(weightKg);
            count++;
        }

        String getParcelId() { return parcelId; }
        double getWeightKg() { return weightKg; }

        void setWeightKg(double weightKg) {
            if (weightKg <= 0 || weightKg > MAX_WEIGHT_KG)
                throw new IllegalArgumentException("Weight must be > 0 and <= 20 kg");
            this.weightKg = weightKg;
        }

        static int getCount() { return count; }

        @Override
        public String toString() {
            return String.format("Parcel{id='%s', weight=%.2f kg}", parcelId, weightKg);
        }
    }

    public static void main(String[] args) {
        Parcel p1 = new Parcel("PKG-201", 3.25);
        Parcel p2 = new Parcel("PKG-202", 1.10);

        System.out.println(p1);
        System.out.println("Created: " + Parcel.getCount());
        System.out.println("Limit: " + Parcel.MAX_WEIGHT_KG + " kg");
    }
}
