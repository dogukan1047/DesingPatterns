public class G5_Visitor implements Visitor{
    @Override
    public void visit(Tablet tablet) {

        if(tablet instanceof Ipad){
            System.out.println("Ipad does not have 5G option");
        } else if (tablet instanceof GalaxyTab) {
            System.out.println("Galaxy Tab 5G has open");
        } else {
            System.out.println("This object is not a tablet ");
        }
    }
}
