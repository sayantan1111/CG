import java.time.LocalDate;

class Order {
    String orderId;
    LocalDate orderDate;

    Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class I21 {
    public static void main(String[] args) {
        Order order = new Order("O001", LocalDate.of(2025, 4, 1));
        ShippedOrder shipped = new ShippedOrder("O002", LocalDate.of(2025, 4, 2), "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O003", LocalDate.of(2025, 4, 3), "TRK67890", LocalDate.of(2025, 4, 4));

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
