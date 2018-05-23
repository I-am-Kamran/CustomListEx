package com.example.marvin.customlistex;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MARVIN on 15-01-2018.
 */

public class MyCustomAdapter extends ArrayAdapter
{
    Activity activity;
    String text[];
    Integer[] img;
    public MyCustomAdapter(Activity activity,String text[],Integer img[]) {
        super(activity,R.layout.custom_layout,text);

        this.activity=activity;
        this.text=text;
        this.img=img;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent)
    {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.custom_layout,null);

        ImageView imageView= (ImageView) v.findViewById(R.id.image);
        TextView textView= (TextView) v.findViewById(R.id.text);

        imageView.setImageResource(img[position]);
        textView.setText(text[position]);

        return v;
    }
}
