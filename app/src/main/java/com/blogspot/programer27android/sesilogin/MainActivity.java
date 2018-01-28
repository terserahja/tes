package com.blogspot.programer27android.sesilogin;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextInputEditText edtemail,edtpasword;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtemail= (TextInputEditText) findViewById(R.id.edtmail);
        edtpasword= (TextInputEditText) findViewById(R.id.edtpassword);
        btn= (Button) findViewById(R.id.btnlogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
