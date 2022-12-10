public class FilmFinish {
    int lightsFinish;
    boolean screenMod;

    int voice;

    public FilmFinish(int lightsFinish, boolean screenMod, int voice) {
        this.lightsFinish = lightsFinish;
        this.screenMod = screenMod;

        this.voice = voice;

        Lights lights = new Lights();
        lights.lightsSet(lightsFinish);
        Popper popper = new Popper();
        popper.popperOff();
        Wide wide = new Wide();
        wide.wideOff();
        Projector projector = new Projector();
        projector.screenModSet(screenMod);
        projector.projectorOff();
        VoiceSystem voiceSystem = new VoiceSystem();
        voiceSystem.voiceSet(voice);
        voiceSystem.voiceSystemOff();
        DvdPlayer dvdPlayer = new DvdPlayer();
        dvdPlayer.dvdPlayerOff();


    }
}
