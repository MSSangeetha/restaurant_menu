package restaurant;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {

    //Declaring Variables
    private String nameOfItem;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    //Constructors
    public MenuItem (String nameOfItem,double price,String description,String category,boolean isNew){
        this.nameOfItem = nameOfItem;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem() {
        this.nameOfItem = nameOfItem;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    //Getters and Setters

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


//toString Method
    @Override
    public String toString() {
        return "MenuItem{" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    //Equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && isNew == menuItem.isNew && Objects.equals(nameOfItem, menuItem.nameOfItem) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfItem, price, description, category, isNew);
    }
}
