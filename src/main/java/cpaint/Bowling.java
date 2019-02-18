package cpaint;

import java.util.List;

public class Bowling {
    public static int score(List<Frame> game) {

        int score = 0;

        for (int i = 0; i < game.size(); i++) {
            Frame frame = game.get(i);

            if (!isAStrike(frame)) {
                int pinDown = pinDownForCurrent(frame);
                if (isASpare(pinDown)) {
                    Frame nextFrame = game.get(i + 1);

                    score += pinDown + toInt(nextFrame.firstThrow);

                } else {
                    score += pinDown;
                }
            } else {
                score += 10 + pinDownForCurrent(game.get(i + 1));
            }
        }

        return score;
    }

    private static boolean isAStrike(Frame frame) {
        return frame.firstThrow.equals("X") || frame.secondThrow.equals("X");
    }

    private static Integer toInt(String firstThrow) {
        return Integer.valueOf(firstThrow);
    }

    private static int pinDownForCurrent(Frame frame) {
        return toInt(frame.firstThrow) +
                toInt(frame.secondThrow);
    }

    private static boolean isASpare(int frameScore) {
        return frameScore == 10;
    }
}
