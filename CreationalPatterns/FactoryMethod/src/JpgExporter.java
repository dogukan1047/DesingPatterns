 class JpgExporter  implements FileExporter{
     @Override
     public String export(String content) {
         return "JPG ->"+content;
     }
 }
