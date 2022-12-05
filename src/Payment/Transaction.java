package Payment;

import Auth.Models.User;
import Services.AbstractService.AbstractService;

public class Transaction {
    private User user;

    public User getUser() {
        return user;
    }

    private AbstractService service;
    private float amount;

    public Transaction(AbstractService service, float amount) {
        this.user = User.getInstance();
        this.service = service;
        this.amount = amount;
    }

    public AbstractService getService() {
        return service;
    }

    public float getAmount() {
        return amount;
    }
}