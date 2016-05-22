package com.msh77.alephba;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlephaMainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button startButton;
    private Button profileButton;
    private Button aboutButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alepha_main);

        startButton= (Button) findViewById(R.id.start_button);
        startButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == startButton){
            Intent intent = new Intent(this, AlephbaStartActivity.class);
            startActivity(intent);
        }
    }
}
