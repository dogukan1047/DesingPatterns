
//önceden yazılmıs bir yazilim var ve biz bu yazilima yeni bir özellik eklemek istedik ve bu özellik arayüzümüzden imp edilemiyor
//bu durumda arayüzümüzü diğer arayüze adapte ederiz

public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}