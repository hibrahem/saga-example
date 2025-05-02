package orchestrator.services;

import common.MessageBus;
import common.ShipOrderCommand;
import common.ShippingCompleted;

public class ShippingService {
    public ShippingService(MessageBus bus) {
        bus.subscribe(ShipOrderCommand.class, cmd -> {
            System.out.println("Orchestrator.services.ShippingService: Shipping order " + cmd.orderId());
            // Simulate processing
            bus.publish(new ShippingCompleted(cmd.orderId()));
        });
    }
}
