/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Christian
 */
public class Beam {
 private String material;
 private int lenght, height, width; 
 private double Mprice;

    public Beam(String material, int lenght, int height, int width, double Mprice) {
        this.material = material;
        this.lenght = lenght;
        this.height = height;
        this.width = width;
        this.Mprice = Mprice;
    }

    public String getMaterial() {
        return material;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getMprice() {
        return Mprice;
    }
 
   
}
