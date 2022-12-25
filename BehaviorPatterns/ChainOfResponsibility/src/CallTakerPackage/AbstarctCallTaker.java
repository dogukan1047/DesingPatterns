package CallTakerPackage;

import CustomerPackage.Customer;

public  abstract class AbstarctCallTaker implements CallTaker{
    protected CallTaker next;
    protected Customer customer;

    public AbstarctCallTaker(CallTaker next) {
        this.next = next;
    }

    public CallTaker getNext() {
        return next;
    }

    public void setNext(CallTaker next) {
        this.next = next;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
