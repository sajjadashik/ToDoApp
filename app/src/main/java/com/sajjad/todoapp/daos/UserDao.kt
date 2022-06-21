package com.sajjad.todoapp.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.sajjad.todoapp.entities.UserModel

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(userModel: UserModel)

    @Delete
    suspend fun deleteUser(userModel: UserModel)

    @Update
    suspend fun updateUser(userModel: UserModel)
}