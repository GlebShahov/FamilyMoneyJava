package com.example.familymoneyjava;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder>{

    private List <Item> items = Collections.emptyList();




    public void setItems(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);//or LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, viewGroup,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
            Item item = items.get(i);
            itemHolder.bindItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }




    static class ItemHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView price;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
        }

        public void bindItem(Item item){
            name.setText(item.getName());
            price.setText(item.getPrice());
        }

    }

}
