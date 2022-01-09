package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int numbersTotal;
    private int numberToDraw;
    private Random random;

    public Lottery(int numbersTotal, int numberToDraw, Random random) {
        this.numbersTotal = numbersTotal;
        this.numberToDraw = numberToDraw;
        this.random = random;
    }

    public int getNumbersTotal() {
        return numbersTotal;
    }

    public int getNumberToDraw() {
        return numberToDraw;
    }

    public List<Integer> startLottery() {
        List<Integer> result = new ArrayList<>();
        while (result.size() < numberToDraw) {
            int draw = random.nextInt(1, numbersTotal + 1);
            if (!isDrawInList(result, draw)) {
                result.add(draw);
            }
        }
        return result;
    }

    private boolean isDrawInList(List<Integer> numbersInList, int number) {
        for (Integer i : numbersInList) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
