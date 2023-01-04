public class WifiVisitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {
        if(tablet instanceof Ipad){
            System.out.println("Ipad wifi has open");
        } else if (tablet instanceof GalaxyTab) {
            System.out.println("Galaxy Tab does not have wifi option");
        } else {
            System.out.println("This object is not a tablet ");
        }
    }
}
