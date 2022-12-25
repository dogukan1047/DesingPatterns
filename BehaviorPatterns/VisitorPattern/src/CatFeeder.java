public class CatFeeder implements Feeder{
    @Override
    public void feed(Animal a) {
        System.out.println("Feeding the cat " + a.getName());
    }//burada polimorfizmden yararlanılarak besleme metodu gerçekleştirildi
}
