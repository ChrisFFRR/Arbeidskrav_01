import java.util.ArrayList;
import java.util.List;

public class MeterArchive {
    List<Meter> instruments;

    public MeterArchive() {
       instruments = new ArrayList<>();
    }

    public List<Meter> getInstruments() {
        return instruments;
    }

    private boolean addInstrument(Meter instrument) {
        instruments.add(instrument);
        return true;
    }

}
