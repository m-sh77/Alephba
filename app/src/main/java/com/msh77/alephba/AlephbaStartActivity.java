package com.msh77.alephba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlephbaStartActivity extends AppCompatActivity implements View.OnClickListener {
    private Button singleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alephba_start);
        singleButton = (Button) findViewById(R.id.single_button);
        singleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if((Button) v == singleButton){
            Intent intent = new Intent(this,AlephbaSingleActivity.class);
            startActivity(intent);
        }
    }
}
