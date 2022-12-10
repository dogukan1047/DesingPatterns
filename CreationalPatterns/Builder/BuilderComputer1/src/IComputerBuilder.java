import Domain.*;

public interface IComputerBuilder {
    public RAM buildRAM();

    public CPU buildCPU();

    public HardDrive buildHardDrive();

    public GraphicCard buildGraphicCard();

    public Display buildDisplay();

    public Computer buildComputer();
}
