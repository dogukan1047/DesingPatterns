public class ConcreteHandlerMp4 extends PlayerHandler{




    @Override
    public void play(String filePath) {
        if (filePath.equals("mp4")) {

            System.out.println("mp4 oynaltılıyor");
        } else {
            if(sonrakiHandler!=null)
                sonrakiHandler.play(filePath);

        }
    }
}
