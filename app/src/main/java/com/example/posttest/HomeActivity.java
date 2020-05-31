package com.example.posttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.posttest.ScreenShoot.ScreenShoot;
import com.example.posttest.UploadFile.UploadFile;
import com.example.posttest.com.example.posttest.inputNama.inputNama;
import com.example.posttest.crudMhs.crudActivity;
import com.example.posttest.kalkulator.KalkulatorActivity;
import com.example.posttest.uploadImage.UploadImage;

public class HomeActivity extends AppCompatActivity  {

    CardView cvInputNama,cvKalkulator,cvScreenShoot,cvCrudData,cvUploadGambar,
            cvUploadFile,cvExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cvInputNama=findViewById(R.id.cv_input_nama);
        cvKalkulator=findViewById(R.id.cv_kalkulator);
        cvScreenShoot=findViewById(R.id.cv_screen_shoot);
        cvCrudData=findViewById(R.id.cv_crud_data);
        cvUploadGambar=findViewById(R.id.cv_upload_gambar);
        cvUploadFile=findViewById(R.id.cv_upload_file);

    }


    public void inputNama(View view) {
        Intent intent=new Intent(HomeActivity.this, inputNama.class);
        startActivity(intent);
    }

    public void kalkulator(View view) {
        Intent intent=new Intent(HomeActivity.this, KalkulatorActivity.class);
        startActivity(intent);
    }

    public void ScreenShoot(View view) {
        Intent intent=new Intent(HomeActivity.this, ScreenShoot.class);
        startActivity(intent);
    }

    public void crud(View view) {
        Intent intent=new Intent(HomeActivity.this, crudActivity.class);
        startActivity(intent);
    }

    public void uploadImage(View view) {
        Intent intent=new Intent(HomeActivity.this, UploadImage.class);
        startActivity(intent);
    }

    public void UploadFile(View view) {
        Intent intent=new Intent(HomeActivity.this, UploadFile.class);
        startActivity(intent);
    }

}
