package Lab_2;
public class Cylinder extends Solid {
    private double radius;
    private double height;
    private String material;
    public Cylinder() {
        this("Unknown", "Unknown", "Unknown", 0.0, "m",0.0, 0.0, "Unknown");
    }
    public Cylinder(String name, String color, String author, double density, String units, double radius, double height, String material) {
        super(name, color, author, density, units);
        this.radius = radius;
        this.height = height;
        this.material = material;
    }
    @Override
    public double volume() {
        // V = π * r^2 * h
        return Math.PI * radius * radius * height;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String getMaterial() { return material;}
    public void setMaterial(String material) { this.material = material; }

}
