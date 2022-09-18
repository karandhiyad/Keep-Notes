package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLEquipments")
public class TBLEquipments {

    @ColumnInfo(name = "area_object_id")
    private long area_object_id;

    @ColumnInfo(name = "board_id")
    private long board_id;

    @PrimaryKey
    @ColumnInfo(name = "equipment_id")
    private long equipment_id;

    @ColumnInfo(name = "equipment_type_name")
    private String  equipment_type_name;

    @ColumnInfo(name = "equipment_type_id")
    private int equipment_type_id;

    @ColumnInfo(name = "equipment_alias_name")
    private String equipment_alias_name;

    @ColumnInfo(name = "equipment_switch_no")
    private int equipment_switch_no;

    @ColumnInfo(name = "equipment_time")
    private long equipment_time;

    @ColumnInfo(name = "board_assign_id_hex")
    private String board_assign_id_hex;

    @ColumnInfo(name = "channel_capacity")
    private int channel_capacity;

    @ColumnInfo(name = "status")
    private String status;

    @ColumnInfo(name = "FanSpeed")
    private String fanSpeed;


    public TBLEquipments(long area_object_id, long board_id, long equipment_id, String equipment_type_name, int equipment_type_id, String equipment_alias_name, int equipment_switch_no, long equipment_time, String board_assign_id_hex, int channel_capacity, String status, String fanSpeed) {
        this.area_object_id = area_object_id;
        this.board_id = board_id;
        this.equipment_id = equipment_id;
        this.equipment_type_name = equipment_type_name;
        this.equipment_type_id = equipment_type_id;
        this.equipment_alias_name = equipment_alias_name;
        this.equipment_switch_no = equipment_switch_no;
        this.equipment_time = equipment_time;
        this.board_assign_id_hex = board_assign_id_hex;
        this.channel_capacity = channel_capacity;
        this.status = status;
        this.fanSpeed = fanSpeed;
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

    public int getEquipment_type_id() {
        return equipment_type_id;
    }

    public void setEquipment_type_id(int equipment_type_id) {
        this.equipment_type_id = equipment_type_id;
    }

    public String getEquipment_alias_name() {
        return equipment_alias_name;
    }

    public void setEquipment_alias_name(String equipment_alias_name) {
        this.equipment_alias_name = equipment_alias_name;
    }

    public int getEquipment_switch_no() {
        return equipment_switch_no;
    }

    public void setEquipment_switch_no(int equipment_switch_no) {
        this.equipment_switch_no = equipment_switch_no;
    }

    public long getEquipment_time() {
        return equipment_time;
    }

    public void setEquipment_time(long equipment_time) {
        this.equipment_time = equipment_time;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(String fanSpeed) {
        this.fanSpeed = fanSpeed;
    }
}
