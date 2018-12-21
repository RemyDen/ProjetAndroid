package com.example.jeff.Planet2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.Drawable;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySQLiteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "db_users";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS users");
        String CREATE_USER_TABLE = "CREATE TABLE users ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nom TEXT, "+
                "prenom TEXT, " +
                "avatar INTEGER, "+
                "passwd TEXT)";

        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    // Books table name
    private static final String TABLE_USERS = "users";

    // Books Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NOM = "nom";
    private static final String KEY_PRENOM = "prenom";
    private static final String KEY_AVATAR = "avatar";
    private static final String KEY_PASSWD = "password";

    private static final String[] COLUMNS = {KEY_ID,KEY_NOM,KEY_PRENOM,KEY_AVATAR,KEY_PASSWD};

    public void addaUser(User u){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NOM, u.getNom());
        values.put(KEY_PRENOM,u.getPrenom());
        values.put(KEY_AVATAR,u.getIdAvatar());
        values.put(KEY_PASSWD,u.getPasswd());

        db.insert(TABLE_USERS, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values

        // 4. close
        db.close();
    }


    public List<User> getAllUsers() {
        List<User> users = new LinkedList<User>();

        // 1. build the query
        String query = "SELECT * FROM users" ;

        // 2. get reference to DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        User u = null;
        if (cursor.moveToFirst()) {
            do {
                u = new User();
                u.setNom(cursor.getString(1));
                u.setPrenom(cursor.getString(2));
                u.setIdAvatar(cursor.getInt(3));
                u.setPasswd(cursor.getString(4));

                users.add(u);
                System.out.println(u.toString());
            } while (cursor.moveToNext());
        }
        return users;
    }
}

