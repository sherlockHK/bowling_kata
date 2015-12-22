public class Round {
    private int firstBall;
    private int secondBall;
    private Round nextRound;

    public Round(int firstBall, int secondBall) {
        this.firstBall = firstBall;
        this.secondBall = secondBall;
    }

    public void setNextRound(Round nextRound) {
        this.nextRound = nextRound;
    }

    public int calculateTotalScore() {
        if (firstBall != 10 && firstBall+secondBall == 10 && nextRound != null){
            return firstBall+secondBall+nextRound.firstBall;
        }
        if (firstBall == 10 || secondBall == 10 || firstBall+secondBall==10){
            return firstBall+secondBall+nextRound.firstBall+nextRound.secondBall;
        }
        return firstBall+secondBall;
    }

}
