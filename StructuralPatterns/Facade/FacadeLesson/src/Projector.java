public class Projector {

    String ekranModu;

    public void projectorOn(){
        System.out.println("Projector acildi");
    }

    public void projectorOff(){
        System.out.println("Projector kapandi");

    }
    public void screenModSet(boolean ekran){

        if(ekran==true){

            ekranModu="Genis";
        }else{

            ekranModu="Dikey";
        }

        System.out.println(ekranModu);

    }
}
