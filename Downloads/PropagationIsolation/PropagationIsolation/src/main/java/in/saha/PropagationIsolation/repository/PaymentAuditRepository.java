package in.saha.PropagationIsolation.repository;

import in.saha.PropagationIsolation.entity.PaymentAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAuditRepository extends JpaRepository<PaymentAudit, Long> {
}
