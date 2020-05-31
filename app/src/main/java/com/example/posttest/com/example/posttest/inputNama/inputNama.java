package com.example.posttest.com.example.posttest.inputNama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.posttest.R;

public class inputNama extends AppCompatActivity {
    EditText edNama, edInstitusi;
    Button btnPindahKalkulator, btnPindahData;

    public static final String EXTRA_NAMA = "extra_age";
    public static final String EXTRA_INSTITUSI = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);

        edNama = findViewById(R.id.ed_nama);
        edInstitusi = findViewById(R.id.ed_institusi);

        btnPindahData = findViewById(R.id.btn_pindah_data);

    }


    public void tampilkan(View view) {
        Intent i = new Intent(inputNama.this, Submit.class);
        i.putExtra(Submit.EXTRA_NAMA, edNama.getText().toString().trim());
        i.putExtra(Submit.EXTRA_INSTITUSI, edInstitusi.getText().toString().trim());
        startActivity(i);
    }
}


