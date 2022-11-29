import java.util.Set;

public class AppFactory  {

    public static ProductGet getInstance(Market market){
        switch (market)  {
            case Hepsiburada: return new Hepsiburada();
            case Amazon:return new Amazon();
            case Trendyol:return new Trendyol();
            default: throw new UnsupportedOperationException();
        }
    }



    public enum Market {
       Hepsiburada,
        Amazon,
        Trendyol,
    }
}
