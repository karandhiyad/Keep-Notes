package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLIrAppliancesTypes")
public class TBLIrAppliancesTypes {

    @ColumnInfo(name = "id")
    private int id;

    @PrimaryKey
    @ColumnInfo(name = "type_id")
    private int type_id;

    @ColumnInfo(name = "type_full_name")
    private String  type_full_name;

    @ColumnInfo(name = "actions")
    private String  actions;

    @ColumnInfo(name = "description")
    private String  description;

    @ColumnInfo(name = "equipment_type_icon_url")
    private String  equipment_type_icon_url;

    @ColumnInfo(name = "additional_appliance_details")
    private String additional_appliance_details;

    @ColumnInfo(name = "created_at")
    private long created_at;

    public TBLIrAppliancesTypes(int id, int type_id, String type_full_name, String actions, String description, String equipment_type_icon_url, String additional_appliance_details, long created_at) {
        this.id = id;
        this.type_id = type_id;
        this.type_full_name = type_full_name;
        this.actions = actions;
        this.description = description;
        this.equipment_type_icon_url = equipment_type_icon_url;
        this.additional_appliance_details = additional_appliance_details;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_full_name() {
        return type_full_name;
    }

    public void setType_full_name(String type_full_name) {
        this.type_full_name = type_full_name;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEquipment_type_icon_url() {
        return equipment_type_icon_url;
    }

    public void setEquipment_type_icon_url(String equipment_type_icon_url) {
        this.equipment_type_icon_url = equipment_type_icon_url;
    }

    public String getAdditional_appliance_details() {
        return additional_appliance_details;
    }

    public void setAdditional_appliance_details(String additional_appliance_details) {
        this.additional_appliance_details = additional_appliance_details;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }
}
