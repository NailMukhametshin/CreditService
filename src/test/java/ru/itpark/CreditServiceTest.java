package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {

    @org.junit.jupiter.api.Test
    void calculateCredit() {
        {
            CreditService creditService = new CreditService();
            double v = creditService.calculateCredit(100_000, 12, 12);
            assertEquals(106619, v);
        }

        {
            CreditService creditService = new CreditService();
            double v = creditService.calculateCredit(100_000_000, 7.5, 12);
            assertEquals(104_108_900, v);
        }

    }
}