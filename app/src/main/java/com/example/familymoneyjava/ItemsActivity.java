package com.example.familymoneyjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        recyclerView = findViewById(R.id.recyclerView);
        itemAdapter = new ItemAdapter();
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        List <Item> item = new ArrayList<>();
        item.add(new Item("Молоко", "70р"));
        item.add(new Item("Колбаса", "230р"));
        item.add(new Item("Мороженное", "35р"));
        item.add(new Item("Сыр", "120р"));
        item.add(new Item("Штаны", "2300р"));
        item.add(new Item("Садик", "2600р"));

        itemAdapter.setItems(item);
    }
}