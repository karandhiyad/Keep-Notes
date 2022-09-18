package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLIrEquipments")
public class TBLIrEquipments {
    @ColumnInfo(name = "area_object_id")
    private long area_object_id;

    @ColumnInfo(name = "ir_blaster_id")
    private long ir_blaster_id;

    @PrimaryKey
    @ColumnInfo(name = "equipment_id")
    private long equipment_id;

    @ColumnInfo(name = "equipment_type_name")
    private String  equipment_type_name;

    @ColumnInfo(name = "equipment_type_id")
    private long equipment_type_id;

    @ColumnInfo(name = "equipment_alias_name")
    private String equipment_alias_name;

    @ColumnInfo(name = "equipment_model_number")
    private String  equipment_model_number;

    @ColumnInfo(name = "equipment_model_reference_code")
    private String  equipment_model_reference_code;

    @ColumnInfo(name = "equipment_model_brand_name")
    private String  equipment_model_brand_name;

    @ColumnInfo(name = "mqtt_topic_name")
    private String  mqtt_topic_name;

    @ColumnInfo(name = "equipment_type_icon_url")
    private String  equipment_type_icon_url;

    @ColumnInfo(name = "status")
    private String  status;

    public TBLIrEquipments(long area_object_id, long ir_blaster_id, long equipment_id, String equipment_type_name, long equipment_type_id, String equipment_alias_name, String equipment_model_number, String equipment_model_reference_code, String equipment_model_brand_name, String mqtt_topic_name, String equipment_type_icon_url, String status) {
        this.area_object_id = area_object_id;
        this.ir_blaster_id = ir_blaster_id;
        this.equipment_id = equipment_id;
        this.equipment_type_name = equipment_type_name;
        this.equipment_type_id = equipment_type_id;
        this.equipment_alias_name = equipment_alias_name;
        this.equipment_model_number = equipment_model_number;
        this.equipment_model_reference_code = equipment_model_reference_code;
        this.equipment_model_brand_name = equipment_model_brand_name;
        this.mqtt_topic_name = mqtt_topic_name;
        this.equipment_type_icon_url = equipment_type_icon_url;
        this.status = status;
    }

    public long getArea_object_id() {
        return area_object_id;
    }

    public void setArea_object_id(long area_object_id) {
        this.area_object_id = area_object_id;
    }

    public long getIr_blaster_id() {
        return ir_blaster_id;
    }

    public void setIr_blaster_id(long ir_blaster_id) {
        this.ir_blaster_id = ir_blaster_id;
    }

    public long getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(long equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEquipment_type_name() {
        return equipment_type_name;
    }

    public void setEquipment_type_name(String equipment_type_name) {
        this.equipment_type_name = equipment_type_name;
    }

    public long getEquipment_type_id() {
        return equipment_type_id;
    }

    public void setEquipment_type_id(long equipment_type_id) {
        this.equipment_type_id = equipment_type_id;
    }

    public String getEquipment_alias_name() {
        return equipment_alias_name;
    }

    public void setEquipment_alias_name(String equipment_alias_name) {
        this.equipment_alias_name = equipment_alias_name;
    }

    public String getEquipment_model_number() {
        return equipment_model_number;
    }

    public void setEquipment_model_number(String equipment_model_number) {
        this.equipment_model_number = equipment_model_number;
    }

    public String getEquipment_model_reference_code() {
        return equipment_model_reference_code;
    }

    public void setEquipment_model_reference_code(String equipment_model_reference_code) {
        this.equipment_model_reference_code = equipment_model_reference_code;
    }

    public String getEquipment_model_brand_name() {
        return equipment_model_brand_name;
    }

    public void setEquipment_model_brand_name(String equipment_model_brand_name) {
        this.equipment_model_brand_name = equipment_model_brand_name;
    }

    public String getMqtt_topic_name() {
        return mqtt_topic_name;
    }

    public void setMqtt_topic_name(String mqtt_topic_name) {
        this.mqtt_topic_name = mqtt_topic_name;
    }

    public String getEquipment_type_icon_url() {
        return equipment_type_icon_url;
    }

    public void setEquipment_type_icon_url(String equipment_type_icon_url) {
        this.equipment_type_icon_url = equipment_type_icon_url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
