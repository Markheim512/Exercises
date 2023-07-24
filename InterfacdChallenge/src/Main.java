public class Main {
    public static void main(String[] args) {
        Mappable townHall = new Building("Sydney TH gov", Mappable.PointMarker.DIAMOND, Mappable.Color.RED,
                "Sydney TH", Building.usageType.GOVERNMENT);
        Mappable.maplt(townHall);
    }
}
