package choreograpphy.services;

import common.BillingCompleted;
import common.MessageBus;
import common.ShippingCompleted;

public class ShippingService {
    public ShippingService(MessageBus eventBus) {
        eventBus.subscribe(BillingCompleted.class, event -> {
            System.out.println("ShippingService: Shipping order " + event.orderId());
            eventBus.publish(new ShippingCompleted(event.orderId()));
        });
    }
}
