package com.example.jobsnearby.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context) : SQLiteOpenHelper(context, DbClass.DATABASE_NAME,
    null, DbClass.DATABASE_VERSION)  {
    override fun onCreate(db: SQLiteDatabase?) {
          db?.execSQL(DbClass.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            db?.execSQL(DbClass.SQL_DELETE_TABLE)
        onCreate(db)
    }
}