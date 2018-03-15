public class Thermometer extends Meter {
    private int minTemp, maxTemp;

    public Thermometer() {}

    public Thermometer(int minTemp, int maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public Thermometer(String regNumber, boolean isWorking, String location, int minTemp, int maxTemp) {
        super(regNumber, isWorking, location);
        setMinTemp(minTemp);
        setMaxTemp(maxTemp);
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return  "\nTermometer:\n(Min- og maks temp: " + getMinTemp() + " - " + getMaxTemp() + ")"
                + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thermometer)) return false;

        Thermometer that = (Thermometer) o;

        if (getMinTemp() != that.getMinTemp()) return false;
        return getMaxTemp() == that.getMaxTemp();
    }
}
