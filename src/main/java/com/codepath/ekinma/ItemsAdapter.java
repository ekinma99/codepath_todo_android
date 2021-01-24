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
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(todoView);
    }
    public int getItemCount() {
        return items.size();
    }
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.bind(item);
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;
        public ViewHolder(View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(android.R.id.text1);
        }
        public void bind(String item) {
            tvItem.setText(item);
        }
    }
}
