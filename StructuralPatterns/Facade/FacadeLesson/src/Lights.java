public class Lights {
    int lumen;

    public int lightsSet(int lumen) {

        this.lumen = lumen;
        return this.lumen;
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
        System.out.println(lumen);
    }
}
