package com.example.mehedi.microfinprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    List <CardList> List = new ArrayList<>();;
    CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardList cardList1 = new CardList(R.drawable.member_process, "Auto Process");
        CardList cardList2 = new CardList(R.drawable.member_process, "Auto Process");
        CardList cardList3 = new CardList(R.drawable.member_process, "Auto Process");

        List.add(cardList1);
        List.add(cardList2);
        List.add(cardList3);


        recyclerView = (RecyclerView) findViewById(R.id.cv_cardlist);
        adapter = new CardAdapter(this, List);
        recyclerView.setAdapter(adapter);

        gridLayoutManager = new GridAutoFitLayoutManager(MainActivity.this, 150);
        recyclerView.setLayoutManager(gridLayoutManager);

    }

}
