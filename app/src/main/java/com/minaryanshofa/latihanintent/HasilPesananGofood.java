package com.minaryanshofa.latihanintent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HasilPesananGofood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesan_gofood);
        TextView nama = (TextView) findViewById(R.id.nama_pelanggan);
        TextView alamat = (TextView) findViewById(R.id.alamat_pelanggan);
        TextView pesan = (TextView) findViewById(R.id.pesanan);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nama");
        String alamat_palanggan = bundle.getString("alamat");
        String pesanan = bundle.getString("pesan");
        nama.setText(name);
        alamat.setText(alamat_palanggan);
        pesan.setText(pesanan);
        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HasilPesananGofood.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
