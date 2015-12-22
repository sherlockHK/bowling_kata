public class Round {
    private int firstBall;
    private int secondBall;

    public Round(int firstBall, int secondBall) {
        this.firstBall = firstBall;
        this.secondBall = secondBall;
    }

    public int calculateTotalScore() {
        return firstBall+secondBall;
    }

}
