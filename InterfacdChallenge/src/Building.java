public class Building implements Mappable {
    private String label;
    private String iconType;
    private String name;
    private String usage;

    public enum usageType {
        BUSINESS, ENTERTAINMENT, GOVERNMENT;
    }

    public Building(String label, PointMarker iconType, Color iconColor, String name, usageType usage) {
        this.label = label;
        this.iconType = iconColor + " " + iconType;
        this.name = name;
        this.usage = String.valueOf(usage);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Geometry getGeometryType() {
        return Geometry.POINT;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    //    @Override
//    public void toJSON() {
//        System.out.println("""
//                "properties": {"type": \"""" + getGeometryType() +
//                "\", \"label\": \"" + label +
//                "\", \"marker\": \"" + iconType +
//                "\", \"name\": \"" + name +
//                "\", \"usage\": \"" + usage
//        );
//    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(getName(), getUsage());
    }
}
