package com.example.generalassembly.multiple_devices_lab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class CardActivity extends AppCompatActivity {
    ListView mCardListView;
    CardView mCardView;
    TextView mCardTextView;
    ArrayList<String> mList;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_main);

        mCardListView = (ListView) findViewById(R.id.cardListView);
        mCardView = (CardView) findViewById(R.id.cardView);
        mCardTextView = (TextView) findViewById(R.id.cardTextView);

        mList = new ArrayList<>();
        mList.add("One");
        mList.add("Two");
        mList.add("Three");
        mList.add("Four");
        mList.add("Five");
        mList.add("Six");
        mAdapter = new ArrayAdapter<String>(CardActivity.this, android.R.layout.simple_list_item_1, mList);
        mCardListView.setAdapter(mAdapter);

    }
}
