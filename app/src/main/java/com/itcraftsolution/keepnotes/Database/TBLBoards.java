package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLBoards")
public class TBLBoards {

    @ColumnInfo(name = "area_object_id")
    private long area_object_id;

    @PrimaryKey
    @ColumnInfo(name = "board_id")
    private long board_id;

    @ColumnInfo(name = "board_assign_id")
    private String   board_assign_id;

    @ColumnInfo(name = "board_assign_id_hex")
    private String  board_assign_id_hex;

    @ColumnInfo(name = "channel_capacity")
    private int channel_capacity;

    @ColumnInfo(name = "mqtt_topic_name")
    private String  mqtt_topic_name;

    @ColumnInfo(name = "mac_address")
    private String  mac_address;

    @ColumnInfo(name = "status")
    private String  status;


    public TBLBoards(long area_object_id, long board_id, String board_assign_id, String board_assign_id_hex, int channel_capacity, String mqtt_topic_name, String mac_address, String status) {
        this.area_object_id = area_object_id;
        this.board_id = board_id;
        this.board_assign_id = board_assign_id;
        this.board_assign_id_hex = board_assign_id_hex;
        this.channel_capacity = channel_capacity;
        this.mqtt_topic_name = mqtt_topic_name;
        this.mac_address = mac_address;
        this.status = status;
    }

    public long getArea_object_id() {
        return area_object_id;
    }

    public void setArea_object_id(long area_object_id) {
        this.area_object_id = area_object_id;
    }

    public long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }

    public String getBoard_assign_id() {
        return board_assign_id;
    }

    public void setBoard_assign_id(String board_assign_id) {
        this.board_assign_id = board_assign_id;
    }

    public String getBoard_assign_id_hex() {
        return board_assign_id_hex;
    }

    public void setBoard_assign_id_hex(String board_assign_id_hex) {
        this.board_assign_id_hex = board_assign_id_hex;
    }

    public int getChannel_capacity() {
        return channel_capacity;
    }

    public void setChannel_capacity(int channel_capacity) {
        this.channel_capacity = channel_capacity;
    }

    public String getMqtt_topic_name() {
        return mqtt_topic_name;
    }

    public void setMqtt_topic_name(String mqtt_topic_name) {
        this.mqtt_topic_name = mqtt_topic_name;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
