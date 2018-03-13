public class Weight extends Meter {
    double minWeight, maxWeight;

    public Weight() {
    }

    public Weight(String regNumber, boolean isWorking, String location) {
        super(regNumber, isWorking, location);
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
        return "(Måleintervall: " + getMinWeight() + " - " + getMaxWeight() + ")" + super.toString();
    }

}
