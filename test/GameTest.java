import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void shouldCalculateNineRoundGameTotalScore() {
        Round round1 = new Round(1,2);
        Round round2 = new Round(3,4);
        Round round3 = new Round(5,5);
        Round round4 = new Round(10,0);
        Round round5 = new Round(1,0);
        Round round6 = new Round(10,0);
        Round round7 = new Round(0,10);
        Round round8 = new Round(5,2);
        Round round9 = new Round(6,2);

        round1.setNextRound(round2);
        round2.setNextRound(round3);
        round3.setNextRound(round4);
        round4.setNextRound(round5);
        round5.setNextRound(round6);
        round6.setNextRound(round7);
        round7.setNextRound(round8);
        round8.setNextRound(round9);

        Game game = new Game();
        game.play(round1);
        game.play(round2);
        game.play(round3);
        game.play(round4);
        game.play(round5);
        game.play(round6);
        game.play(round7);
        game.play(round8);
        game.play(round9);

        assertEquals(99,game.calculateTotalScore());
    }
}
