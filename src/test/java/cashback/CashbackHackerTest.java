package cashback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    @Test
    void shouldHackIfAmountIs900() {
         CashbackHacker cashback = new CashbackHacker();
         int actual = cashback.remain(900);
         int expected = 100;
         assertEquals(expected,actual);
    }
    @Test
    void shouldHackIfAmountIs1000(){
        CashbackHacker cashback = new CashbackHacker();
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void shouldHackIfAmountIs1200(){
        CashbackHacker cashback = new CashbackHacker();
        int actual = cashback.remain(1200);
        int expected = 800;
        assertEquals(expected,actual);
    }
}