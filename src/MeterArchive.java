
import java.util.ArrayList;
import java.util.List;
/*
Klasse for å holde Instrumenter. Inneholder metode som fyller Listen med klokke, vekt og termometer-objekter,
og metoder som ved å iterere gjennom objekter i en List av type Meter, legger til, sletter, returnerer et eller alle objektene,
forandrer plassering, forandrer status og tilslutt en toString som returnerer ut alle objektene i listen.

Metodene inneholder system.out.prints for debugging formål.
 */
public class MeterArchive {
   private List<Meter> instruments;

    public MeterArchive() {
       instruments = new ArrayList<>();
    }

    public void fillList() {
        addInstrument(new Clock("K01", true, "R101A1", 0.1));
        addInstrument(new Clock("K02", true, "R102A1", 1));
        addInstrument(new Clock("K03", true, "R103A1", 1.2));
        addInstrument(new Thermometer("T01", true, "R101A2", -5, 10));
        addInstrument(new Thermometer("T02", true, "R102A2", 0, 50));
        addInstrument(new Thermometer("T03", true, "R103A2", 5, 30));
        addInstrument(new Weight("V01", true, "R101A3", 0.5, 30));
        addInstrument(new Weight("V02", true, "R102A3", 0.5, 30));
        addInstrument(new Weight("V03", false, "R103A3", 0.5, 30));
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

        System.out.println("Endrer posisjon for instrument med regnummer: " + regNumber);
        for(Meter instrument : instruments) {
            if(regNumber.equals(instrument.getRegNumber())) {
                instrument.setLocation(location);
                //System.out.println("Endrer posisjon for instrument med regnummer: " + instrument.getRegNumber());
                System.out.println("Endret!\n");
                System.out.println();
                return true;
            }
        }
        System.out.println("Ukjent regnummer!\n");
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
