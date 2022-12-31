public class LinuxUI implements UI{
TemaUI temaUI;

    @Override
    public String show(TemaUI temaUI) {
        this.temaUI=temaUI;

        return temaUI.colorSettings()+"Linux";
    }
}
