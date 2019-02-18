package cpaint;

import java.util.List;

public class Bowling {
    public static int score(List<Frame> game) {

        int score = 0;

        for (int i = 0; i < game.size(); i++) {
            Frame frame = game.get(i);
            int frameScore = Integer.valueOf(frame.firstThrow) +
                    Integer.valueOf(frame.secondThrow);

            if (frameScore == 10) {
                Frame nextFrame = game.get(i + 1);
                score += frameScore + Integer.valueOf(nextFrame.firstThrow);
            } else {
                score += frameScore;
            }
        }

        return score;
    }
}
