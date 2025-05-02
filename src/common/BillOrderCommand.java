package common;

public record BillOrderCommand(String orderId) implements Message {
}
