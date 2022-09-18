package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLIrAppliancesBrands")
public class TBLIrAppliancesBrands {
    @ColumnInfo(name = "id")
    private int id;

    @PrimaryKey
    @ColumnInfo(name = "brand_id")
    private int brand_id;

    @ColumnInfo(name = "brand_hex_code")
    private String  brand_hex_code;

    @ColumnInfo(name = "brand_name")
    private String  brand_name;

    @ColumnInfo(name = "created_at")
    private long created_at;

    public TBLIrAppliancesBrands(int id, int brand_id, String brand_hex_code, String brand_name, long created_at) {
        this.id = id;
        this.brand_id = brand_id;
        this.brand_hex_code = brand_hex_code;
        this.brand_name = brand_name;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_hex_code() {
        return brand_hex_code;
    }

    public void setBrand_hex_code(String brand_hex_code) {
        this.brand_hex_code = brand_hex_code;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }
}
