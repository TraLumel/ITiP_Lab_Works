package Lab_2;
public class Sphere extends Solid {
    private double radius;
    private double centerX;
    private double centerY;
    public Sphere() {this("Unknown", "Unknown", "Unknown", 0.0, "m", 0.0, 0.0, 0.0);}
    public Sphere(String name, String color, String author, double density, String units, double radius, double centerX, double centerY) {
        super(name, color, author, density, units);
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    @Override
    public double volume() {
        // V = 4/3 * π * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public void scale(double factor) {
        if (factor <= 0) return;
        radius *= factor;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Radius: " + radius);
        System.out.println("CenterX: " + centerX);
        System.out.println("CenterY: " + centerY);
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getCenterX() { return centerX; }
    public void setCenterX(double centerX) { this.centerX = centerX; }

    public double getCenterY() { return centerY; }
    public void setCenterY(double centerY) { this.centerY = centerY; }

}
