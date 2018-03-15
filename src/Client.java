import java.util.List;

public class Client {
    public static void main(String[] args) {
        MeterArchive test = new MeterArchive();
        /*Clock klokke1 = new Clock("K01", true, "R101A1", 0.1);
        Clock klokke2 = new Clock("K02", true, "R102A1", 1);
        Clock klokke3 = new Clock("K03", true, "R103A1", 1.2);
        Thermometer termo1 = new Thermometer("T01", true, "R101A2", -5, 10);
        Thermometer termo2 = new Thermometer("T02", true, "R102A2", 0, 50);
        Thermometer termo3 = new Thermometer("T03", true, "R103A2", 5, 30);
        Weight vekt1 = new Weight("V01", true, "R101A3", 0.5, 30);
        Weight vekt2 = new Weight("V02", true, "R102A3", 0.5, 30);
        Weight vekt3 = new Weight("V03", false, "R103A3", 0.5, 30);
        */
        test.addInstrument(new Clock("K01", true, "R101A1", 0.1));
        test.addInstrument(new Clock("K02", true, "R102A1", 1));
        test.addInstrument(new Clock("K03", true, "R103A1", 1.2));
        test.addInstrument(new Thermometer("T01", true, "R101A2", -5, 10));
        test.addInstrument(new Thermometer("T02", true, "R102A2", 0, 50));
        test.addInstrument(new Thermometer("T03", true, "R103A2", 5, 30));
        test.addInstrument(new Weight("V01", true, "R101A3", 0.5, 30));
        test.addInstrument(new Weight("V02", true, "R102A3", 0.5, 30));
        test.addInstrument(new Weight("V03", false, "R103A3", 0.5, 30));

        System.out.println(test.toString());
        System.out.println();

        test.removeInstrument("K10");
        test.changeLocation("K01", "R101B1");
        System.out.println(test.toString());
        System.out.println();
        test.removeInstrument("K10");
        test.removeInstrument("K01");
        System.out.println(test.toString());
        System.out.println();

        System.out.println(test.getAllInstruments());



        //test.changeWorkingStatus("A01");




        //test.removeInstrument(klokke.getRegNumber());



        //System.out.println(test.getInstrument("A02").toString());


    }




}
