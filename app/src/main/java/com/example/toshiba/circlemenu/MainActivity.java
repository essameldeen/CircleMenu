package com.example.toshiba.circlemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circleMenu);

        circleMenu.setMainMenu(Color.parseColor("#cdcdcd"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258cff"),R.drawable.facebook)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.twitter)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.youtube)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.drive)
                .addSubMenu(Color.parseColor("#03a9fa"),R.drawable.contact);
        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                Toast.makeText(getApplicationContext(),"You Select item number "+String.valueOf(i) ,Toast.LENGTH_LONG).show();
            }
        });

    }
}
