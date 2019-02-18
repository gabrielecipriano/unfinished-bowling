package cpaint;

public class Bowling {
    public static int score(String[] game) {

        int score = 0;
        for (String frameScore : game) {
            score += Integer.valueOf(frameScore);
        }


        return score;
    }
}
