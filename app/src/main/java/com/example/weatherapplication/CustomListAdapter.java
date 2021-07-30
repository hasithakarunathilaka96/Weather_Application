package com.example.weatherapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] weatherDate;
    private final Integer[] icon;
    private final String[] weatherStatus;
    private final String[] weatherTemp;

    public CustomListAdapter(Activity context,String[] weatherDate,Integer[] icon, String[] weatherStatus,String[] weatherTemp){
        super(context, R.layout.weather_list,weatherDate);

        this.context = context;
        this.weatherDate = weatherDate;
        this.icon = icon;
        this.weatherStatus = weatherStatus;
        this.weatherTemp = weatherTemp;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.weather_list,null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.weatherDate);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView txtStatus = (TextView) rowView.findViewById(R.id.weatherStatus);
        TextView txtTemp = (TextView) rowView.findViewById(R.id.weatherTemp);

        txtTitle.setText(weatherDate[position]);
        imageView.setImageResource(icon[position]);
        txtStatus.setText(weatherStatus[position]);
        txtTemp.setText(weatherTemp[position]);

        return rowView;
    }


}
