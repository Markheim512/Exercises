public interface Mappable {
    String getName();
    String getType();
    String getCoordinates();

    static final String RENDER = "Render %s as %s (%s)";

    default String render() {
        return RENDER.formatted(getName(), getType(), getCoordinates());
    }

}
