package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Intent intent = this.getIntent();
        String Str = intent.getStringExtra("Str");
        if(Str != null){
            textView.setText("B頁面輸入文字:"+Str);
        }
    }

    public void Aswitch(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName2);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Str",editText.getText().toString());
        startActivity(intent);
        MainActivity.this.finish();
    }
}