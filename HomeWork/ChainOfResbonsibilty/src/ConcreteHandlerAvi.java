public class ConcreteHandlerAvi extends PlayerHandler {

    @Override
    public void play(String filePath) {
        if (filePath.equals("avi")) {

            System.out.println("avi oynaltılıyor");
        } else {
            System.out.println("gecersiz dosya bicimi");

        }
    }
}
