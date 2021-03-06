/*
Subklasse av meter. Inneholder ikke noen funksjoner utenom standard oppsett.
 */

public class Clock extends Meter {
    private double minTimeInterval;

    public Clock() {
        this("ukjent", false, "ukjent",0);
    }

    public Clock(String regNumber, boolean isWorking, String location, double minTimeInterval) {
        super(regNumber, isWorking, location);
        setMinTimeInterval(minTimeInterval);

    }

    public double getMinTimeInterval() {
        return minTimeInterval;
    }

    public void setMinTimeInterval(double minTimeInterval) {
        if(minTimeInterval > 0.0) {
            this.minTimeInterval = minTimeInterval;
        }
    }

    public String toString() {


        return "\nKlokke:\n(Minste tidsintervall: " + getMinTimeInterval() + "s)" + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clock)) return false;

        Clock clock = (Clock) o;

        return Double.compare(clock.getMinTimeInterval(), getMinTimeInterval()) == 0;
    }

}
