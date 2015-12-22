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
    public void shouldCalculateScoreWithSpareBonus() {
        Round round1 = new Round(1,9);
        Round round2 = new Round(4,6);
        round1.setNextRound(round2);
        assertEquals(14,round1.calculateTotalScore());
    }

    @Test
    public void shouldCalculateScoreWithStrikeBonus() {
        Round round1 = new Round(10,0);
        Round round2 = new Round(1,2);
        round1.setNextRound(round2);
        assertEquals(13,round1.calculateTotalScore());
    }

    @Test
    public void shouldCalculateScoreWithStrikeBonusAndNextRoundIsStrike() {
        Round round1 = new Round(10,0);
        Round round2 = new Round(10,0);
        Round round3 = new Round(3,4);
        round1.setNextRound(round2);
        round2.setNextRound(round3);
        assertEquals(23,round1.calculateTotalScore());
    }

    @Test
    public void shouldCalculateScoreWithStrikeBonusAndNextRoundIsStrikeTwo() {
        Round round1 = new Round(10,0);
        Round round2 = new Round(0,10);
        Round round3 = new Round(3,4);
        round1.setNextRound(round2);
        round2.setNextRound(round3);
        assertEquals(23,round1.calculateTotalScore());
    }
}
