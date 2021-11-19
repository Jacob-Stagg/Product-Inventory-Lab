package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int qty;
    private float price;

    public Whiskey(int id, String name, String brand, int size, int qty, float price) {
        this.id = 6;
        this.name = "Stan Smith";
        this.brand = "Jack Daniel's";
        this.size = 9;
        this.qty = 10;
        this.price = 80.00f;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
