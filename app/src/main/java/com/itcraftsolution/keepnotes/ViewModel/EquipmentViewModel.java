package com.itcraftsolution.keepnotes.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.itcraftsolution.keepnotes.Database.DatabaseHelper;
import com.itcraftsolution.keepnotes.Database.TBLEquipments;
import com.itcraftsolution.keepnotes.Database.TBLFBStbChannel;
import com.itcraftsolution.keepnotes.Database.TBLFoodOrderItem;
import com.itcraftsolution.keepnotes.Database.TBLIrEquipments;

import java.util.List;

public class EquipmentViewModel extends AndroidViewModel {

    DatabaseHelper databaseHelper;

    public EquipmentViewModel(@NonNull Application application) {
        super(application);

        //Pass Context in DatabaseHelper
        databaseHelper = DatabaseHelper.databaseHelper(application.getApplicationContext());
    }

    public LiveData<List<TBLEquipments>> getEquipments(){
        return databaseHelper.databaseInterface().getLiveTBLEquipments();
    }

    public LiveData<List<TBLFoodOrderItem>> getFoodOrderItem(){
        return databaseHelper.databaseInterface().getLiveTBLFoodOrderItem();
    }

    public LiveData<List<TBLIrEquipments>> getIrEquipments(){
        return databaseHelper.databaseInterface().getLiveIrEquipments();
    }

    public LiveData<List<TBLFBStbChannel>> getTBLFBStbChannel(){
        return databaseHelper.databaseInterface().getLiveTBLFBStbChannel();
    }

    public LiveData<List<TBLFBStbChannel>> getRecentTBLFBStbChannel(int Status){
        return databaseHelper.databaseInterface().getRecentLiveTBLFBStbChannel(Status);
    }
}
