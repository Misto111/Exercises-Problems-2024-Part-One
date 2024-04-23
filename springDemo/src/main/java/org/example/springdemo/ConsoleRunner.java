package org.example.springdemo;

import jakarta.transaction.Transactional;
import org.example.springdemo.models.User;
import org.example.springdemo.services.AccountService;
import org.example.springdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private final UserService userService;
    private AccountService accountService;

    @Autowired
    public ConsoleRunner(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = this.userService.findByUsername("Bachi");
        this.accountService.
                depositMoney(BigDecimal.TEN, user.getAccountsIds().get(0));
        this.accountService
                .withdrawMoney(BigDecimal.ONE, user.getAccountsIds().get(0));

    }
}
