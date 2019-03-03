package com.truyenho.dollarlover.controller;

import com.truyenho.dollarlover.model.Wallet;
import com.truyenho.dollarlover.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class WalletController {
    @Autowired
    private WalletService walletService;

    @RequestMapping(value = "/wallet", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Wallet>> listAllWallets() {
        Iterable<Wallet> wallets = walletService.findAll();
        if (wallets == null) {
            return new ResponseEntity<Iterable<Wallet>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<Wallet>>(wallets, HttpStatus.OK);
    }

    @RequestMapping(value = "/wallet", method = RequestMethod.POST)
    public ResponseEntity<Void> createCategory(@RequestBody Wallet wallet, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating Wallet " + wallet.getId());
        System.out.println("Creating Wallet " + wallet.getName());

        walletService.save(wallet);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/wallet/{id}").buildAndExpand(wallet.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
