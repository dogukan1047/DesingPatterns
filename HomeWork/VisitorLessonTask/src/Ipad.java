public class Ipad extends Tablet {
    public Ipad(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
