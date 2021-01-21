package restuarant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    public MenuItem (String name,String description,Double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName(){ return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category; }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

}
