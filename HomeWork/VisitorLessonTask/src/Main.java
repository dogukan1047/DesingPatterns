public class Main {
    public static void main(String[] args) {
      Ipad ipad=new Ipad("10plus","Apple");
      GalaxyTab galaxyTab=new GalaxyTab("Note 10","Samsung");

      ipad.accept(new WifiVisitor());
      galaxyTab.accept(new G5_Visitor());

    }
}