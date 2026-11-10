package in.saha.TransactionACID.repository;

import in.saha.TransactionACID.entity.TransferRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferRecord, Long> {
}
