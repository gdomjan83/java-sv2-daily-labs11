package day05;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(90, 5, new Random(666));

    @Test
    void testStartLottery() {
        assertEquals(5, lottery.startLottery().size());
    }

}