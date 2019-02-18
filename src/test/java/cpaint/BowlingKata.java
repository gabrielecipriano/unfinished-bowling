package cpaint;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BowlingKata {
    @Test
    void shouldCalculateScoreForAllZeros() {
        assertThat(Bowling.score(new String[]{"0","0","0","0","0","0","0","0","0","0"}), is(0));
    }

    @Test
    void shouldCalculateScoreForAllOnes() {
        assertThat(Bowling.score(new String[]{"1","1","1","1","1","1","1","1","1","1"}), is(10));
    }
}
