package com.example.test.controler;

import com.example.test.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class AccountController {

    @GetMapping(value = "hello")
    public String hello(){
        return "Hello, Spring Boot!";
    }

    @GetMapping(value = "account")
    public List<Account> accountDetails(){
        /*Account account = new Account();
        account.setId(1);
        account.setAccountNumber("1234567");
        account.setAccountType("Saving");
        account.setBalance(122222.0);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account);

        return accountList;*/

        return Arrays.asList(
                new Account(1, "123456789", "Savings", 1000.0),
                new Account(2, "987654321", "Checking", 2500.0)
        );
    }

}