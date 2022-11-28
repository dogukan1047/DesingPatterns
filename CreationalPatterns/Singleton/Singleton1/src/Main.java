public class Main {
    public static void main(String[] args) {
   SngClass1 sngClass1=SngClass1.getInstance();
   SngClass1 sngClass11=SngClass1.getInstance();

   if(sngClass1 == sngClass11){
       System.out.println("Same");
   }else{
       System.out.println("Not same");
   }
    }
}