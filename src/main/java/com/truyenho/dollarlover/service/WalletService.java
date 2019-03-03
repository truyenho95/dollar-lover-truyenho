package com.truyenho.dollarlover.service;

import com.truyenho.dollarlover.model.Wallet;

public interface WalletService {

    Wallet findById(Long id);

    Iterable<Wallet> findAll();

    void save(Wallet wallet);

    void remove(Long id);

}
