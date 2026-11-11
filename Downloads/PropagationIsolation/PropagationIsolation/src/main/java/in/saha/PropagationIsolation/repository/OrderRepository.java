package in.saha.PropagationIsolation.repository;

import in.saha.PropagationIsolation.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public  interface OrderRepository extends JpaRepository<Order, Long>{
}
