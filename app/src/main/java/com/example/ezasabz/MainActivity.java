package com.example.ezasabz;

import java.util.ArrayList;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.CheckBox;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    private Resources res;
    private LinearLayout layout;
    private int count;
    private ArrayList<Integer> activityList;
    private int[] animations = new int[3];
    private int[] sounds = new int[4];
    private int[] videos = new int [3];
    private int[] bool = {0,0,0,0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.listView);
        count = layout.getChildCount();

        for (int i = 0; i < 3; i++) {
            CheckBox child = (CheckBox)layout.getChildAt(i);
            animations[i] = child.getId();
        }
        for (int k = 3; k < 7; k++) {
            int spot = 0;
            CheckBox child = (CheckBox)layout.getChildAt(k);
            sounds[spot] = child.getId();
            spot++;
        }
        for (int m = 7; m < 10; m++) {
            int spott = 0;
            CheckBox child = (CheckBox)layout.getChildAt(m);
            videos[spott] = child.getId();
            spott++;
        }
    }
    public void confirmActivity(View v) {
        int animC = 0;
        int soundC = 0;
        int videoC = 0;

        for (int i = 0; i < count; i ++) {
            CheckBox child = (CheckBox)layout.getChildAt(i);
            if (child.isChecked()) {
                bool[i] = 1;
                if(i < 3) {
                    animC++;
                }
                else if (i >=3 && i < 7) {
                    soundC++;
                }
                else {
                    videoC++;
                }
                activityList.add(child.getId());
            }
        }
        if (animC > 1 || soundC > 1 || videoC > 1) {
            System.exit(1);
        }
        if (bool[0] == 1) {
            Intent intent = new Intent(MainActivity.this, GeometryBreathing.class);
            startActivity(intent);
        }
        if (bool[1] == 1) {
            Intent intent = new Intent(MainActivity.this, BlueCircle.class);
            startActivity(intent);
        }
        if (bool[2] == 1) {
            Intent intent = new Intent(MainActivity.this, WhiteLines.class);
            startActivity(intent);
        }
        if (bool[3] == 1) {
            Intent intent = new Intent(MainActivity.this, GeometryBreathing.class);
            startActivity(intent);
        }
//
//        for (int j = 0; j < activityList.size(); j ++) {
//            System.out.println(activityList.get(j));
//        }
    }
}

