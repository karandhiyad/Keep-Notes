package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLIrAppliancesModels")
public class TBLIrAppliancesModels {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "model_number")
    private String  model_number;

    @ColumnInfo(name = "reference_code")
    private String reference_code;

    @ColumnInfo(name = "type_id")
    private int type_id;

    @ColumnInfo(name = "brand_id")
    private int brand_id;

    @ColumnInfo(name = "brand_hex_code")
    private String  brand_hex_code;

    @ColumnInfo(name = "created_at")
    private long created_at;

    public TBLIrAppliancesModels(long id, String model_number, String reference_code, int type_id, int brand_id, String brand_hex_code, long created_at) {
        this.id = id;
        this.model_number = model_number;
        this.reference_code = reference_code;
        this.type_id = type_id;
        this.brand_id = brand_id;
        this.brand_hex_code = brand_hex_code;
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public String getReference_code() {
        return reference_code;
    }

    public void setReference_code(String reference_code) {
        this.reference_code = reference_code;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
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

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }
}
