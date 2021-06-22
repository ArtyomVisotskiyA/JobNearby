package com.example.jobsnearby.db

import android.provider.BaseColumns


object DbClass  : BaseColumns{
    const val TABLE_NAME = "my table"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_CONTENT = "subtitle"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "JobsNearbyDb.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $COLUMN_NAME_TITLE TEXT, $COLUMN_NAME_CONTENT TEXT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}

val DATABASE_VERSION: Int = 1
val DATABASE_NAME: String = "Jobs.db"
val TABLE_NAME: String = "Jobs"

//table column name

val KEY_ID: String = "id"
val KEY_JOB_NAME: String = "Наименование работы"
val KEY_JOB_ADDRESS: String = "Адрес"
val KEY_JOB_PAYMENT: String = "Оплата"
val KEY_JOB_DATE: String = "Дата"