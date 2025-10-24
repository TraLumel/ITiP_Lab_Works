package Lab_2;
public abstract class Solid extends Geometricfigure {
    protected double density;
    protected String units;
    private static int solidCount = 0;
    public Solid() {this("Unknown", "Unknown", "Unknown", 0.0, "m");}
    public Solid(String name, String color, String author, double density, String units) {
        super(name, color, author);
        this.density = density;
        this.units = units;
        solidCount++; // увеличиваем при создании любого Solid
    }
    public static int getSolidCount() {
        return solidCount;
    }
    public double mass() {
        return density * volume();
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Density: " + density + " (units: " + units + ")");
        System.out.println("Volume: " + volume());
        System.out.println("Mass: " + mass());
    }
    public double getDensity() { return density; }
    public void setDensity(double density) { this.density = density; }

    public String getUnits() { return units; }
    public void setUnits(String units) { this.units = units; }
}
