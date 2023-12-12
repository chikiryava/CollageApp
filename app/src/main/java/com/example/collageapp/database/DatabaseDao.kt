package com.example.collageapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DatabaseDao {

    @Query("SELECT * FROM students")
    fun getAllStudents(): LiveData<List<Student>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    // Добавьте другие методы, например, для обновления и удаления студентов

    @Query("SELECT * FROM teachers")
    fun getAllTeachers(): LiveData<List<Teacher>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    // Добавьте другие методы, например, для обновления и удаления преподавателей


    @Query("SELECT * FROM groups")
    fun getAllGroups(): LiveData<List<Group>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGroup(group: Group)

    @Query("SELECT * FROM students INNER JOIN groups ON students.groupId = groups.groupId")
    fun getStudentsWithGroups(): LiveData<List<StudentWithGroup>>


    // Добавьте другие методы, например, для обновления и удаления групп
}
