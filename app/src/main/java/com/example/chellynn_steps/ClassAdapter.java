package com.example.chellynn_steps;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;

public class ClassAdapter extends ArrayAdapter<String> {

    public ClassAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
