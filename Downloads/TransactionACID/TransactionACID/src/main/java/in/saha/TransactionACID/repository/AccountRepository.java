package in.saha.TransactionACID.repository;
import in.saha.TransactionACID.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AccountRepository  extends JpaRepository<Account, Long>  {
}
