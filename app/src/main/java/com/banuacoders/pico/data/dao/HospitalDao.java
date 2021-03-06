package com.banuacoders.pico.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.banuacoders.pico.data.model.Hospital;

import java.util.List;

@Dao
public interface HospitalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Hospital hospital);

    @Query("DELETE FROM Hospital")
    void deleteAllHospital();

    @Query("SELECT * FROM Hospital")
    LiveData<List<Hospital>> getAllHospital();
}
