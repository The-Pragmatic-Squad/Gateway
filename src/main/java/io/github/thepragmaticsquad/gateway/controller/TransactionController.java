package io.github.thepragmaticsquad.gateway.controller;

import io.github.thepragmaticsquad.gateway.enums.TransactionType;
import io.github.thepragmaticsquad.gateway.model.SimpleTransactionModel;
import io.github.thepragmaticsquad.gateway.service.TransactionPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionPublisher transactionPublisher;

    public TransactionController(TransactionPublisher transactionPublisher) {
        this.transactionPublisher = transactionPublisher;
    }

    @PostMapping()
    public String transaction(@RequestBody SimpleTransactionModel transaction) {
        transactionPublisher.processTransaction(transaction);
        return "Transaction is being processed...";
    }

}
