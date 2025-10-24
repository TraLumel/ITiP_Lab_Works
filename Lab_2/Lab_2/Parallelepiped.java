package Lab_2;
public class Parallelepiped extends Solid {
    private double length;
    private double width;
    private double height;
    public Parallelepiped() {
        this("Unknown", "Unknown", "Unknown", 0.0, "m", 0.0, 0.0, 0.0);
    }
    public Parallelepiped(String name, String color, String author, double density, String units,double length, double width, double height) {
        super (name, color, author, density, units);;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double volume() {
        // V = l * w * h
        return length * width * height;
    }
    public double spaceDiagonal() {
        return Math.sqrt(length*length + width*width + height*height);
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

}
