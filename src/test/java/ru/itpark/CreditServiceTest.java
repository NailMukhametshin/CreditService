package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @Test
    void calculateCredit() {
        {
            CreditService creditService = new CreditService();
            int result = creditService.calculateCredit(100_000, 12, 12);
            assertEquals(106619, result);
        }

        {
            CreditService creditService = new CreditService();
            int result = creditService.calculateCredit(100_000_000, 7.5, 12);
            assertEquals(104_108_900, result);
        }

    }
}