package com.example.danboru.belajarjepang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    private String[] data_menu;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.list_menu);
        data_menu = getResources().getStringArray(R.array.daftar_menu);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data_menu);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position){

                    case 0 : {

                        Intent satu = new Intent(MainActivity.this , Umum.class);
                        startActivity(satu);
                        break;

                    }
                            case 1 : {

                                Intent satu = new Intent(MainActivity.this, Salam.class);
                                startActivity(satu);
                                break;

                            }
                                case 2 : {

                                    Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                    startActivity(satu);
                                    break;

                                }
                                    case 3 : {

                                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                        startActivity(satu);
                                        break;

                                    }
                                        case 4 : {

                                            Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                            startActivity(satu);
                                            break;

                                        }
                                    case 5 : {

                                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                        startActivity(satu);
                                        break;

                                    }
                            case 6 : {

                                Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                startActivity(satu);
                                break;

                            }
                    case 7 : {

                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                        startActivity(satu);
                        break;

                    }
                        case 8 : {

                            Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                            startActivity(satu);
                            break;

                        }
                            case 9 : {

                                Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                startActivity(satu);
                                break;

                            }
                                case 10 : {

                                    Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                    startActivity(satu);
                                    break;

                                }
                                    case 11 : {

                                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                        startActivity(satu);
                                        break;

                                    }
                                        case 12 : {

                                            Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                            startActivity(satu);
                                            break;

                                        }
                                    case 13 : {

                                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                        startActivity(satu);
                                        break;

                                    }
                                case 14 : {

                                    Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                    startActivity(satu);
                                    break;

                                }
                            case 15 : {

                                Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                startActivity(satu);
                                break;

                            }
                    case 16 : {

                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                        startActivity(satu);
                        break;

                    }
                            case 17 : {

                                Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                startActivity(satu);
                                break;

                            }
                                case 18 : {

                                    Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                    startActivity(satu);
                                    break;

                                }
                            case 19 : {

                                Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                                startActivity(satu);
                                break;

                            }
                        case 20 : {

                            Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                            startActivity(satu); break;

                        }
                    case 21 : {

                        Intent satu = new Intent(MainActivity.this, Akomodasi.class);
                        startActivity(satu);
                        break;

                    }


                }


            }
        });

    }


}
