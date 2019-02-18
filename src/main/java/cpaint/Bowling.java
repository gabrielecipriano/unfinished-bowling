package cpaint;

import java.util.List;

public class Bowling {
    public static int score(List<Frame> game) {

        int score = 0;
        for (Frame frameScore : game) {
            score += Integer.valueOf(frameScore.firstThrow) +
                    Integer.valueOf(frameScore.secondThrow);
        }

        return score;
    }
}
