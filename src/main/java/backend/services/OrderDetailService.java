package backend.services;

import backend.models.OrderDetail;
import backend.repositories.OrderDetailRepository;

public class OrderDetailService {
    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailService() {
        orderDetailRepository = new OrderDetailRepository();
    }
    public void insertOrderDetail(OrderDetail orderDetail){
        orderDetailRepository.insertOrderDetail(orderDetail);
    }
    public void updateOrderDetail(OrderDetail orderDetailNew){
        orderDetailRepository.update(orderDetailNew);
    }
}
