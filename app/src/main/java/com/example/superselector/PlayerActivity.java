package com.example.superselector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {
Intent i;
Bundle b;
TextView name,age,height,nation;
ImageView pic;
    Integer [][] player_details= {
            { (R.string.mesut), (R.string.mesut_age),(R.string.mesut_height),(R.string.mesut_nat),(R.drawable.ozil)},
            { (R.string.aaron), (R.string.aaron_age),(R.string.aaron_height),(R.string.aaron_nat),(R.drawable.aaron)},
            { (R.string.alexandre), (R.string.alexandre_age),(R.string.alexandre_height),(R.string.alexandre_nat),(R.drawable.alexandre)},
            { (R.string.denis), (R.string.denis_age),(R.string.denis_height),(R.string.denis_nat),(R.drawable.denis)},
            { (R.string.granit), (R.string.granit_age),(R.string.granit_height),(R.string.granit_nat),(R.drawable.granit)},
            { (R.string.hector), (R.string.hector_age),(R.string.hector_height),(R.string.hector_nat),(R.drawable.hector)},
            { (R.string.henrikh ), (R.string.henrikh_age),(R.string.henrikh_height),(R.string.henrikh_nat),(R.drawable.henrikh)},
            { (R.string.pierre), (R.string.pierre_age),(R.string.pierre_height),(R.string.pierre_nat),(R.drawable.pierre)},
            { (R.string.shkodran), (R.string.shkodran_age),(R.string.shkodran_height),(R.string.shkodran_nat),(R.drawable.shkodran)}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_player);
        i = getIntent();
        b = i.getExtras();
        name = findViewById(R.id.name);
        nation = findViewById(R.id.nationaity);
        age = findViewById(R.id.age);
        height = findViewById(R.id.height);
        pic  = findViewById(R.id.image);

        for(int i = 0;i<player_details.length-1;i++){
            Log.d("****** i ",i+"");
            if (Integer.parseInt(b.getString("player"))==i){
                Log.d("***** i", i+"");
                Log.d("***** player", (getResources().getString(player_details[i][1])));
                setContent(i);
            }
        }
    }

    public void setContent(int x){
        pic.setImageResource(player_details[x][4]);
        pic.setContentDescription(String.valueOf(x));
        name.setText("Name:  " +getResources().getString(player_details[x][0]));
        age.setText("Age: " +getResources().getString(player_details[x][1]));
        height.setText("Height: "+ getResources().getString(player_details[x][2]));
        nation.setText("Nationality: " +getResources().getString(player_details[x][3]));    }
}
