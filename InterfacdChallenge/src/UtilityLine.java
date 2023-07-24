public class UtilityLine implements Mappable {
    private String label;
    private String iconType;
    private String name;
    private String utility;

    public enum utilityType {
        ELECTRICAL, FIBER_OPTIC;
    }

    public UtilityLine(String label, LineMarker iconType, Color iconColor, String name, utilityType utility) {
        this.label = label;
        this.iconType = iconType + " " + iconColor;
        this.name = name;
        this.utility = String.valueOf(utility);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Geometry getGeometryType() {
        return Geometry.LINE;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    public String getName() {
        return name;
    }

    public String getUtility() {
        return utility;
    }

    //    @Override
//    public void toJSON() {
//        System.out.println("""
//                "properties": {"type": \"""" + getGeometryType() +
//                "\", \"label\": \"" + label +
//                "\", \"marker\": \"" + iconType +
//                "\", \"name\": \"" + name +
//                "\", \"utility\": \"" + utility);
//    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "utility": "%s" """.formatted(getName(), getUtility());
    }
}
