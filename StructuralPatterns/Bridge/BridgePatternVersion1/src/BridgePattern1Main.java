public class BridgePattern1Main {
    public static void main(String[] args) {
    Shape redCircle=new Circle(100,100,10,new RedCircle());

        redCircle.draw();
    }
}