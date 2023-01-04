public class Main {
    public static void main(String[] args) {

        PlayerHandler mp4Handler=new ConcreteHandlerMp4();
        PlayerHandler mpgHandler=new ConcreteHandlerMpg();
        PlayerHandler aviHandler=new ConcreteHandlerAvi();


        mp4Handler.sonrakiHandler=mpgHandler;
        mpgHandler.sonrakiHandler=aviHandler;


        mp4Handler.play("mp4");
        mp4Handler.play("avi");
        mp4Handler.play("mpg");
        mp4Handler.play("swf");

    }
}