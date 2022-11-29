public class FactoryMethodTest {
    public static void main(String[] args) {
     String fileExcel=FileExportFactory.getInstance(FileExportFactory.FileType.PDF).export("Test");
        System.out.println(fileExcel);
    }
}