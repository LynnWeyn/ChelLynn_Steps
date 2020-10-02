package com.example.chellynn_steps;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Student_Classes extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_student_class);


        ArrayList<String> arrayList = new ArrayList<>();
        //the list would be filled with dates and stepcounts, pulled from storage. for now, just text for testing
        arrayList.add("1    Bob     5000");
        arrayList.add("2    Thando  2000");
        arrayList.add("3    Zaakir  1750");
        arrayList.add("4    Muneera 1698");
        arrayList.add("5    Leslie  1430");
        arrayList.add("6    Tumo    1326");
        arrayList.add("7    Kaylee  894");



        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
