package Lab_2;
public abstract  class Geometricfigure {
    private  String name;
    private String author;
    private String color;
    public Geometricfigure() {this("Unknown", "Unknown", "Unknown");}
    public Geometricfigure(String name, String color, String author) {
        this.name = name;
        this.author = author;
        this.color = color;
    }
    public abstract double volume();
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Color: " + color);
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}