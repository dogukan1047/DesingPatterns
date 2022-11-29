import java.util.HashSet;
import java.util.Set;

public class AppTest {
    public static void main(String[] args) {

        Double Product1=AppFactory.getInstance(AppFactory.Market.Amazon).Listele();
        Double Product2=AppFactory.getInstance(AppFactory.Market.Hepsiburada).Listele();
        Double Product3=AppFactory.getInstance(AppFactory.Market.Trendyol).Listele();


        Set<Double> Prices=new HashSet<>();

        Double enbuyuk = Product1;
        String Magaza="Amazon";

        if(Product2 > enbuyuk) {
            enbuyuk = Product2;
            Magaza="Hepsiburada";
        }
        if(Product3 > enbuyuk) {
            enbuyuk = Product3;
            Magaza="Tredyol";
        }


        System.out.println(Magaza+" "+enbuyuk);

    }
}