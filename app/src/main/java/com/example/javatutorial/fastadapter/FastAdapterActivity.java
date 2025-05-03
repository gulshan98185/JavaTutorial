package com.example.javatutorial.fastadapter;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.javatutorial.R;
import com.example.javatutorial.callback.AbstractItemCallback;
import com.example.javatutorial.callback.ItemCallback;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.ISelectionListener;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.listeners.OnClickListener;
import com.mikepenz.fastadapter.listeners.OnLongClickListener;
import com.mikepenz.fastadapter.select.SelectExtension;

import java.util.ArrayList;
import java.util.List;

public class FastAdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FastAdapter<AbstractItem> fastAdapter;
    ItemAdapter<AbstractItem> itemAdapter;
    SelectExtension<AbstractItem> selectExtension;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_adapter);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Fast Adapter Example");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /*GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (fastAdapter.getItem(position) instanceof HeaderItem) {
                    return 3;
                }
                return 1;
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);*/
        itemAdapter = ItemAdapter.items();
        fastAdapter = FastAdapter.with(itemAdapter);
        selectExtension = new SelectExtension<>();
        fastAdapter.addExtension(selectExtension);
        selectExtension.withSelectable(true);
        selectExtension.withSelectWithItemUpdate(true);
        selectExtension.withSelectOnLongClick(true);
//        selectExtension.withAllowDeselection(false);
        selectExtension.withMultiSelect(true);
        recyclerView.setAdapter(fastAdapter);

        ItemCallback itemCallback = new ItemCallback() {
            @Override
            public void click(int position, AbstractItem item) {
                Toast.makeText(FastAdapterActivity.this, "Callback1 is clicked " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void click2(int position, AbstractItem item) {
                ItemCallback.super.click2(position, item);

            }
        };

        FastAdapterHandler fastAdapterHandler = new FastAdapterHandler();
        fastAdapterHandler.handleFastAdapter(this, itemCallback);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}