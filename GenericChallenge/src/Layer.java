import java.util.ArrayList;

public class Layer<T extends Mappable> {
    private ArrayList<T> elements;

    public Layer(ArrayList<T> elements) {
        this.elements = elements;
    }

    public Layer() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T t){
        elements.add(t);
    }

    public void renderLayer() {
        for (T t : elements){
            System.out.println(t.render());
        }
    }
}
