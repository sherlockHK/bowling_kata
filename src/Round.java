public class Round {
    private int firstBall;
    private int secondBall;
    private Round nextRound;
    private int baseScore;

    public Round(int firstBall, int secondBall) {
        this.firstBall = firstBall;
        this.secondBall = secondBall;
        baseScore = firstBall + secondBall;
    }

    public void setNextRound(Round nextRound) {
        this.nextRound = nextRound;
    }

    public int getFirstBall() {
        return firstBall;
    }

    public int getSecondBall() {
        return secondBall;
    }

    public int calculateTotalScore() {
        return baseScore + getBonus();
    }

    private int getBonus() {
        int bonus = 0;
        if (isSpareRound()) {
            bonus = nextRound.firstBall;
        }

        if (isStrikeRound()) {
            if (nextRound.isStrikeRound() && nextRound.nextRound != null) {
                bonus = nextRound.baseScore + nextRound.nextRound.firstBall;
            } else {
                bonus = nextRound.baseScore;
            }
        }
        return bonus;
    }

    public boolean isStrikeRound() {
        return firstBall == 10 || secondBall == 10;
    }

    private boolean isSpareRound() {
        return firstBall != 10 && this.baseScore == 10;
    }

}
