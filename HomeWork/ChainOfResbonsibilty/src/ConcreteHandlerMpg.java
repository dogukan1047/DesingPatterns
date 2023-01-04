public class ConcreteHandlerMpg  extends PlayerHandler{

    @Override
    public void play(String filePath) {
        if (filePath.equals("mpg")) {

            System.out.println("mpg oynaltılıyor");
        } else {

            if(sonrakiHandler!=null)
            sonrakiHandler.play(filePath);

        }
    }
}
