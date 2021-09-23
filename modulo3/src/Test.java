public class Test {
    public static void main(String[] args) {
        People people1 = new People("Arthur", 6);
        People people2 = new People("Maria", 3);
        AnalyzePerson analyzePerson = new AnalyzePerson();

        analyzePerson.older(people1, people2);
    }
}
