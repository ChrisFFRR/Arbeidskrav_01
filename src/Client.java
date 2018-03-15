

public class Client {
    public static void main(String[] args) {
        MeterArchive test = new MeterArchive();

        test.fillList();

        System.out.println(test.toString());
        System.out.println();


        //forsøker å slette og endre plassering på objekter med feil registreringsnummer som paramenter
        test.removeInstrument("K10");
        test.changeLocation("K00", "R101B1");

        //slette et objekt, nå med riktig regnumme parameter
        test.removeInstrument("K01");

        System.out.println(test.toString());
        System.out.println();

        //forandrer status på objekt fra i orden til i uorden
        test.changeWorkingStatus("V02");
        test.getInstrument("V02");

        System.out.println(test.toString());
        System.out.println();

        //printer listen med alle instrumentobjekter
        System.out.println(test.getAllInstruments());

    }




}
