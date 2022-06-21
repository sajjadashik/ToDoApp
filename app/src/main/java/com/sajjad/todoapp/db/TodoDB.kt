package com.sajjad.todoapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sajjad.todoapp.daos.TodoDao
import com.sajjad.todoapp.daos.UserDao
import com.sajjad.todoapp.entities.TodoModel
import com.sajjad.todoapp.entities.UserModel

@Database(entities = [TodoModel::class, UserModel::class], version = 1)
    abstract class TodoDB : RoomDatabase() {
        abstract fun todoDao() : TodoDao
        abstract fun userDao() : UserDao

        companion object {
            private var db: TodoDB? = null
            fun getDB(context: Context) : TodoDB {
                if (db == null) {
                    db = Room.databaseBuilder(
                        context,
                        TodoDB::class.java,
                        "todo_db"
                    ).build()
                    return db!!
                }
                return db!!
            }
        }
    }