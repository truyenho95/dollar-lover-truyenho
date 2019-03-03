package com.truyenho.dollarlover.repository;

import com.truyenho.dollarlover.model.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository("WalletRepository")
@CrossOrigin(origins = "*", maxAge = 3600)
public interface WalletRepository extends CrudRepository<Wallet, Long> {
}
