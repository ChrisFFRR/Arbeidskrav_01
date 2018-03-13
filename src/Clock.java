public class Clock extends Meter {
    double minTimeInterval, maxTimeInterval;

    public Clock() {
    }
    public Clock(String regNumber, boolean isWorking, String location, double minTimeInterval, double maxTimeInterval) {
        super(regNumber, isWorking, location);
        setMinTimeInterval(minTimeInterval);
        setMaxTimeInterval(maxTimeInterval);
    }

    public double getMinTimeInterval() {
        return minTimeInterval;
    }

    public void setMinTimeInterval(double minTimeInterval) {
        if(minTimeInterval > 0.0) {
            this.minTimeInterval = minTimeInterval;
        }
    }

    public double getMaxTimeInterval() {
        return maxTimeInterval;
    }

    public void setMaxTimeInterval(double maxTimeInterval) {
        this.maxTimeInterval = maxTimeInterval;
    }

    public String toString() {
        return "(Minste tidsintervall: " + getMinTimeInterval() + " - " + getMaxTimeInterval() + super.toString();
    }
}
