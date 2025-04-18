package com.example.javatutorial.fastadapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.javatutorial.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

public class HeaderItem extends AbstractItem<HeaderItem, HeaderItem.FastViewHolder> {
    private String title;

    public HeaderItem(String title) {
        this.title = title;
    }

    @Override
    public int getType() {
        return R.id.headerItem;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.header_item;
    }

    @NonNull
    @Override
    public FastViewHolder getViewHolder(View v) {
        return new FastViewHolder(v);
    }

    static class FastViewHolder extends FastAdapter.ViewHolder<HeaderItem> {
        TextView name;

        public FastViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.title);
        }

        @Override
        public void unbindView(HeaderItem item) {
            name.setText(null);
        }

        @Override
        public void bindView(HeaderItem item, List payloads) {
            name.setText(item.title);
        }
    }
}
