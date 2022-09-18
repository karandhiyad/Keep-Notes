package com.itcraftsolution.keepnotes.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLUserDetail")
public class TBLUserDetail {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "premise_type_id")
    private int premise_type_id;

    @ColumnInfo(name = "premise_type_name")
    private String  premise_type_name;

    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private int user_id;

    @ColumnInfo(name = "user_first_name")
    private String  user_first_name;

    @ColumnInfo(name = "user_middle_name")
    private String  user_middle_name;

    @ColumnInfo(name = "user_last_name")
    private String  user_last_name;

    @ColumnInfo(name = "user_email_id")
    private String  user_email_id;

    @ColumnInfo(name = "user_mobile_no")
    private String  user_mobile_no;

    @ColumnInfo(name = "user_backup_mobile_no")
    private String  user_backup_mobile_no;

    @ColumnInfo(name = "unit_alias_name")
    private String  unit_alias_name;

    @ColumnInfo(name = "unit_address1")
    private String  unit_address1;

    @ColumnInfo(name = "unit_address2")
    private String  unit_address2;

    @ColumnInfo(name = "unit_pincode")
    private String  unit_pincode;

    @ColumnInfo(name = "unit_city_name")
    private String  unit_city_name;

    @ColumnInfo(name = "unit_state_name")
    private String  unit_state_name;

    @ColumnInfo(name = "unit_country_name")
    private String  unit_country_name;


    public TBLUserDetail(int id, int premise_type_id, String premise_type_name, int user_id, String user_first_name, String user_middle_name, String user_last_name, String user_email_id, String user_mobile_no, String user_backup_mobile_no, String unit_alias_name, String unit_address1, String unit_address2, String unit_pincode, String unit_city_name, String unit_state_name, String unit_country_name) {
        this.id = id;
        this.premise_type_id = premise_type_id;
        this.premise_type_name = premise_type_name;
        this.user_id = user_id;
        this.user_first_name = user_first_name;
        this.user_middle_name = user_middle_name;
        this.user_last_name = user_last_name;
        this.user_email_id = user_email_id;
        this.user_mobile_no = user_mobile_no;
        this.user_backup_mobile_no = user_backup_mobile_no;
        this.unit_alias_name = unit_alias_name;
        this.unit_address1 = unit_address1;
        this.unit_address2 = unit_address2;
        this.unit_pincode = unit_pincode;
        this.unit_city_name = unit_city_name;
        this.unit_state_name = unit_state_name;
        this.unit_country_name = unit_country_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPremise_type_id() {
        return premise_type_id;
    }

    public void setPremise_type_id(int premise_type_id) {
        this.premise_type_id = premise_type_id;
    }

    public String getPremise_type_name() {
        return premise_type_name;
    }

    public void setPremise_type_name(String premise_type_name) {
        this.premise_type_name = premise_type_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public String getUser_middle_name() {
        return user_middle_name;
    }

    public void setUser_middle_name(String user_middle_name) {
        this.user_middle_name = user_middle_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }

    public String getUser_email_id() {
        return user_email_id;
    }

    public void setUser_email_id(String user_email_id) {
        this.user_email_id = user_email_id;
    }

    public String getUser_mobile_no() {
        return user_mobile_no;
    }

    public void setUser_mobile_no(String user_mobile_no) {
        this.user_mobile_no = user_mobile_no;
    }

    public String getUser_backup_mobile_no() {
        return user_backup_mobile_no;
    }

    public void setUser_backup_mobile_no(String user_backup_mobile_no) {
        this.user_backup_mobile_no = user_backup_mobile_no;
    }

    public String getUnit_alias_name() {
        return unit_alias_name;
    }

    public void setUnit_alias_name(String unit_alias_name) {
        this.unit_alias_name = unit_alias_name;
    }

    public String getUnit_address1() {
        return unit_address1;
    }

    public void setUnit_address1(String unit_address1) {
        this.unit_address1 = unit_address1;
    }

    public String getUnit_address2() {
        return unit_address2;
    }

    public void setUnit_address2(String unit_address2) {
        this.unit_address2 = unit_address2;
    }

    public String getUnit_pincode() {
        return unit_pincode;
    }

    public void setUnit_pincode(String unit_pincode) {
        this.unit_pincode = unit_pincode;
    }

    public String getUnit_city_name() {
        return unit_city_name;
    }

    public void setUnit_city_name(String unit_city_name) {
        this.unit_city_name = unit_city_name;
    }

    public String getUnit_state_name() {
        return unit_state_name;
    }

    public void setUnit_state_name(String unit_state_name) {
        this.unit_state_name = unit_state_name;
    }

    public String getUnit_country_name() {
        return unit_country_name;
    }

    public void setUnit_country_name(String unit_country_name) {
        this.unit_country_name = unit_country_name;
    }
}
