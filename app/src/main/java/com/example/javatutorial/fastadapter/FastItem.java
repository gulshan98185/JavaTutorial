package com.example.javatutorial.fastadapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.javatutorial.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

public class FastItem extends AbstractItem<FastItem, FastItem.FastViewHolder> {
    private String name;
    private int age;

    public FastItem(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fast_item;
    }

    @NonNull
    @Override
    public FastViewHolder getViewHolder(View v) {
        return new FastViewHolder(v);
    }

    static class FastViewHolder extends FastAdapter.ViewHolder<FastItem> {
        TextView name;
        TextView age;

        public FastViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
        }

        @Override
        public void unbindView(FastItem item) {
            name.setText(null);
            age.setText(null);
        }

        @Override
        public void bindView(FastItem item, List payloads) {
            name.setText(item.name);
            age.setText(item.age + "");
        }
    }
}
