package com.example.posttest.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.posttest.R;

public class KalkulatorActivity extends AppCompatActivity {
    EditText angka_pertama,angka_kedua;
    Button tambah,kurang,bagi,kali,bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka_pertama=findViewById(R.id.angka_pertama);
        angka_kedua=findViewById(R.id.angka_kedua);
        tambah=findViewById(R.id.tambah);
        kurang=findViewById(R.id.kurang);
        bagi=findViewById(R.id.bagi);
        kali=findViewById(R.id.kali);
        hasil=findViewById(R.id.hasil);
    }

    public void tambah(View view) {
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
            double angka1=Double.parseDouble(angka_pertama.getText().toString());
            double angka2=Double.parseDouble(angka_kedua.getText().toString());
            double result=angka1+angka2;
            hasil.setText(Double.toString(result));
        }
        else {
            Toast toast=Toast.makeText(KalkulatorActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void kurang(View view) {
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
            double angka1=Double.parseDouble(angka_pertama.getText().toString());
            double angka2=Double.parseDouble(angka_kedua.getText().toString());
            double result=angka1-angka2;
            hasil.setText(Double.toString(result));
        }
        else {
            Toast toast=Toast.makeText(KalkulatorActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void kali(View view) {
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
            double angka1=Double.parseDouble(angka_pertama.getText().toString());
            double angka2=Double.parseDouble(angka_kedua.getText().toString());
            double result=angka1*angka2;
            hasil.setText(Double.toString(result));
        }
        else {
            Toast toast=Toast.makeText(KalkulatorActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void bagi(View view) {
        if((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
            double angka1=Double.parseDouble(angka_pertama.getText().toString());
            double angka2=Double.parseDouble(angka_kedua.getText().toString());
            double result=angka1/angka2;
            hasil.setText(Double.toString(result));
        }
        else {
            Toast toast=Toast.makeText(KalkulatorActivity.this, "Mohon Masukkan Angka Pertama dan Kedua", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void bersihkan(View view) {
        angka_pertama.setText("");
        angka_kedua.setText("");
        hasil.setText("");
        angka_pertama.requestFocus();
    }


}
