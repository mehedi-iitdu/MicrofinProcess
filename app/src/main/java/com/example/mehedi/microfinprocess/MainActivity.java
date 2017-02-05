package com.example.mehedi.microfinprocess;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.mehedi.microfinprocess.processCard.CardAdapter;
import com.example.mehedi.microfinprocess.processCard.CardData;
import com.example.mehedi.microfinprocess.reportList.ReportData;
import com.example.mehedi.microfinprocess.reportList.ReportListAdapter;
import com.example.mehedi.microfinprocess.roundedImage.RoundImage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

/*    RecyclerView recyclerView;
*//*    GridLayoutManager gridLayoutManager;
    *//**//*List <CardData> List = new ArrayList<>();
    CardAdapter adapter;*//*

    List<ReportData> reportDataList = new ArrayList<>();
    ReportListAdapter reportListAdapter;*/

    ImageView imageView_member_image;
    RoundImage roundImage;
    Spinner samity_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_member);

        imageView_member_image = (ImageView) findViewById(R.id.iv_member_image);
        samity_spinner = (Spinner) findViewById(R.id.spinner);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mehedi);
        roundImage = new RoundImage(bitmap);
        imageView_member_image.setImageDrawable(roundImage);

        List<String> list = new ArrayList<>();
        list.add("A  B  C");
        list.add("X  Y  Z");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        samity_spinner.setAdapter(dataAdapter);


/*        CardData cardList1 = new CardData(R.drawable.member_process, "Auto Process");
        CardData cardList2 = new CardData(R.drawable.check_out, "Share");
        CardData cardList3 = new CardData(R.drawable.batch, "Batch");
        CardData cardList4 = new CardData(R.drawable.samity_process, "Samity Process");

        List.add(cardList1);
        List.add(cardList2);
        List.add(cardList3);
        List.add(cardList4);


        recyclerView = (RecyclerView) findViewById(R.id.cv_cardlist);
        adapter = new CardAdapter(this, List);
        recyclerView.setAdapter(adapter);

        gridLayoutManager = new GridAutoFitLayoutManager(MainActivity.this, 250);
        recyclerView.setLayoutManager(gridLayoutManager);*/

/*        TextView report_no = (TextView) findViewById(R.id.report_no);
        TextView report_name = (TextView) findViewById(R.id.report_name);


        report_no.setBackgroundDrawable (drawCircle (MainActivity.this, 50, 50, Color.parseColor("#ffFEBB31")));
        report_no.setText ("20");*/

        /*ReportData reportData1 = new ReportData("#4A148C","#6A1B9A","1","First Report");
        ReportData reportData2 = new ReportData("#880E4F","#AD1457", "2", "Second Report");
        ReportData reportData3 = new ReportData("#0D47A1", "#1565C0", "3", "Third Report");

        reportDataList.add(reportData1);
        reportDataList.add(reportData2);
        reportDataList.add(reportData3);

        recyclerView = (RecyclerView) findViewById(R.id.cv_cardlist);
        reportListAdapter = new ReportListAdapter(this, reportDataList);
        recyclerView.setAdapter(reportListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));*/

    }

}
