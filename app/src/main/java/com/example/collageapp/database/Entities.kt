package com.example.collageapp.database

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(
    tableName = "students",
    foreignKeys = [
        ForeignKey(
            entity = Group::class,
            parentColumns = ["groupId"],
            childColumns = ["groupId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Student(
    @PrimaryKey(autoGenerate = true)
    val studentId: Long = 0,
    val name: String,
    val birthday: String,
    val groupId: Long,
    val isBudget: Boolean,
    val photo: String
    // Добавьте другие необходимые поля
)

@Entity(
    tableName = "teachers",
    foreignKeys = [
        ForeignKey(
            entity = Group::class,
            parentColumns = ["groupId"],
            childColumns = ["groupId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Teacher(
    @PrimaryKey(autoGenerate = true)
    val teacherId: Long = 0,
    val name: String,
    val specialization: String,
    val groupId: Long,
    val workload: Int,
    val salary: Double
    // Добавьте другие необходимые поля
)

@Entity(tableName = "groups")
data class Group(
    @PrimaryKey(autoGenerate = true)
    val groupId: Long = 0,
    val groupName: String
)

data class StudentWithGroup(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "groupId",
        entityColumn = "groupId"
    )
    val group: Group
)
