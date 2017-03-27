package com.example.ezasabz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by davidkim on 3/25/17.
 */

public class WhiteLines extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whitlines);
    }

    public void backDirect(View v) {
        Intent intent = new Intent(WhiteLines.this, MainActivity.class);
        startActivity(intent);
    }
}
