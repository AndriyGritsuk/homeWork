public class Bicycle {

    private String model;
    private String size;
    private String link;
    private float price;
    private String type;

    public Bicycle() {}

    public Bicycle(String model, String size, String link, float price, String type) {
        this.model = model;
        this.size = size;
        this.link = link;
        this.price = price;
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getLink() {
        return link;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }


}
