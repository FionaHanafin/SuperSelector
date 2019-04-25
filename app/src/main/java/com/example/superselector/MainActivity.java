package com.example.superselector;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String names[] = {
                getResources().getString(R.string.mesut), getResources().getString(R.string.aaron), getResources().getString(R.string.alexandre),
                getResources().getString(R.string.denis), getResources().getString(R.string.granit), getResources().getString(R.string.hector),
                getResources().getString(R.string.henrikh ), getResources().getString(R.string.pierre), getResources().getString(R.string.shkodran)};
        String nationality[] = {
                getResources().getString(R.string.mesut_nat), getResources().getString(R.string.aaron_nat), getResources().getString(R.string.alexandre_nat),
                getResources().getString(R.string.denis_nat), getResources().getString(R.string.granit_nat), getResources().getString(R.string.hector_nat),
                getResources().getString(R.string.henrikh_nat), getResources().getString(R.string.pierre_nat), getResources().getString(R.string.shkodran_nat)};
        Integer ages[] = {
                (R.string.mesut_age),(R.string.aaron_age), (R.string.alexandre_age),
                (R.string.denis_age),(R.string.granit_age), (R.string.hector_age),
                (R.string.henrikh_age ), (R.string.pierre_age), (R.string.shkodran_age)};
        Integer height[] = {
                (R.string.mesut_height), (R.string.aaron_height), (R.string.alexandre_height),
                (R.string.denis_height), (R.string.granit_height), (R.string.hector_height),
                (R.string.henrikh_height ), (R.string.pierre_height), (R.string.shkodran_height)};
        Integer pics[] = {
                (R.drawable.ozil), (R.drawable.aaron), (R.drawable.alexandre),
                (R.drawable.denis),(R.drawable.granit),(R.drawable.hector),
                (R.drawable.henrikh), (R.drawable.pierre), (R.drawable.shkodran)
        };
        MyListAdapter adapter= new MyListAdapter(this,names,ages,height,nationality,pics);
        ListView playerList = findViewById(R.id.list);
        playerList.setAdapter(adapter);

        playerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                TextView t = (TextView) view;
                Intent i;
//                String str = t.getText().toString();
                switch (position){
                    case 0:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 7:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                    case 8:
                        i = new Intent(MainActivity.this, PlayerActivity.class);
                        i.putExtra("player",position+"");
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

