package com.example.c

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactsDAO {

    //As this  our database operations we will make them run in corutines(suspend keyword)
    @Upsert
    suspend fun upsertContact(contacts: Contacts)

    @Delete
    suspend fun deleteContact(contacts: Contacts)

    @Query("SELECT * from Contacts ORDER BY firstName ASC")
    fun getContactsByFirstName():Flow<List<Contacts>>

    @Query("SELECT * from Contacts ORDER BY lastName ASC")
    fun getContactsByLastName():Flow<List<Contacts>>

    @Query("SELECT * from Contacts ORDER BY phoneNumber ASC")
    fun getContactsByPhoneNumber():Flow<List<Contacts>>
}