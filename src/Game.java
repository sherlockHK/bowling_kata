import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Round> rounds = new ArrayList<>();

    public void play(Round round) {
        rounds.add(round);
    }

    public int calculateTotalScore() {
        int total = 0;
        for (Round round : rounds) {
            total += round.calculateTotalScore();
        }
        return total;
    }
}
