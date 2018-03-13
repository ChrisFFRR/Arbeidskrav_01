public abstract class Meter {

    String regNumber, location;
    boolean isWorking;

    public Meter() {
        this("Unknown", false, "Unknown");
    }

    public Meter(String regNumber, boolean isWorking, String location ) {
        setRegNumber(regNumber);
        setWorking(isWorking);
        setLocation(location);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getLocation() {
        return location;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    public boolean isWorking() {
        return isWorking;
    }

    private void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        if(isWorking) {
            return  "\nRegnummer: " + getRegNumber()  +
                    "\nPlassering: " + getLocation() +
                    "\nStatus: i orden";
        }
        else return
                "\nRegnummer: " + getRegNumber() +
                        "\nPlassering: " + getLocation() +
                        "\nStatus: i uorden";

    }
}
