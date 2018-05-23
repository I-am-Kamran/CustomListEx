package com.example.marvin.customlistex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //DEFINE AN ARRAY
    public Integer pictures[]=
            {
                    R.drawable.delhi,
                    R.drawable.goa,
                    R.drawable.jaipur,
                    R.drawable.noida,
                    R.drawable.patna,
                    R.drawable.tajamahal

            };
    public String[] data;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=getResources().getStringArray(R.array.data);

        list= (ListView) findViewById(R.id.listView);

        MyCustomAdapter obj=new MyCustomAdapter(this,data,pictures);
        list.setAdapter(obj);
    }
}
