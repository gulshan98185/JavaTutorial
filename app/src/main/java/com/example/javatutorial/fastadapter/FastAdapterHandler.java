package com.example.javatutorial.fastadapter;

import android.content.Context;
import android.widget.Toast;

import com.example.javatutorial.callback.AbstractItemCallback;
import com.example.javatutorial.callback.ItemCallback;
import com.example.javatutorial.callback.NormalCallback;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.ArrayList;
import java.util.List;

public class FastAdapterHandler extends NormalCallback {

    public void handleFastAdapter(FastAdapterActivity fastAdapterActivity, ItemCallback itemCallback) {
        List<AbstractItem> items = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if(i % 10 == 1){
                items.add(new HeaderItem("Header " + i));
            }
            items.add(new FastItem("Name " + i, i, new AbstractItemCallback() {
                @Override
                public void click(int position, AbstractItem item) {
                    Toast.makeText(fastAdapterActivity, "Callback 1 is clicked " + position, Toast.LENGTH_SHORT).show();
                }
            }));
        }

        /*fastAdapter.withOnPreLongClickListener(new OnLongClickListener<AbstractItem>() {
            @Override
            public boolean onLongClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                if(item instanceof HeaderItem){
                    return true;
                }
                return false;
            }
        });*/

        /*fastAdapter.withOnPreClickListener(new OnClickListener<AbstractItem>() {
            @Override
            public boolean onClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                Toast.makeText(FastAdapterActivity.this, "Item is pre clicked : " + (position+1), Toast.LENGTH_SHORT).show();
                return true;
            }
        });*/

        /*fastAdapter.withOnClickListener(new OnClickListener<AbstractItem>() {
            @Override
            public boolean onClick(View v, IAdapter<AbstractItem> adapter, AbstractItem item, int position) {
                if(item instanceof HeaderItem){
                    return false;
                }
                if(!selectExtension.getSelections().isEmpty()){
                    if(item.isSelected()) {
                        selectExtension.deselect(position);
                    }else {
                        selectExtension.select(position);
                    }
                    return false;
                }
                Toast.makeText(FastAdapterActivity.this, "Item is clicked : " + ((FastItem)item).getName(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        selectExtension.withSelectionListener(new ISelectionListener<AbstractItem>() {
            @Override
            public void onSelectionChanged(AbstractItem item, boolean selected) {
                int totalCount = selectExtension.getSelections().size();
                if(totalCount > 0){
                    toolbar.setSubtitle("Selected " + totalCount + " items");
                }else {
                    toolbar.setSubtitle("");
                }
            }
        });*/

        /*fastAdapter.withOnLongClickListener(new OnLongClickListener<AbstractItem>() {
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
        });*/

        fastAdapterActivity.itemAdapter.setNewList(items);
//        selectExtension.select(1);
    }

    @Override
    public void click(int position, String name) {
        super.click(position, name);
    }

    @Override
    public void click2(int position, String name) {
        super.click2(position, name);
    }
}
