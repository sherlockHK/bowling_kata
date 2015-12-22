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

    public int calculateTotalScore() {
        if (isSpareRound()){
            return baseScore + nextRound.firstBall;
        }
        if (isStrikeRound()){
            return baseScore +nextRound.firstBall+nextRound.secondBall;
        }
        return baseScore;
    }

    private boolean isStrikeRound() {
        return firstBall == 10 || secondBall == 10;
    }

    private boolean isSpareRound() {
        return firstBall != 10 && this.baseScore == 10;
    }

}
