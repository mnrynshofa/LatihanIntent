package com.minaryanshofa.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Gofood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gofood);
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText alamat = (EditText)findViewById(R.id.alamat);
        final EditText pesan = (EditText) findViewById(R.id.pesan);
        Button button = (Button) findViewById(R.id.order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Gofood.this, HasilPesananGofood.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());
                i.putExtra("pesan", pesan.getText().toString());
                startActivity(i);
            }
        });
    }
}
