package com.msh77.alephba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AlephbaUnitActivity extends AppCompatActivity {

    private int unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alephba_unit);
        unit = getIntent().getExtras().getInt("unit");
        String unitname = "unit"+unit;
        int unitid = getResources().getIdentifier(unitname, "array",getPackageName());
        String[] letters = getResources().getStringArray(unitid);

        TextView aText = (TextView) findViewById(R.id.unit_a_text);
        aText.setText(letters[0]);
        TextView bText = (TextView) findViewById(R.id.unit_b_text);
        bText.setText(letters[1]);
        TextView cText = (TextView) findViewById(R.id.unit_c_text);
        cText.setText(letters[2]);
        TextView dText = (TextView) findViewById(R.id.unit_d_text);
        dText.setText(letters[3]);


    }
}
