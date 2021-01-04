package com.codepath.ekinma;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {
    List<String> items;
    public ItemsAdapter(List<String> items) {
        this.items = items;
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;
        public ViewHolder(View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(android.R.id.text1);
        }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(parent.getContent()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new Viewholder(todoView);
    }
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.bind(item);
    }

    public int getItemCount() {
        return items.size();
    }
        public void bind(String item) {
            tvItem.setText(item);
        }
    }
}
