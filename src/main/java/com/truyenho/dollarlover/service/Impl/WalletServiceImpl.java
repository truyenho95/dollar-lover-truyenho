package com.truyenho.dollarlover.service.Impl;

import com.truyenho.dollarlover.model.Wallet;
import com.truyenho.dollarlover.repository.WalletRepository;
import com.truyenho.dollarlover.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("WalletService")
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Override
    public Wallet findById(Long id) {
        return walletRepository.findById(id).get();
    }

    @Override
    public Iterable<Wallet> findAll() {
        return walletRepository.findAll();
    }

    @Override
    public void save(Wallet wallet) {
        walletRepository.save(wallet);
    }

    @Override
    public void remove(Long id) {
        walletRepository.deleteById(id);
    }
}
