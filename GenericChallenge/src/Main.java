public class Main {
    public static void main(String[] args) {
        Point x0 = new Park("Lomza0", 50.15, 22.08);
        Point x1 = new Park("Lomza1", 51.15, 22.08);
        Point x2 = new Park("Lomza2", 52.15, 22.08);
        Point x3 = new Park("Lomza3", 53.15, 22.08);
        System.out.println(x0.render());
        double[][] narew_coord = {{53.12, 22.08}, {53.13, 22.07}, {53.14, 22.05}};
        Mappable y = new River("Narew", narew_coord);
        System.out.println(y.render());
        Layer<Point> layer1= new Layer<>();
        layer1.addElement(x0);
        layer1.addElement(x1);
        layer1.addElement(x2);
        layer1.addElement(x3);
        layer1.renderLayer();
    }
}
