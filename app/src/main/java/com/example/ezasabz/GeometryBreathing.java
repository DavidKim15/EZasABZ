package com.example.ezasabz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by davidkim on 3/25/17.
 */

public class GeometryBreathing extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geometrybreathing);
    }

    public void backDirect(View v) {
        Intent intent = new Intent(GeometryBreathing.this, MainActivity.class);
        startActivity(intent);
    }
}
