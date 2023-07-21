import java.util.Arrays;

public abstract class Line implements Mappable{
    String name;
    double[][] coordinates;

    public Line(String name, double[][] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "LINE";
    }

    @Override
    public String getCoordinates() {
        return Arrays.deepToString(coordinates);
    }
}
