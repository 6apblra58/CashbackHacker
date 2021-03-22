package cashback;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {

    @Test
    public void shouldHackIfAmountIs900() {
CashbackHacker cashback = new CashbackHacker();
int actual = cashback.remain(900);
int expected = 100;
assertEquals(actual,expected);


    }
    @Test
    public void shouldHackIfAmountIs1000(){
        CashbackHacker cashback = new CashbackHacker();
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldHackIfAmountIs1200(){
        CashbackHacker cashback = new CashbackHacker();
        int actual = cashback.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }
}