public class FactoryMethodTest {
    public static void main(String[] args) {
     String fileExcel=FileExportFactory.getInstance(FileExportFactory.FileType.EXCEL).export("Test");
        System.out.println(fileExcel);
    }
}