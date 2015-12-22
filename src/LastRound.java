public class LastRound extends Round {
    private int thirdBall;

    public LastRound(int firstBall, int secondBall,int thirdBall) {
        super(firstBall, secondBall);
        this.thirdBall = thirdBall;
    }

    @Override
    public int calculateTotalScore() {
        return getFirstBall()+getSecondBall()+thirdBall;
    }
}
