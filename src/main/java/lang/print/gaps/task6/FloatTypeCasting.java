package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        System.out.println(numberToBeRounded < (int) numberToBeRounded + 0.5 ? (int) numberToBeRounded : (int) numberToBeRounded + 1);
    }
}
