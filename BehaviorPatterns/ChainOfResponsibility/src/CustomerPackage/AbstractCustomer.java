package CustomerPackage;

public abstract class AbstractCustomer  implements Customer{
    @Override
    public void receiveAnswer(String answer) {
        System.out.println("Answer: " + answer);
    }
}
