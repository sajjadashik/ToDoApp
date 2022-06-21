package com.sajjad.todoapp.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.sajjad.todoapp.entities.TodoModel

@Dao
interface TodoDao {
    @Insert
    suspend fun insertTodo(todoModel: TodoModel)

    @Update
    suspend fun updateTodo(todoModel: TodoModel)

    @Delete
    suspend fun deleteTodo(todoModel: TodoModel)

    @Query("select * from tbl_todo where user_id = :userId")
    fun getTodosByUserId(userId: Long) : LiveData<List<TodoModel>>
}