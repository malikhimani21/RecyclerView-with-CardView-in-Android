package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Adapter> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        list = new ArrayList<>();
        list.add(new Adapter("HTML", "Hyper text markup lang", "Details of html", R.drawable.html));
        list.add(new Adapter("CSS", "Cascading style sheet", "Details of css", R.drawable.css));
        list.add(new Adapter("PHP", "Server lang", "Details of php", R.drawable.php));
        list.add(new Adapter("Android", "Mobile OS", "Details of android", R.drawable.andorid));
        list.add(new Adapter("Java", "Lang for All", "Details of java", R.drawable.java));
        list.add(new Adapter("jQuery", "Website building", "Details of jQuery", R.drawable.jquery));
        list.add(new Adapter("HTML", "Hyper text markup lang", "Details of html", R.drawable.html));
        list.add(new Adapter("CSS", "Cascading style sheet", "Details of css", R.drawable.css));
        list.add(new Adapter("PHP", "Server lang", "Details of php", R.drawable.php));
        list.add(new Adapter("Android", "Mobile OS", "Details of android", R.drawable.andorid));
        list.add(new Adapter("Java", "Lang for All", "Details of java", R.drawable.java));
        list.add(new Adapter("jQuery", "Website building", "Details of jQuery", R.drawable.jquery));

        AdapterForRecycler adapterForRecycler = new AdapterForRecycler(this, list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapterForRecycler);
    }
}
