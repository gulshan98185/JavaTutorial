package com.example.javatutorial.callback;

import com.mikepenz.fastadapter.items.AbstractItem;

public interface ItemCallback {
    void click(int position, AbstractItem item);

    default void click2(int position, AbstractItem item) {
        // Default implementation can be provided here if needed
    }
}
