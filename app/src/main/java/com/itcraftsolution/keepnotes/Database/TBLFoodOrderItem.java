package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLFoodOrderItem")
public class TBLFoodOrderItem {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;

    @ColumnInfo(name = "FoodName")
    private String foodname;

    @ColumnInfo(name = "Description")
    private String description;

    @ColumnInfo(name = "Price")
    private long price;

    @ColumnInfo(name = "TaxRate")
    private long taxRate;

    @ColumnInfo(name = "TaxRatePrice")
    private long taxRatePrice;

    @ColumnInfo(name = "Quantity")
    private int quantity;

    public TBLFoodOrderItem(int id, String foodname, String description, long price, long taxRate, long taxRatePrice, int quantity) {
        this.id = id;
        this.foodname = foodname;
        this.description = description;
        this.price = price;
        this.taxRate = taxRate;
        this.taxRatePrice = taxRatePrice;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(long taxRate) {
        this.taxRate = taxRate;
    }

    public long getTaxRatePrice() {
        return taxRatePrice;
    }

    public void setTaxRatePrice(long taxRatePrice) {
        this.taxRatePrice = taxRatePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
