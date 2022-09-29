package ch.juventus.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    void init() {
        bank = new Bank(100);
    }

    @Test
    void testWithdraw() {
        // When
        bank.withdraw(20);
        // Then
        assertEquals(80, bank.retrieveBalance());
    }

    @Test
    void testDeposit() {
        // When
        bank.deposit(20);
        // Then
        assertEquals(120, bank.retrieveBalance());
    }

    @Test
    void testRetrieveBalance() {
        // Then
        assertEquals(100, bank.retrieveBalance());
    }

}