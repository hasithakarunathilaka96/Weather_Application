package com.example.weatherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Detail View");

        ImageView imgview = (ImageView)findViewById(R.id.image);
        TextView txtview1 = (TextView)findViewById(R.id.date);
        TextView txtview2 = (TextView)findViewById(R.id.city);
        TextView txtview3 = (TextView)findViewById(R.id.temp);
        TextView txtview4 = (TextView)findViewById(R.id.description);
        TextView txtview5 = (TextView)findViewById(R.id.humidity);

        Bundle bundle = getIntent().getExtras();
        Integer icon = bundle.getInt("Listviewclickicon");
        String txt1 = bundle.getString("ListviewclickDate");
        String txt2 = bundle.getString("Listviewclickcity");
        String txt3 = bundle.getString("ListviewclickTemp");
        String txt4 = bundle.getString("ListviewclickStatus");
        String txt5 = bundle.getString("ListviewclickHumidity");

        imgview.setImageResource((icon));
        txtview1.setText(txt1);
        txtview2.setText(txt2);
        txtview3.setText(txt3);
        txtview4.setText(txt4);
        txtview5.setText("Humidity: "+txt5+"%");
    }
}
