public class Facade {
    TcKimlikSistem tcKimlikSistem = new TcKimlikSistem();
    Sistem_1Kontrol sistem_1Kontrol = new Sistem_1Kontrol();
    Sistem_2Operations sistem_2Operations = new Sistem_2Operations();


    public void sistem_2UyeEkle(String Tc) {

        if (tcKimlikSistem.kontol(Tc) && !sistem_1Kontrol.karaListeConrtol(Tc)) {

            sistem_2Operations.uyeEkle(Tc);
        }

    }


}
