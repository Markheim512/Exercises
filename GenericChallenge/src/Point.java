public abstract class Point implements Mappable {
    String name;
    double latitude;
    double longitude;

    public Point(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "POINT";
    }

    @Override
    public String getCoordinates() {
        return "[%s, %s]".formatted(String.valueOf(latitude), String.valueOf(longitude));
    }

}
