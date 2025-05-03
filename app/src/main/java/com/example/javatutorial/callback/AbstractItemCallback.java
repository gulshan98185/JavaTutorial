package com.example.javatutorial.callback;

import android.content.Context;
import android.widget.Toast;

import com.example.javatutorial.fastadapter.FastAdapterActivity;
import com.mikepenz.fastadapter.items.AbstractItem;

public abstract class AbstractItemCallback {
    public abstract void click(int position, AbstractItem item);

    public void click2(int position, AbstractItem item, Context context) {
        Toast.makeText(context, "Callback 2 is clicked " + position, Toast.LENGTH_SHORT).show();
    }
}
