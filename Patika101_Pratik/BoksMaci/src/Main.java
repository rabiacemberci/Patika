public class Main {

    public static void main(String[] args) {
        Fighter fighter = new Fighter("A", 10,120,100,30,80);
        Fighter fighter1 = new Fighter("B",20,85,85,40,70);

        Match match = new Match(fighter,fighter1,85,95);
        match.run();

    }
}
