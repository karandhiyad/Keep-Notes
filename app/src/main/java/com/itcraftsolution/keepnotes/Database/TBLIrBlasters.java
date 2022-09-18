package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLIrBlasters")
public class  TBLIrBlasters{

    @ColumnInfo(name = "area_object_id")
    private long area_object_id;

    @PrimaryKey
    @ColumnInfo(name = "ir_blaster_id")
    private long ir_blaster_id;

    @ColumnInfo(name = "mac_address")
    private String   mac_address;

    @ColumnInfo(name = "mqtt_topic_name")
    private String  mqtt_topic_name;

    @ColumnInfo(name = "status")
    private String  status;

    public TBLIrBlasters(long area_object_id, long ir_blaster_id, String mac_address, String mqtt_topic_name, String status) {
        this.area_object_id = area_object_id;
        this.ir_blaster_id = ir_blaster_id;
        this.mac_address = mac_address;
        this.mqtt_topic_name = mqtt_topic_name;
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

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public String getMqtt_topic_name() {
        return mqtt_topic_name;
    }

    public void setMqtt_topic_name(String mqtt_topic_name) {
        this.mqtt_topic_name = mqtt_topic_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
