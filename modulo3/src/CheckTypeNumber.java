public class CheckTypeNumber {

    public void checkNumber(int number){
        if (number == 0){
            System.out.println(number + " = ZERO");
        } else if (number > 0) {
            System.out.println(number + " = POSITIVO");
        } else
        System.out.println(number + " = NEGATIVO");

    }

    public static void main(String[] args) {
        int n = 0;
        CheckTypeNumber checkTypeNumber = new CheckTypeNumber();
        checkTypeNumber.checkNumber(n);

    }
}
