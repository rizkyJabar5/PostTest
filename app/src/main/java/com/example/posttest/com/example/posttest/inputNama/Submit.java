package com.example.posttest.com.example.posttest.inputNama;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.posttest.R;

public class Submit extends AppCompatActivity {
    TextView tvNama,tvInstitusi;

    final public static String EXTRA_NAMA="extra_nama";
    final public static String EXTRA_INSTITUSI="extra_institusi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        tvNama=findViewById(R.id.tv_nama);
        tvInstitusi=findViewById(R.id.tv_institusi);

        String nama=getIntent().getStringExtra(this.EXTRA_NAMA);
        String institusi=getIntent().getStringExtra(this.EXTRA_INSTITUSI);



        if (TextUtils.isEmpty(nama)){
            tvNama.setText("Nama : ");
        }else {
            tvNama.setText("Nama : " +nama);
        }

        if (TextUtils.isEmpty(institusi)){
            tvInstitusi.setText("Asal Institusi : ");
        }else {
            tvInstitusi.setText("Asal Institusi : " +institusi);
        }
    }

    public void kembali(View view) {
        Intent intent=new Intent(Submit.this, inputNama.class);
        startActivity(intent);
    }
}
