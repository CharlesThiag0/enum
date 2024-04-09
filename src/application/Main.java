package application;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1280, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        System.out.println(OrderStatus.DELIVERED);
        System.out.println(OrderStatus.valueOf("DELIVERED"));
    }
}
