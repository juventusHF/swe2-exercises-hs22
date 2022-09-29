package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    final Logger logger = LoggerFactory.getLogger(Bank.class);
    private double balance;

    public Bank(double initialBalance) {
        logger.info("New Bank instance created with initial balance of {}", initialBalance);
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        logger.info("Withdraw {}", amount);
        balance -= amount;
        logger.info("New balance is {}", balance);
    }

    public void deposit(double amount) {
        logger.info("Deposit {}", amount);
        balance += amount;
        logger.info("New balance is {}", balance);
    }

    public double retrieveBalance() {
        logger.info("Retrieve current balance = {}", balance);
        return balance;
    }
}
