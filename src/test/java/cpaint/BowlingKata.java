package cpaint;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BowlingKata {
    @Test
    void shouldCalculateScoreForAllZeros() {
        int score = Bowling.score(Arrays.asList(
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0"),
                new Frame("0", "0")
        ));

        assertThat(score, is(0));
    }

    @Test
    void shouldCalculateScoreForAllOnes() {
        int score = Bowling.score(Arrays.asList(
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0"),
                new Frame("1", "0")
        ));

        assertThat(score, is(10));
    }
}
