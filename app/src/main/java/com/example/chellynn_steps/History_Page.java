package com.example.chellynn_steps;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class History_Page extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_page);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();
        //the list would be filled with dates and stepcounts, pulled from storage. for now, just text for testing
        arrayList.add("01/10/2020 - 1024 steps");
        arrayList.add("30/09/2020 - 3624 steps");
        arrayList.add("29/09/2020 - 8950 steps");
        arrayList.add("28/09/2020 - 1024 steps");
        arrayList.add("27/09/2020 - 3624 steps");
        arrayList.add("26/09/2020 - 8950 steps");
        arrayList.add("25/09/2020 - 1024 steps");
        arrayList.add("24/09/2020 - 3624 steps");
        arrayList.add("23/09/2020 - 8950 steps");
        arrayList.add("22/09/2020 - 1024 steps");
        arrayList.add("21/09/2020 - 3624 steps");
        arrayList.add("20/09/2020 - 8950 steps");
        arrayList.add("19/09/2020 - 1024 steps");
        arrayList.add("18/09/2020 - 3624 steps");
        arrayList.add("17/09/2020 - 8950 steps");
        arrayList.add("16/09/2020 - 1024 steps");
        arrayList.add("15/09/2020 - 3624 steps");
        arrayList.add("14/09/2020 - 8950 steps");
        arrayList.add("13/09/2020 - 1024 steps");
        arrayList.add("12/09/2020 - 3624 steps");
        arrayList.add("11/09/2020 - 8950 steps");
        arrayList.add("10/09/2020 - 1024 steps");
        arrayList.add("09/09/2020 - 3624 steps");
        arrayList.add("08/09/2020 - 8950 steps");
        arrayList.add("07/09/2020 - 1024 steps");
        arrayList.add("06/09/2020 - 3624 steps");
        arrayList.add("05/09/2020 - 8950 steps");
        arrayList.add("04/09/2020 - 1024 steps");
        arrayList.add("03/09/2020 - 3624 steps");
        arrayList.add("02/09/2020 - 8950 steps");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

    }
}