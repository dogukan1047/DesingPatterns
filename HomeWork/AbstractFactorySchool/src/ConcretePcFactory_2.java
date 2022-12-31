public class ConcretePcFactory_2  implements PcFactory{
    @Override
    public AbstractHdd createHdd() {
        return new ConcreteHdd_2();
    }

    @Override
    public AbstractRam createRam() {
        return new ConcreteRam_1();
    }
}
