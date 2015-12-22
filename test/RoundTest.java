import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoundTest {
    @Test
    public void shouldCalculateTotalScore() {
        Round round = new Round(1,2);
        int totalScore = round.calculateTotalScore();
        assertThat(totalScore,is(3));
    }


}
