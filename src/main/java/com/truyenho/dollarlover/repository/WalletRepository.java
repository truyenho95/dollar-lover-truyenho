package com.truyenho.dollarlover.repository;

import com.truyenho.dollarlover.model.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("WalletRepository")
public interface WalletRepository extends CrudRepository<Wallet, Long> {
}
