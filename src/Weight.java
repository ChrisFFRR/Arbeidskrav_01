/*
Subklasse av meter. Inneholder ikke noen funksjoner utenom standard oppsett.
 */

public class Weight extends Meter {
    private double minWeight, maxWeight;

    public Weight() {
        this("ukjent", false, "ukjent", 0, 0);
    }

    public Weight(String regNumber, boolean isWorking, String location, double minWeight, double maxWeight) {
        super(regNumber, isWorking, location);
        setMinWeight(minWeight);
        setMaxWeight(maxWeight);
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        if (minWeight > 0.0) {
            this.minWeight = minWeight;
        }
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String toString() {
        return "\nVekt:\n(Måleintervall: " + getMinWeight() + " - " + getMaxWeight() + ")" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weight)) return false;

        Weight weight = (Weight) o;

        if (Double.compare(weight.getMinWeight(), getMinWeight()) != 0) return false;
        return Double.compare(weight.getMaxWeight(), getMaxWeight()) == 0;
    }


}
