/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Christian Ambjørn Kehr
 */
public class WoodPost {

    private String material;
    private int length, width, id, amount;
    private double price, totalPrice;

    public WoodPost(String material, int length, int width, int id, int amount, double price, double totalPrice) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public WoodPost(String material, int length, int id) {
        this.material = material;
        this.length = length;
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getprice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "WoodPost{" + "material=" + material + ", length=" + length + ", width=" + width + ", id=" + id + ", amount=" + amount + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }
    
}
