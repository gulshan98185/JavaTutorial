package com.example.javatutorial.fastadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javatutorial.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.listeners.OnClickListener;
import com.mikepenz.fastadapter.listeners.OnLongClickListener;

import java.util.ArrayList;
import java.util.List;

public class FastAdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FastAdapter<FastItem> fastAdapter;
    ItemAdapter<FastItem> itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_adapter);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = ItemAdapter.items();
        fastAdapter = FastAdapter.with(itemAdapter);
        recyclerView.setAdapter(fastAdapter);

        List<FastItem> items = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            items.add(new FastItem("Name " + i, i));
        }

        fastAdapter.withOnPreClickListener(new OnClickListener<FastItem>() {
            @Override
            public boolean onClick(View v, IAdapter<FastItem> adapter, FastItem item, int position) {
                Toast.makeText(FastAdapterActivity.this, "Item is pre clicked : " + (position+1), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        fastAdapter.withOnClickListener(new OnClickListener<FastItem>() {
            @Override
            public boolean onClick(View v, IAdapter<FastItem> adapter, FastItem item, int position) {
                Toast.makeText(FastAdapterActivity.this, "Item is clicked : " + (position+1), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        fastAdapter.withOnLongClickListener(new OnLongClickListener<FastItem>() {
            @Override
            public boolean onLongClick(View v, IAdapter<FastItem> adapter, FastItem item, int position) {
                Toast.makeText(FastAdapterActivity.this, "Item is long clicked : " + (position+1), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        fastAdapter.withEventHook(new ClickEventHook<FastItem>() {
            @Override
            public void onClick(View v, int position, FastAdapter<FastItem> fastAdapter, FastItem item) {
                Toast.makeText(FastAdapterActivity.this, "Item is clicked : " + (position+1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public View onBind(RecyclerView.ViewHolder viewHolder) {
                if(viewHolder instanceof FastItem.FastViewHolder){
                    return ((FastItem.FastViewHolder) viewHolder).name;
                }
                return super.onBind(viewHolder);
            }
        });

        itemAdapter.setNewList(items);

    }
}