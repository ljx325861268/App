package li.emily.fastfoodapp.model;

public class Item {

    private int id; // unique identifier of the item
    private int imageID; // unique identifier of the image associated with the item
    private String name;
    private double price;
    private String description;
    private int quantity;

    public Item(int id, int imageID, String name, double price, String description) {
        this.id = id;
        this.imageID = imageID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
