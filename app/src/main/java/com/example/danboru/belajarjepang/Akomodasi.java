package com.example.danboru.belajarjepang;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Akomodasi extends Activity {

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

                        MediaPlayer play;

                        play = MediaPlayer.create(Akomodasi.this, R.raw.calestia);
                        play.start();

                        break;
                    }

                    case 1 : {


                        Toast.makeText(Akomodasi.this, "Hello", Toast.LENGTH_SHORT).show();

                        break;
                    }



                }


            }
        });

    }


}
