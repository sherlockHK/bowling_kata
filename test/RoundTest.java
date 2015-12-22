import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RoundTest {
    @Test
    public void shouldCalculateTotalScore() {
        Round round = new Round(1,2);
        int totalScore = round.calculateTotalScore();
        assertThat(totalScore,is(3));
    }

    @Test
    public void shouldCalculateScoreWithBonus() {
        Round round1 = new Round(1,9);
        Round round2 = new Round(4,6);
        round1.setNextRound(round2);
        assertEquals(14,round1.calculateTotalScore());
    }
}
