package com.example.rycycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> modelPahlawans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvpahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(this);
        adapterPahlawan.setModelPahlawans(modelPahlawans);
        recyclerView.setAdapter(adapterPahlawan);
    }
}
