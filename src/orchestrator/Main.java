package orchestrator;

import orchestrator.services.BillingService;
import orchestrator.services.ShippingService;
import common.MessageBus;
import common.OrderPlaced;

public class Main {
    public static void main(String[] args) {
        MessageBus bus = new MessageBus();
        SagaStore sagaStore = new SagaStore();

        new OrderSaga(bus, sagaStore);
        new BillingService(bus);
        new ShippingService(bus);

        System.out.println("Starting new order flow...");
        bus.publish(new OrderPlaced("ORDER-789"));
    }
}

