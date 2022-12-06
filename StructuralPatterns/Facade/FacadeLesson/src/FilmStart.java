public class FilmStart {
    int lightsStart;
    boolean screenMod;
    String whichFilm;
    int voice;

    public FilmStart(int lightsStart, boolean screenMod, String whichFilm, int voice) {
        this.lightsStart = lightsStart;
        this.screenMod = screenMod;
        this.whichFilm = whichFilm;
        this.voice = voice;

        Lights lights = new Lights();
        lights.lightsSet(lightsStart);
        Popper popper = new Popper();
        popper.popperOn();
        popper.pop();
        Wide wide = new Wide();
        wide.wideOn();
        Projector projector = new Projector();
        projector.projectorOn();
        projector.screenModSet(screenMod);
        VoiceSystem voiceSystem = new VoiceSystem();
        voiceSystem.voiceSystemOn();
        voiceSystem.dvdSec(whichFilm);
        voiceSystem.voiceSet(voice);
        DvdPlayer dvdPlayer = new DvdPlayer();
        dvdPlayer.dvdPlayerOn();
        dvdPlayer.dvdPlayerRun();

    }
}
