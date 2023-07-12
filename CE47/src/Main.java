public class Main {
    public static void main(String[] args) {
        Player me = new Player("Janusz", 100, 69);
        System.out.println(me.toString());

        Player.Head glowa = new Player.Head(2);
        Player.Head glowa2 = new Player.Head(3);
        System.out.println(glowa.getEyes());
        System.out.println(glowa2.getEyes());

    }
}