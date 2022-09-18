package com.itcraftsolution.keepnotes.Database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLFBSetTopBoxCommand")
public class TBLFBSetTopBoxCommand {
//    @ColumnInfo(name = "no")
//    private long no;

    @ColumnInfo(name = "createdAt")
    private long createdAt;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "hexCode")
    private String  hexCode;

    @ColumnInfo(name = "operation")
    private String  operation;

    @ColumnInfo(name = "referenceCode")
    private String  referenceCode;

    public TBLFBSetTopBoxCommand(long createdAt, String hexCode, String operation, String referenceCode) {
        this.createdAt = createdAt;
        this.hexCode = hexCode;
        this.operation = operation;
        this.referenceCode = referenceCode;
    }

    @Ignore
    public TBLFBSetTopBoxCommand( String hexCode, String operation, String referenceCode) {
        this.hexCode = hexCode;
        this.operation = operation;
        this.referenceCode = referenceCode;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
}
