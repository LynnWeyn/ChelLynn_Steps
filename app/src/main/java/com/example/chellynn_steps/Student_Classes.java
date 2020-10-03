package com.example.chellynn_steps;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Student_Classes extends AppCompatActivity {

    ListView listView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_student_class);
        listView = (ListView)findViewById(R.id.listOfClass);
        progressBar = (ProgressBar)findViewById(R.id.classProgressBar);

        ArrayList<String> arrayList = new ArrayList<>();
        //the list would be filled with dates and stepcounts, pulled from storage. for now, just text for testing
        arrayList.add("1    Bob     5023");
        arrayList.add("2    Thando  2180");
        arrayList.add("3    Zaakir  1750");
        arrayList.add("4    Muneera 1698");
        arrayList.add("5    Leslie  1430");
        arrayList.add("6    Tumo    1326");
        arrayList.add("7    Kaylee  894");
        arrayList.add("8    Mo      376");
        arrayList.add("9    Ester   357");
        arrayList.add("10   Jan     234");




        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


    }
}
