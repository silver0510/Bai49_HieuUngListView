package com.example.sinki.bai49_hieuunglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvData;
    ArrayList<String>dsTen;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {

    }

    private void addEvents() {
        lvData = (ListView) findViewById(R.id.lvData);
        dsTen = new ArrayList<>();
        adapter = new MyAdapter(MainActivity.this,R.layout.item,dsTen);
        lvData.setAdapter(adapter);
        for(int i =0;i<5000;i++)
        {
            dsTen.add("Tên thứ "+i);
        }
        adapter.notifyDataSetChanged();
    }
}
