public class WinUI implements UI {
    TemaUI temaUI;

    @Override
    public String show(TemaUI temaUI) {
        this.temaUI = temaUI;

        return temaUI.colorSettings();
    }
}
