package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewDataActivity extends AppCompatActivity {

    private TextView textViewTitle, textViewDesc;
    private ImageView imageView;

    private static final String TITLE = "com.example.myapplication.TITLE";
    private static final String DESC = "com.example.myapplication.DESC";
    private static final String IMG = "com.example.myapplication.IMG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        textViewTitle = (TextView) findViewById(R.id.receive_title);
        textViewDesc = (TextView) findViewById(R.id.receive_desc);
        imageView = (ImageView) findViewById(R.id.receive_img);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString(TITLE);
        String Description = intent.getExtras().getString(DESC);
        int image = intent.getExtras().getInt(IMG);

        textViewTitle.setText(Title);
        textViewDesc.setText(Description);
        imageView.setImageResource(image);

    }
}
