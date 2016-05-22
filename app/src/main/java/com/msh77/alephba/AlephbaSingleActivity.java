package com.msh77.alephba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AlephbaSingleActivity extends AppCompatActivity implements View.OnClickListener{
    private Button[] unitButton = new Button[8];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alephba_single);

        LinearLayout layout = (LinearLayout) findViewById(R.id.singleLayout);
        for(int i=0; i< unitButton.length;i++){
            unitButton[i] = new Button(this);
            unitButton[i].setText(getString(R.string.unit)+" "+(i+1));
            unitButton[i].setOnClickListener(this);
            layout.addView(unitButton[i]);
        }
    }

    @Override
    public void onClick(View v){
        for( int i = 0;i<unitButton.length;i++){
            if(unitButton[i] == (Button) v){
                Intent intent = new Intent(this,AlephbaUnitActivity.class);
                intent.putExtra("unit",i+1);
                startActivity(intent);
            }
        }
    }
}
