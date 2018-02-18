package com.tasyafauzia.android.tasyafauzia_1202154307_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String mSpinnerlabel = "";
    private EditText name;
    private Spinner nomeja;
    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        name = (EditText)findViewById(R.id.name);
        nomeja = (Spinner) findViewById(R.id.spinner);
        pesan= (Button) findViewById(R.id.pesan);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.meja, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (nomeja != null) {
            nomeja.setAdapter(adapter);

    }
}
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mSpinnerlabel = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void pilih(View view) {
        String spinner = nomeja.getSelectedItem().toString();
        String a = name.getText().toString();
        if(a.isEmpty() || spinner.isEmpty()){
            //membuat toast untuk tombol PilihPesanan jika di klik
            Toast.makeText(DineIn.this,"Fill in the blank",Toast.LENGTH_LONG).show();
        }else{
            //membuat intent untuk masuk ke menu selanjutnya
            Intent intent = new Intent(DineIn.this,ListMenu.class);
            startActivity(intent);
            //jika masuk ke intent menu selanjutnya akan keluar tulisan dibawah
            Toast.makeText(DineIn.this,"Please choose menu " + spinner,Toast.LENGTH_LONG).show();
        }
    }
}
