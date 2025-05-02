package choreograpphy.services;

import common.BillingCompleted;
import common.MessageBus;
import common.OrderPlaced;

public class BillingService {
    public BillingService(MessageBus eventBus) {
        eventBus.subscribe(OrderPlaced.class, event -> {
            System.out.println("BillingService: Billing order " + event.orderId());
            eventBus.publish(new BillingCompleted(event.orderId()));
        });
    }
}