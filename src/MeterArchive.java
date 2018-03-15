import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;

public class MeterArchive {
    List<Meter> instruments;

    public MeterArchive() {
       instruments = new ArrayList<>();
    }

    public List<Meter> getAllInstruments() {
        return  instruments;
    }

    public boolean addInstrument(Meter instrument) {
        instruments.add(instrument);
        return true;
    }

    public Meter getInstrument(String regNumber) {

        for(Meter instrument : instruments) {
            if(regNumber.equals(instrument.getRegNumber())) {
                System.out.println("\nHenter instrument med regnummer: " + instrument.getRegNumber());
                System.out.println(instrument.toString() + "\n");
                return instrument;
            }
        }
        return null;
    }

    public boolean removeInstrument(String regNumber) {

        System.out.println("Sletter instrument med regnummer: " + regNumber);
        for (Meter instrument : instruments) {
            if(regNumber.equals(instrument.getRegNumber())) {
                instruments.remove(instrument);
                return true;
            }
        }
        System.out.println("Ukjent regnummer!");
        System.out.println();
        return false;
    }

    public boolean changeLocation(String regNumber, String location) {

        for(Meter instrument : instruments) {
            if(regNumber.equals(instrument.getRegNumber())) {
                instrument.setLocation(location);
                System.out.println("Endrer posisjon for instrument med regnummer: " + instrument.getRegNumber());
                System.out.println("Endret!");
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public boolean changeWorkingStatus(String regNumber){
        for(Meter instrument : instruments) {
            if(regNumber.equals(instrument.getRegNumber())) {
                instrument.setWorking(false);
                System.out.println("\nSetter instrument med regnummer " + instrument.getRegNumber() + " til ikke i orden:\n");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s;
        s =  "Oversikt over alle instrumenter:\n";

        for(Meter instrument : instruments) {
            s += instrument.toString() + "\n";
        }
        return s;
    }
}
