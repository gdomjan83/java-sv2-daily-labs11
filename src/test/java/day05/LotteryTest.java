package day05;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testStartLottery() {
        Lottery lottery = new Lottery(90, 5, new Random(666));
        assertEquals(5, lottery.startLottery().size());
    }

    @Test
    void testStartLottery2() {
        Lottery lottery = new Lottery(5, 5, new Random(666));
        assertEquals(5, lottery.startLottery().size());
    }
}