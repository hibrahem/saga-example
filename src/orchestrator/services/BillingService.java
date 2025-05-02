package orchestrator.services;

import common.BillOrderCommand;
import common.BillingCompleted;
import common.MessageBus;

public class BillingService {
    public BillingService(MessageBus bus) {
        bus.subscribe(BillOrderCommand.class, cmd -> {
            System.out.println("BillingService: Billing order " + cmd.orderId());
            // Simulate processing
            bus.publish(new BillingCompleted(cmd.orderId()));
        });
    }
}