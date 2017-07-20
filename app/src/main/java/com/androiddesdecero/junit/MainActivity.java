package com.androiddesdecero.junit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mResultado;
    private EditText mNumero1;
    private EditText mNumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        mResultado = (TextView)findViewById(R.id.tvResultado);
        mNumero1 = (EditText)findViewById(R.id.edNumero1);
        mNumero2 = (EditText)findViewById(R.id.edNumero2);
    }
}
