package CustomerPackage;

public class VipCustomer extends AbstractCustomer{
    public void askAQuestion() {
        askAVipQuestion();
    }

    private void askAVipQuestion() {
        System.out.println("\n*** Vip Customer: Asking a VIP question!");
    }
}
