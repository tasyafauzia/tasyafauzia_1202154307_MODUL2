package com.tasyafauzia.android.tasyafauzia_1202154307_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgroup;
    private RadioButton r1, r2;
    private Button btnpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgroup = (RadioGroup)findViewById(R.id.radiogroup);
        r1 = (RadioButton)findViewById(R.id.dinein);
        r2 = (RadioButton)findViewById(R.id.takeaway);
        btnpesan = (Button)findViewById(R.id.pesan);

        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedItem = rgroup.getCheckedRadioButtonId();

                //membuat if else jika radio button di klik untuk tulisan dine in atau take away
                if (selectedItem == r1.getId()) {
                    Intent intent = new Intent(MainActivity.this, DineIn.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "You Choose Dine In", Toast.LENGTH_SHORT).show();
                }else if (selectedItem == r2.getId()){
                    Intent intent2 = new Intent(MainActivity.this,TakeAway.class);
                    startActivity(intent2);
                    Toast.makeText(MainActivity.this, "You Choose Take Away", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}