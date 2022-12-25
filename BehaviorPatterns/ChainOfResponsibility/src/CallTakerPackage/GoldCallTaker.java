package CallTakerPackage;

import CustomerPackage.Customer;
import CustomerPackage.VipCustomer;

public class GoldCallTaker extends AbstarctCallTaker{
    public GoldCallTaker(CallTaker next) {
        super(next);
    }

    @Override
    public void answer(Customer customer) {
        System.out.println("GoldCallTaker received a customer.");
        if (customer instanceof VipCustomer)
            next.answer(customer);
        else {
            customer.askAQuestion();
            customer.receiveAnswer("Here is your GOLD answer!");
        }
        System.out.println();
    }
}
