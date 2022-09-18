package com.itcraftsolution.keepnotes.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {TBLNotes.class,TBLImages.class},exportSchema = false,version = 1)
@TypeConverters({ImageToBitmap.class})
public abstract class DatabaseHelper extends RoomDatabase {
    private static final String DB_NAME ="NoteDatabase";
    private static   DatabaseHelper instance;
    public abstract DatabaseInterface databaseInterface();


    public static synchronized  DatabaseHelper databaseHelper(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),DatabaseHelper.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
