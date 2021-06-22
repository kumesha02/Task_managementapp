package com.example.todo

import androidx.room.*

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: Entity)

    @Update
    suspend fun updateTask(entity: Entity)

    @Delete
    suspend fun deleteTask(entity: Entity)

    @Query("Delete from Wish_list")
    suspend fun deleteAll()

    @Query("Select * from Wish_list")
    suspend fun getTasks():List<CardInfo>

}