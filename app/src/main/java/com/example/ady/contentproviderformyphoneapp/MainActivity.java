package com.example.ady.contentproviderformyphoneapp;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<MyContacts> myContacts = new ArrayList<>();

        Uri MY_URI = Uri.parse("content://com.example.ady.myphoneapp/Contact");
        ContentResolver result = getContentResolver();
        Cursor cursor = result.query(MY_URI,null,null,null,null);



        while(cursor.moveToNext()){
            String Name = cursor.getString(0);
            String Number = cursor.getString(1);
            String Email = cursor.getString(2);
            String Address = cursor.getString(3);
            String Sport = cursor.getString(4);
            myContacts.add(new MyContacts(Name,Number,Email,Address,Sport));



            //myContacts.add(new MyContacts(cursor.getString(0)
              //      ,cursor.getString(1)
                //    ,cursor.getString(2)
                  //  ,cursor.getString(3)
                  //  ,cursor.getString(4)));

        }
        RecyclerView recyclerView = findViewById(R.id.recycleName);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(MainActivity.this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        Recycleadapter recycleadapter = new Recycleadapter(myContacts);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setAdapter(recycleadapter);


    }

}
