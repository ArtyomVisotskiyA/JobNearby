package com.example.jobsnearby.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.core.content.contentValuesOf

class DbManger(val context:Context) {
    val DbHelper = DbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDb() {
        db = DbHelper.writableDatabase

    }

    fun incertToDb(title: String, content: String) {
        val values = ContentValues().apply {
            put(DbClass.COLUMN_NAME_TITLE, title)
            put(DbClass.COLUMN_NAME_CONTENT, content)

        }
        db?.insert(DbClass.TABLE_NAME, null, values)
    }

    fun readDbData(): ArrayList<String> {
        val dataList = ArrayList<String>()
        val cursor = db?.query(
            DbClass.TABLE_NAME, null, null, null,
            null, null, null
        )

        with(cursor) {
            while (cursor?.moveToNext()!!) {
                val dataText = cursor?.getString(cursor.getColumnIndex(DbClass.COLUMN_NAME_TITLE))
                dataList.add(dataText.toString())
            }
             cursor.close()
            return dataList
        }
    }
    fun closeDb(){
        DbHelper.close()
    }
}