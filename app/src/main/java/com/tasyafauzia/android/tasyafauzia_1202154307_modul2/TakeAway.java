package com.tasyafauzia.android.tasyafauzia_1202154307_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tasyafauzia.android.tasyafauzia_1202154307_modul2.ListMenu;

public class TakeAway extends AppCompatActivity {
    private EditText name, phone, alamat, catatan;
    private Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        alamat = (EditText)findViewById(R.id.address);
        catatan = (EditText)findViewById(R.id.note);
        pilih = (Button)findViewById(R.id.Pilih);

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                String b = phone.getText().toString();
                String c = alamat.getText().toString();
                String d = catatan.getText().toString();

                //jika data kosong maka keluar toast berikut
                if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()){
                    Toast.makeText(TakeAway.this,"Isi Data dengan Lengkap", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(TakeAway.this,TakeAway.class);
                    startActivity(intent);
                    // jika telah diisi datanya maka akan ke screen selanjutnya
                }else{
                    Toast.makeText(TakeAway.this,"Silahkan Pilih Menu", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(TakeAway.this,ListMenu.class);
                    startActivity(intent2);
                }
            }
        });

    }
}
