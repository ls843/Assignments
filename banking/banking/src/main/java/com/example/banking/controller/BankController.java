package com.example.banking.controller;

import com.example.banking.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/deposit")
    public String deposit(@RequestParam int amount) {
        bankService.deposit(amount);
        return "Deposited " + amount;
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam int amount) {
        try {
            bankService.withdraw(amount);
            return "Withdrawn " + amount;
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    @GetMapping("/balance")
    public String balance() {
        return "Current balance: " + bankService.getBalance();
    }
}