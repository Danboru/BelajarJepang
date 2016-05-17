package com.example.danboru.belajarjepang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Akomodasi extends AppCompatActivity {

    ListView listnya;
    ArrayAdapter<String> adapternya;
    String[] datanya_akomodasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akomodasi);

        listnya = (ListView) findViewById(R.id.list_akoomodasi);
        datanya_akomodasi = getResources().getStringArray(R.array.string_akomodasi);

        adapternya = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datanya_akomodasi);

        listnya.setAdapter(adapternya);

        listnya.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position){

                    case 0 : {



                    }

                    case 1 : {




                    }


                }


            }
        });

    }


}
