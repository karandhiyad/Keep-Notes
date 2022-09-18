package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLAreaObjects")
public class TBLAreaObjects {

    @PrimaryKey
    @ColumnInfo(name = "area_object_id")
    private long area_object_id;

    @ColumnInfo(name = "area_type_id")
    private int area_type_id;

    @ColumnInfo(name = "area_type_name")
    private String  area_type_name;

    @ColumnInfo(name = "area_alias_name")
    private String  area_alias_name;

    public TBLAreaObjects(long area_object_id, int area_type_id, String area_type_name, String area_alias_name) {
        this.area_object_id = area_object_id;
        this.area_type_id = area_type_id;
        this.area_type_name = area_type_name;
        this.area_alias_name = area_alias_name;
    }

    public long getArea_object_id() {
        return area_object_id;
    }

    public void setArea_object_id(long area_object_id) {
        this.area_object_id = area_object_id;
    }

    public int getArea_type_id() {
        return area_type_id;
    }

    public void setArea_type_id(int area_type_id) {
        this.area_type_id = area_type_id;
    }

    public String getArea_type_name() {
        return area_type_name;
    }

    public void setArea_type_name(String area_type_name) {
        this.area_type_name = area_type_name;
    }

    public String getArea_alias_name() {
        return area_alias_name;
    }

    public void setArea_alias_name(String area_alias_name) {
        this.area_alias_name = area_alias_name;
    }
}
