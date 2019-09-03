package com.example.qlsv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LopForm extends AppCompatActivity {
    Button btnThemLop,btnXoaLop,btnThoatLop;
    EditText txtMaLop,txtTenLop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lop_form);
        txtMaLop = (EditText) findViewById(R.id.txtMaLop);
        txtTenLop = (EditText) findViewById(R.id.txtTenLop);
        Button btnThoatLop = (Button) findViewById(R.id.btnThoatLop);
        btnThoatLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnXoaLop = (Button) findViewById(R.id.btnXoaLop);
        btnXoaLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMaLop.setText("");
                txtTenLop.setText("");
            }
        });
    }
}
