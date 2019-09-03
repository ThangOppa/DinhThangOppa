package com.example.qlsv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SinhvienForm extends AppCompatActivity {
    Button btnThoatSV,btnXoaSV,btnThemSV;
    EditText txtHoTen,txtNoiSinh,txtDanToc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhvien_form);
        txtHoTen = (EditText) findViewById(R.id.txtTenLop);
        txtNoiSinh = (EditText) findViewById(R.id.txtNoiSinh);
        txtDanToc = (EditText) findViewById(R.id.txtDanToc);
        Button btnThoatSV = (Button) findViewById(R.id.btnThoatLop);
        btnThoatSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnXoaSV = (Button) findViewById(R.id.btnXoaLop);
        btnXoaSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHoTen.setText("");
                txtNoiSinh.setText("");
                txtDanToc.setText("");
            }
        });
    }
}
