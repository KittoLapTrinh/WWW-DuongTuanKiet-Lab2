package backend.services;

import backend.models.Order;
import backend.repositories.OrderRepository;

import java.util.Optional;

public class OrderSerivce {
    private OrderRepository orderRepository;
    public OrderSerivce(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void OrderService() {
        orderRepository = new OrderRepository();
    }
    public Optional<Order> getOrderLatest(){
        return orderRepository.getOrderLatest();
    }
    public void insertOrder(Order order){
        orderRepository.insertOrder(order);
    }
}
