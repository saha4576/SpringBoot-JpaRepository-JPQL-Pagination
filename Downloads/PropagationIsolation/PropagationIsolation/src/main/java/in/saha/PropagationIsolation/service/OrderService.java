package in.saha.PropagationIsolation.service;

import in.saha.PropagationIsolation.entity.Order;
import in.saha.PropagationIsolation.repository.OrderRepository;
import in.saha.PropagationIsolation.repository.PaymentAuditRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private PaymentAuditService paymentAuditService;

    public OrderService(OrderRepository orderRepository,
                        PaymentAuditService paymentAuditService) {
        this.orderRepository = orderRepository;
        this.paymentAuditService = paymentAuditService;
    }

    @Transactional
    public void placeOrder(Order order) {
        orderRepository.save(order);

        paymentAuditService.audit(order);
    }
}
