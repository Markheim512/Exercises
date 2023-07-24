public interface Mappable {
    String getLabel();
    Geometry getGeometryType();
    String getIconType();

    public enum Geometry {
        LINE, POINT, POLYGON;
    }

    public enum Color {
        BLACK, BLUE, GREEN, RED;
    }

    public enum PointMarker {
        CIRCLE, DIAMOND;
    }

    public enum LineMarker {
        DASHED, DOTTED, SOLID;
    }

    static final String JSON_PROPERTY = """
    "properties": {%s}""";

//    default void toJSON(){
//        System.out.println("""
//                "properties": {"type":\"""" + getGeometryType() +
//                "\", \"label\": \"" + getLabel() +
//                "\", \"marker\": \"" + getIconType());
//    }
//
//    static void maplt(Mappable mappable){
//        System.out.println("""
//                "properties": {"type": \"""" + mappable.getGeometryType() +
//                "\", \"label\": \"" + mappable.getLabel() +
//                "\", \"marker\": \"" + mappable.getIconType());
//    }

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(String.valueOf(getGeometryType()), getLabel(), getIconType());
    }

    static void maplt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }

}
