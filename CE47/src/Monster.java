import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> saveData = new ArrayList<>();
        saveData.add(name);
        saveData.add(Integer.toString(hitPoints));
        saveData.add(Integer.toString(strength));
        return saveData;
    }

    @Override
    public void read(List<String> saveData) {
        if (saveData == null || saveData.size() == 0) return;
        name = (saveData.get(0));
        hitPoints = (Integer.parseInt(saveData.get(1)));
        strength = (Integer.parseInt(saveData.get(2)));
    }

    @Override
    public String toString() {
        return ("Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}");
    }
}
