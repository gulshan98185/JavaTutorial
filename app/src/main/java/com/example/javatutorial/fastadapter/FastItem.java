package com.example.javatutorial.fastadapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.javatutorial.R;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import java.util.List;

public class FastItem extends AbstractItem<FastItem, FastItem.FastViewHolder> {
    private String name;
    private int age;

    public FastItem(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getType() {
        return R.id.item;
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
        IconicsImageView iconicsImageView;

        public FastViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            iconicsImageView = itemView.findViewById(R.id.close_button);
        }

        @Override
        public void unbindView(FastItem item) {
            name.setText(null);
            age.setText(null);
        }

        @Override
        public void bindView(FastItem item, List payloads) {
            Context context = itemView.getContext();
            name.setText(item.name);
            age.setText(item.age + "");
            if(item.isSelected()){
                iconicsImageView.setIcon(new IconicsDrawable(itemView.getContext(), CommunityMaterial.Icon2.cmd_marker_check)
                        .color(context.getResources()
                                .getColor(R.color.red)));
            }else {
                iconicsImageView.setIcon(new IconicsDrawable(itemView.getContext(), CommunityMaterial.Icon2.cmd_lightbulb_on)
                        .color(context.getResources()
                                .getColor(R.color.green)));
            }

        }
    }
}
