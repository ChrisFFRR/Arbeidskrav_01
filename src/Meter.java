import java.util.Objects;

/*
Abstrakt superklasse inneholder: ikke-parametrisk og parametrisk konstruktør,
getters'n'setters, toString og equals metoder
 */

public abstract class Meter {

    private String regNumber, location;
    private boolean isWorking;

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

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        String returnString;

        returnString = "\nRegnummer: " + getRegNumber() + "\nPlassering: " + getLocation();

        if(isWorking) {

            returnString +=  "\nStatus: i orden";
        }
        else {

            returnString += "\nStatus: i uorden";
        }

        return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meter)) return false;

        Meter meter = (Meter) o;

        return isWorking == meter.isWorking &&
                Objects.equals(regNumber, meter.regNumber) &&
                Objects.equals(location, meter.location);
    }
}
