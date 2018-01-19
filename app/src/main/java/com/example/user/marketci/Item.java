package com.example.user.marketci;

import android.graphics.Bitmap;

/**
 * Created by user on 27.11.2017.
 */

//we were gonna write the Item class together, but since
// I didn't hear from you I coded it in my way. Thus
// there could be some forgotten attributes
public class Item {
    private String barcode;
    private String itemDescription;
    private String title;
    // private CategoryType category;
    private int stock;
    private boolean available;
    private Bitmap itemPhoto;

    public Item(String barcode, String itemdesc, String title, int stock,boolean available, Bitmap photo) {
        this.barcode = barcode;
        itemDescription = itemdesc;
        this.title = title;
        this.stock = stock;
        this.available = available;
        itemPhoto = photo;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getTitle() {
        return title;
    }

    private int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return available;
    }

    public Bitmap getItemPhoto() {
        return itemPhoto;
    }

    private void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    private void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private void setAvailable(boolean available) {
        this.available = available;
    }

    private void setItemPhoto(Bitmap itemPhoto) {
        this.itemPhoto = itemPhoto;
    }
}