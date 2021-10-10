import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private int Strength;

    private int hitPoints;

    private String name;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        Strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.Strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            (this.Strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + Strength +
                '}';
    }

    private String getName() {
        return name;
    }

    private int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return Strength;
    }

}
