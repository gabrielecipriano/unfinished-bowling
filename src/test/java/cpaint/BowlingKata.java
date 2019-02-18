package cpaint;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BowlingKata {
    @Test
    void shouldCalculateScoreForAllZeros() {
        assertThat(scoreFor(asList(
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0")
        )), is(0));
    }

    @Test
    void shouldCalculateScoreForAllOnes() {
        assertThat(scoreFor(asList(
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0"),
                frame("1", "0")
        )), is(10));
    }

    @Test
    void shouldCalculateScoreOneSpare() {
        assertThat(scoreFor(asList(
                frame("1", "9"),
                frame("1", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0")
        )), is(12));

        assertThat(scoreFor(asList(
                frame("1", "9"),
                frame("2", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0")
        )), is(14));
    }

    @Test
    void shouldCalculateScoreOneStrike() {
        assertThat(scoreFor(asList(
                frame("X", "0"),
                frame("1", "1"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0")
        )), is(14));
    }

    @Test
    void shouldCalculateScoreASpareAfterAStrike() {
        assertThat(scoreFor(asList(
                frame("X", "0"),
                frame("1", "9"),
                frame("1", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0"),
                frame("0", "0")
        )), is(33));
    }

    private Frame frame(String firstThrow, String secondThrow) {
        return new Frame(firstThrow, secondThrow);
    }

    private int scoreFor(List<Frame> frames) {
        return Bowling.score(frames);
    }

}
