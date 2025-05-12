import java.util.ArrayList;
import java.util.List;

public abstract class CompositeUnit implements Unit {
    protected String name;
    protected List<Unit> units = new ArrayList<>();

    public CompositeUnit(String name) {
        this.name = name;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getDetails(String prefix) {
        System.out.println(prefix + getName());
        for (Unit unit : units) {
            unit.getDetails(prefix + "  ");
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (Unit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (Unit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}
