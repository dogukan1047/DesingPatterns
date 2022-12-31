public class MainFactory {
    PcFactory pcFactory;
    AbstractHdd abstractHdd;
    AbstractRam abstractRam;

    public MainFactory(PcFactory pcFactory) {
        this.pcFactory = pcFactory;
        abstractHdd = pcFactory.createHdd();
        abstractRam = pcFactory.createRam();
    }

    public void birleştir(){


        System.out.println(abstractHdd.hddTur());
        abstractHdd.hddIslem();
        System.out.println(abstractRam.ramTur());
        abstractRam.ramIslem();
    }
}
