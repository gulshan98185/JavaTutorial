package com.example.javatutorial.fastadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.javatutorial.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.listeners.OnClickListener;
import com.mikepenz.fastadapter.listeners.OnLongClickListener;

import java.util.ArrayList;
import java.util.List;

public class FastAdapterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FastAdapter<AbstractItem> fastAdapter;
    ItemAdapter<AbstractItem> itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_adapter);
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
        recyclerView.setAdapter(fastAdapter);

        List<AbstractItem> items = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if(i % 10 == 1){
                items.add(new HeaderItem("Header " + i));
            }
            items.add(new FastItem("Name " + i, i));
        }

        /*fastAdapter.withOnPreClickListener(new OnClickListener<AbstractItem>() {
            @Override
            public boolean onClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                Toast.makeText(FastAdapterActivity.this, "Item is pre clicked : " + (position+1), Toast.LENGTH_SHORT).show();
                return true;
            }
        });*/

        fastAdapter.withOnClickListener(new OnClickListener<AbstractItem>() {
            @Override
            public boolean onClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                if(item instanceof HeaderItem){
                    return false;
                }
                Toast.makeText(FastAdapterActivity.this, "Item is clicked : " + ((FastItem)item).getName(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        fastAdapter.withOnLongClickListener(new OnLongClickListener<AbstractItem>() {
            @Override
            public boolean onLongClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                if(item instanceof HeaderItem){
                    return false;
                }
                Toast.makeText(FastAdapterActivity.this, "Item is long clicked : " + ((FastItem)item).getName(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        fastAdapter.withEventHook(new ClickEventHook<AbstractItem>() {
            @Override
            public void onClick(View v, int position, FastAdapter<AbstractItem> fastAdapter, AbstractItem item) {
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