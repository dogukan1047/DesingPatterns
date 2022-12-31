public class ConcretePcFactory_1 implements PcFactory{
    @Override
    public AbstractHdd createHdd() {
        return new ConcreteHdd_1();
    }

    @Override
    public AbstractRam createRam() {
        return new ConcreteRam_2();
    }
}
