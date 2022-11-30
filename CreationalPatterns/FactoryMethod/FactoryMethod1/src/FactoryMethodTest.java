
//!!! It solves the problem, but we will have to write multiple ifs in the future.

public class FactoryMethodTest {
    public static void main(String[] args) {
     String fileExcel=FileExportFactory.getInstance(FileExportFactory.FileType.EXCEL).export("Test");
        System.out.println(fileExcel);
    }
}