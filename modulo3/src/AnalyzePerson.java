public class AnalyzePerson {
    public void older(People p1, People p2){
        if (p1.getAge() > p2.getAge()){
            System.out.println(p1.getName());
        } else if (p1.getAge() == p2.getAge()){
            System.out.println("Mesma Idade");
        } else {
            System.out.println(p2.getName());
        }
    }
}
