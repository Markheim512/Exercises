import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> saveData = new ArrayList<>();
        saveData.add(name);
        saveData.add(Integer.toString(hitPoints));
        saveData.add(Integer.toString(strength));
        saveData.add(weapon);
        return saveData;
    }

    @Override
    public void read(List<String> saveData) {
        if (saveData == null || saveData.size() == 0) return;
        setName(saveData.get(0));
        setHitPoints(Integer.parseInt(saveData.get(1)));
        setStrength(Integer.parseInt(saveData.get(2)));
        setWeapon(saveData.get(3));
    }

    @Override
    public String toString() {
        return ("Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}");
    }

    static class Head {
        int eyes;

        public Head(int eyes) {
            this.eyes = eyes;
        }

        public int getEyes() {
            return eyes;
        }
    }
}
