public class LowerValue {
    public void calc(double value1, double value2, double value3) {
        double smaller = Math.min(value1, value2);
        System.out.println(Math.min(smaller, value3));
    }

    public static void main(String[] args) {
        LowerValue lowerValue = new LowerValue();
        lowerValue.calc(3,5,7);
    }
}
