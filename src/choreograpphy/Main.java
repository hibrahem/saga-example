package choreograpphy;

import choreograpphy.services.BillingService;
import choreograpphy.services.OrderService;
import choreograpphy.services.ShippingService;
import common.MessageBus;

public class Main {
    public static void main(String[] args) {
        MessageBus bus = new MessageBus();
        new BillingService(bus);
        new ShippingService(bus);
        new OrderService(bus).placeOrder("ORDER-321");
    }
}
