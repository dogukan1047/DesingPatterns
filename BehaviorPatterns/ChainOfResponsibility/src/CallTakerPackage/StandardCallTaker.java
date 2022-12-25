package CallTakerPackage;

import CustomerPackage.Customer;
import CustomerPackage.GoldCustomer;

public class StandardCallTaker extends AbstarctCallTaker{
    public StandardCallTaker(CallTaker next) {
        super(next);
    }

    @Override
    public void answer(Customer customer) {
        System.out.println("StandardCallTaker received a customer.");
        if (customer instanceof GoldCustomer)
            next.answer(customer);
        else {
            customer.askAQuestion();
            customer.receiveAnswer("Here is your answer!");
        }
        System.out.println();
    }
}
