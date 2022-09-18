package com.itcraftsolution.keepnotes.Database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TBLFBStbChannel")
public class TBLFBStbChannel {
    @ColumnInfo(name = "channel_category")
    private String  channel_category;

    @ColumnInfo(name = "channel_image")
    private String channel_image;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "channel_name")
    private String channel_name;

    @ColumnInfo(name = "channel_number_by_provider")
    private String channel_number_by_provider;

    @ColumnInfo(name = "slug")
    private String slug;

    @ColumnInfo(name = "status")
    private int status;

    public TBLFBStbChannel(String channel_category, String channel_image, String channel_name, String channel_number_by_provider, String slug, int status) {
        this.channel_category = channel_category;
        this.channel_image = channel_image;
        this.channel_name = channel_name;
        this.channel_number_by_provider = channel_number_by_provider;
        this.slug = slug;
        this.status = status;
    }

    public String getChannel_category() {
        return channel_category;
    }

    public void setChannel_category(String channel_category) {
        this.channel_category = channel_category;
    }

    public String getChannel_image() {
        return channel_image;
    }

    public void setChannel_image(String channel_image) {
        this.channel_image = channel_image;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getChannel_number_by_provider() {
        return channel_number_by_provider;
    }

    public void setChannel_number_by_provider(String channel_number_by_provider) {
        this.channel_number_by_provider = channel_number_by_provider;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
