package com.example.qlsv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSinhVien,btnLop,btnMonHoc,btnHocKy,btnDiemThi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSinhVien = (Button) findViewById(R.id.btnSinhVien);
        btnSinhVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SinhvienForm.class);
                startActivity(intent);
            }
        });
        btnLop = (Button) findViewById(R.id.btnLop);
        btnLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LopForm.class);
                startActivity(intent);
            }
        });
    }
}
