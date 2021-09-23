public class CheckAthlete {
    public void categorizes(int age, double weight) {
        if (age <= 14) {
            System.out.println("Infantil");
        } else if (age <= 17 && weight <= 50) {
            System.out.println("Juvenil Leve");
        } else if (age <= 17 && weight > 50) {
            System.out.println("Juvenil Pesado");
        } else if (age <= 25 && weight <= 60) {
            System.out.println("Senior Leve");
        } else if (age <= 25 && weight > 60) {
            System.out.println("Senior Pesado");
        } else {

            System.out.println("Veterano");
        }
    }

    public static void main(String[] args) {
        CheckAthlete checkAthlete = new CheckAthlete();
        checkAthlete.categorizes(25,65);
    }
}
