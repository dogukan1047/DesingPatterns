import Domain.Computer;
import Domain.Display;
import Domain.RAM;

public class BuilderMain1 {
    public static void main(String[] args) {
        IComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder.buildComputer();
        computer.start();

        RAM ram = builder.buildRAM();
        Display display = builder.buildDisplay();
    }
}