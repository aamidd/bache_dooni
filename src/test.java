public class test {
    public static void main(String[] args) {
        Person gholam = new Person("sima", "gholam", "ghamari");
        Person mashReza = new Person("sima", "reza", "ghamari");
        Person sima = new Person("nosrat", "sima", "kababi");
        sima.addKid(mashReza);
        sima.addKid(gholam);
        Person nosrat = new Person("nosrat", "kababi");
        nosrat.addKid(sima);
        nosrat.print();
    }
}
