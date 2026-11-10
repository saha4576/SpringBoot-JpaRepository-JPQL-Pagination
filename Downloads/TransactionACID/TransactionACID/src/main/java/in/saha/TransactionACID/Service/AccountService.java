package in.saha.TransactionACID.Service;

import in.saha.TransactionACID.entity.Account;
import in.saha.TransactionACID.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account) {
        accountRepository.save(account);
    }
}

