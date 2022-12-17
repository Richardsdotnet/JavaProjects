package tdd;

public class RunWayLength {
    private double total;

    public void CalculateRunwayLength(int velocity, double acceleration) {
        double length = (velocity * velocity)/ (2 * acceleration);
        total = length;
    }

    public double getAnswer() {

        return total;
    }
}
