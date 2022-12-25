public class DogFeeder implements Feeder{
    @Override
    public void feed(Animal a) {
        System.out.println("Feeding the dog " + a.getName());
    }//burada polimorfizmden yararlanılarak besleme metodu gerçekleştirildi

}
