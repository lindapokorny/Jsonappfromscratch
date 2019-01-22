package com.example.lindapokorny.jsonclassworkrecyclerviewretrofitwithrusi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class AndroidDataBase extends SQLiteOpenHelper {
    private static final String TABLE_NAME = "Android";
    private static final String DATABASE_NAME = "https://api.learn2crack.com/android/jsonandroid/";
    private static final int SCHEMA_VERSION = 1;
    private static AndroidDataBase androidDataBaseInstance;

    public static synchronized AndroidDataBase getAndroidDataBaseInstance(Context context){
        if(androidDataBaseInstance == null){

        }
        return null;
    }
    public AndroidDataBase(@Nullable Context context){
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME +
                " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "ver TEXT, name TEXT, api TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
