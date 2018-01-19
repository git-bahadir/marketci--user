package com.example.user.marketci;

import android.graphics.Bitmap;
import android.location.Location;

import java.util.ArrayList;

/**
 * Created by Lenovo PC on 11/29/2017.
 */

public class Shop {
    private String shopName;
    private String shopDescription;
    private ArrayList<Item> items;
    // Kategoriler nası olacak
    private Location location;
    private float distributionDistance;
    private Bitmap shopPhoto;

    public Shop(Bitmap image) {
        shopPhoto = image;
    }
    public void setDistrubution(float distance) {
        distributionDistance = distance;
    }

    public void setShopName( String name) {
        shopName = name;
    }

    public void setShopDescription(String description) {
        shopDescription = description;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) { //dont think we need this for user side, added just in case
        items.remove(item);
    }

    public int itemCount() {
        return items.size();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setDistributionDistance(float distance) {
        distributionDistance = distance;
    }

    public Bitmap getshopPhoto() {
        return shopPhoto;
    }
}
