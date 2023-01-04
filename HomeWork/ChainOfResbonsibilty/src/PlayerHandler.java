public abstract class PlayerHandler {
protected PlayerHandler sonrakiHandler;



    public abstract void play(String filePath);


    public void setSonrakiHandler(PlayerHandler sonrakiHandler) {
        this.sonrakiHandler = sonrakiHandler;
    }
}
