package com.itcraftsolution.keepnotes.Database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLFBAcCommand")
public class TBLFBAcCommand {

//    @ColumnInfo(name = "no")
//    private long no;

    @ColumnInfo(name = "createdAt")
    private long createdAt;

    @ColumnInfo(name = "fan")
    private String  fan;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "hexCode")
    private String  hexCode;

    @ColumnInfo(name = "mode")
    private String  mode;

    @ColumnInfo(name = "onOff")
    private String  onOff;

    @ColumnInfo(name = "referenceCode")
    private String  referenceCode;

    @ColumnInfo(name = "swing")
    private String swing;

    @ColumnInfo(name = "temperature")
    private int temperature;

    @ColumnInfo(name = "type")
    private int type;

    public TBLFBAcCommand(long createdAt, String fan, String hexCode, String mode, String onOff, String referenceCode, String swing, int temperature, int type) {
        this.createdAt = createdAt;
        this.fan = fan;
        this.hexCode = hexCode;
        this.mode = mode;
        this.onOff = onOff;
        this.referenceCode = referenceCode;
        this.swing = swing;
        this.temperature = temperature;
        this.type = type;
    }

    @Ignore
    public TBLFBAcCommand( String fan, String hexCode, String mode, String onOff, String referenceCode, String swing, int temperature) {
        this.fan = fan;
        this.hexCode = hexCode;
        this.mode = mode;
        this.onOff = onOff;
        this.referenceCode = referenceCode;
        this.swing = swing;
        this.temperature = temperature;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getSwing() {
        return swing;
    }

    public void setSwing(String swing) {
        this.swing = swing;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
