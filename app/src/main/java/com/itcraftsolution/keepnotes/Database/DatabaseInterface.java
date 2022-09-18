package com.itcraftsolution.keepnotes.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public  interface DatabaseInterface {

    //TBLNotes
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addTBLNotes (TBLNotes tblNotes);

    @Query("select * from TBLNotes")
    LiveData<List<TBLNotes>> getAllLiveTBLNotes();

    @Query("select * from TBLNotes")
    List<TBLNotes> getAllTBLNotes();

    //TBLImages
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addTBLImages (TBLImages tblImages);

    @Query("select * from TBLImages")
    List<TBLImages> getTBLImages();
    


//    //TBLUserDetail
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLUserDetail (TBLUserDetail tblUserDetail);
//
//    @Query("select * from TBLUserDetail")
//    List<TBLUserDetail> getTBLUserDetail();
//
//
//    //TBLAreaObjects
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLAreaObjects (TBLAreaObjects tblAreaObjects);
//
//
//    //TBLBoards
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLBoards (TBLBoards tblBoards);
//
//    @Query("select * from TBLBoards")
//    List<TBLBoards> getTBLBoards();
//
//    @Query("select * from TBLBoards where board_id = :BoardId")
//    List<TBLBoards> getBoardDetail(String BoardId);
//
//    @Query("select * from TBLBoards where board_assign_id_hex = :BoardIdHex")
//    List<TBLBoards> getBoardDetailForStatus (String BoardIdHex);
//
//    @Query("update TBLBoards set status = :Status where board_assign_id_hex = :BoardId")
//    void addBoardStatus (String Status,String BoardId);
//
//
//    //TBLEquipments
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLEquipments (TBLEquipments tblEquipments);
//
//    @Query("select * from TBLEquipments Order by equipment_id")
//    List<TBLEquipments> getTBLEquipments();
//
//    @Query("select * from TBLEquipments Order by equipment_id")
//    LiveData<List<TBLEquipments>> getLiveTBLEquipments();
//
//    @Query("select * from TBLEquipments where equipment_id = :EquipmentId")
//    List<TBLEquipments> getEquipmentsDetail(String EquipmentId);
//
//    @Query("update TBLEquipments set status = :Status where equipment_id = :EquipmentId")
//    void addEquipmentStatus (String Status,String EquipmentId);
//
//    @Query("update TBLEquipments set status = :Status where equipment_switch_no = :SwitchNo AND board_assign_id_hex = :BoardHexId")
//    void addEquipmentStatusBySwitchAndBoardId(String Status, int SwitchNo , String BoardHexId);
//
//    @Query("update TBLEquipments set status = :Status,FanSpeed = :FanSpeed where equipment_switch_no = :Switch AND board_assign_id_hex = :BoardHexId")
//    void addEquipmentStatusBySwitchAndBoardIdForFan (String Status,String FanSpeed,int Switch,String BoardHexId);
//
//    @Query("select * from TBLEquipments where  board_assign_id_hex = :BoardHexId")
//    List<TBLEquipments> getEquipmentsDetailForStatus (String BoardHexId);
//
//
//    //TBLFoodOrderItem
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFoodOrderItem (TBLFoodOrderItem tblFoodOrderItem);
//
//    @Update
//    void updateTBLFoodOrderItem (TBLFoodOrderItem tblFoodOrderItem);
//
//    @Query("select * from TBLFoodOrderItem where Quantity >= 1")
//    List<TBLFoodOrderItem> getTBLFoodOrderItem();
//
//    @Query("select * from TBLFoodOrderItem where Quantity >= 1")
//    LiveData<List<TBLFoodOrderItem>> getLiveTBLFoodOrderItem();
//
//    @Query("DELETE FROM TBLFoodOrderItem")
//    void DeleteTBLFoodOrderItem();
//
//
//
//
//
//    //TBLIrBlasters
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBlIrBlasters (TBLIrBlasters tblIrBlasters);
//
//    @Query("select * from TBLIrBlasters")
//    List<TBLIrBlasters> getTBLIrBlasters();
//
//    @Query("select * from TBLIrBlasters where area_object_id = :AreaObjectId")
//    List<TBLIrBlasters> getBlasterOfArea(int AreaObjectId);
//
//
//    //TBLIrEquipments
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLIrEquipments (TBLIrEquipments tblIrEquipments);
//
//    @Query("select * from TBLIrEquipments")
//    List<TBLIrEquipments> getTBLIrEquipments();
//
//    @Query("select * from TBLIrEquipments")
//    LiveData<List<TBLIrEquipments>> getLiveIrEquipments();
//
//    @Query("select * from TBLIrEquipments")
//    List<TBLIrEquipments> getIrEquipments();
//
//    @Query("select * from TBLIrEquipments where equipment_id = :EquipmentId")
//    List<TBLIrEquipments> getIrEquipmentsForRemote(String  EquipmentId);
//
//    @Query("update TBLIrEquipments set status = :Status where equipment_id = :EquipmentId")
//    void updateIrEquipmentsStatus (String Status,String EquipmentId);
//
//    @Query("update TBLIrEquipments set equipment_alias_name = :NewName where equipment_id = :EquipmentId")
//    void updateIrEquipmentsName (String NewName,String EquipmentId);
//
//
//    //TBLIrAppliancesTypes
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLIrAppliancesTypes(TBLIrAppliancesTypes tblIrAppliancesTypes);
//
//    @Query("select * from TBLIrAppliancesTypes")
//    List<TBLIrAppliancesTypes> getTBLIrAppliancesTypes();
//
//    @Query("select * from TBLIrAppliancesTypes where type_full_name = :IrAppliancesTypeName")
//    List<TBLIrAppliancesTypes> getIrAppliancesTypeId(String IrAppliancesTypeName);
//
//
//    //TBLIrAppliancesBrands
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLIrAppliancesBrands(TBLIrAppliancesBrands tblIrAppliancesBrands);
//
//    @Query("select * from TBLIrAppliancesBrands")
//    List<TBLIrAppliancesBrands> getTBLIrAppliancesBrands();
//
//
//    //TBLIrAppliancesModels
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLIrAppliancesModels(TBLIrAppliancesModels tblIrAppliancesModels);
//
//    @Query("select * from TBLIrAppliancesModels")
//    List<TBLIrAppliancesModels> getTBLIrAppliancesModels();
//
//    @Query("select * from TBLIrAppliancesModels where type_id = :TypeId AND brand_id = :BrandId")
//    List<TBLIrAppliancesModels> getSelectedIrAppliances(int TypeId, int BrandId);
//
//
//    //TBLFBAcCommand
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBAcCommand (TBLFBAcCommand tblfbAcCommand);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void addTBLFBAcCommandLastCommand (TBLFBAcCommand tblfbAcCommand);
//
//    @Query("select * from TBLFBAcCommand")
//    List<TBLFBAcCommand> getTBLFBAcCommand();
//
//    @Query("select * from TBLFBAcCommand where mode = :AcMode AND onOff = :OnOff AND temperature = :Temperature AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getRemoteAcTBLFBACommand(String AcMode,String OnOff,int Temperature, String ReferenceCode);
//
//    @Query("select * from TBLFBAcCommand where  mode = :AcMode AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getRemoteModeTBLFBACommand(String AcMode,String ReferenceCode);
//
//    @Query("select * from TBLFBAcCommand where swing = :Swing AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getRemoteSwingTBLFBACommand(String Swing, String ReferenceCode);
//
//    @Query("select * from TBLFBAcCommand where fan = :FanSpeed AND mode = :AcMode AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getRemoteFanSpeedTBLFBACommand(String FanSpeed,String AcMode,String ReferenceCode);
//
//    @Query("select * from TBLFBAcCommand where  onOff = :OnOff AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getRemoteOffTBLFBACommand(String OnOff, String ReferenceCode);
//
//    @Query("select * from TBLFBAcCommand where  hexCode = :HexCode AND referenceCode = :ReferenceCode")
//    List<TBLFBAcCommand> getAcLastCommandTBLFBACommand(String HexCode, String ReferenceCode);
//
//
//    //TBLFBDvdCommand
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBDvdCommand (TBLFBDvdCommand tblfbDvdCommand);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void addTBLFBDvdLastCommand (TBLFBDvdCommand tblfbDvdCommand);
//
//    @Query("select * from TBLFBDvdCommand")
//    List<TBLFBDvdCommand> getTBLFBDvdCommand();
//
//    @Query("select * from TBLFBDvdCommand where operation = :Operation AND referenceCode = :ReferenceCode")
//    List<TBLFBDvdCommand> getSelectedTBLFBDvdCommand(String Operation,String ReferenceCode);
//
//    @Query("select * from TBLFBDvdCommand where hexCode = :HexCode AND referenceCode = :ReferenceCode")
//    List<TBLFBDvdCommand> getDvdLastCommandTBLFBDvdCommand(String HexCode,String ReferenceCode);
//
//
//    //TBLFBFanRemoteCommand
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBFanRemoteCommand (TBLFBFanRemoteCommand tblfbFanRemoteCommand);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void addTBLFBFanRemoteLastCommand (TBLFBFanRemoteCommand tblfbFanRemoteCommand);
//
//    @Query("select * from TBLFBFanRemoteCommand")
//    List<TBLFBFanRemoteCommand> getTBLFBFanRemoteCommand();
//
//    @Query("select * from TBLFBFanRemoteCommand where operation = :Operation AND referenceCode = :ReferenceCode")
//    List<TBLFBFanRemoteCommand> getSelectedTBLFBFanRemoteCommand(String Operation,String ReferenceCode);
//
//    @Query("select * from TBLFBFanRemoteCommand where hexCode = :HexCode AND referenceCode = :ReferenceCode")
//    List<TBLFBFanRemoteCommand> getRFanLastCommandTBLFBFanRemoteCommand(String HexCode,String ReferenceCode);
//
//    @Query("select * from TBLFBFanRemoteCommand where referenceCode = :ReferenceCode")
//    List<TBLFBFanRemoteCommand> getOptionalOperationTBLFBFanRemoteCommand(String ReferenceCode);
//
//
//    //TBLFBSetTopBoxCommand
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBSetTopBoxCommand (TBLFBSetTopBoxCommand tblfbSetTopBoxCommand);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void addTBLFBSetTopBoxLastCommand (TBLFBSetTopBoxCommand tblfbSetTopBoxCommand);
//
//    @Query("select * from TBLFBSetTopBoxCommand")
//    List<TBLFBSetTopBoxCommand> getTBLFBSetTopBoxCommand();
//
//    @Query("select * from TBLFBSetTopBoxCommand where operation = :Operation AND referenceCode = :ReferenceCode")
//    List<TBLFBSetTopBoxCommand> getSelectedTBLFBSetTopBoxCommand(String Operation,String ReferenceCode);
//
//    @Query("select * from TBLFBSetTopBoxCommand where hexCode = :HexCode AND referenceCode = :ReferenceCode")
//    List<TBLFBSetTopBoxCommand> getStbLastCommandTBLFBSetTopBoxCommand(String HexCode,String ReferenceCode);
//
//
//    //TBLFBTelevisionCommand
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBTelevisionCommand (TBLFBTelevisionCommand tblfbTelevisionCommand);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void addTBLFBTelevisionLastCommand (TBLFBTelevisionCommand tblfbTelevisionCommand);
//
//    @Query("select * from TBLFBTelevisionCommand")
//    List<TBLFBTelevisionCommand> getTBLFBTelevisionCommand();
//
//    @Query("select * from TBLFBTelevisionCommand where operation = :Operation AND referenceCode = :ReferenceCode")
//    List<TBLFBTelevisionCommand> getSelectedTBLFBTelevisionCommand(String Operation,String ReferenceCode);
//
//    @Query("select * from TBLFBTelevisionCommand where hexCode = :HexCode AND referenceCode = :ReferenceCode")
//    List<TBLFBTelevisionCommand> getTvLastCommandTBLFBTelevisionCommand(String HexCode,String ReferenceCode);
//
//    //TBLFBStbChannel
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    void addTBLFBStbChannel(TBLFBStbChannel tblfbStbChannel);
//
//    @Query("select * from TBLFBStbChannel")
//    LiveData<List<TBLFBStbChannel>> getLiveTBLFBStbChannel();
//
//    @Query("select * from TBLFBStbChannel")
//    List<TBLFBStbChannel> getTBLFBStbChannel();
//
//    @Query("select * from TBLFBStbChannel where status = :Status")
//    LiveData<List<TBLFBStbChannel>> getRecentLiveTBLFBStbChannel(int Status);
//
//    @Query("select * from TBLFBStbChannel  where status = :Status")
//    List<TBLFBStbChannel> getRecentTBLFBStbChannel(int Status);
//
//    @Query("update TBLFBStbChannel set status = :Status where channel_name = :ChannelName")
//    void updateTBLFBStbChannelStatus (int Status,String ChannelName);

}
