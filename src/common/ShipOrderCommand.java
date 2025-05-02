package common;

public record ShipOrderCommand(String orderId) implements Message {
}
