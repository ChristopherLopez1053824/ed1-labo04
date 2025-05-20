package ed.lab.ed1labo04.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity


public class ProductEntity {

    String name;
    Double price;
    int quantity;
    @Id
    @GeneratedValue
    Long id;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }


}
