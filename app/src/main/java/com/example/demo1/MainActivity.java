package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demolib.LibraryMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView1);
        int result = LibraryMain.add(5, 4);
        int result2 = LibraryMain.mul(5, 4);
        textView.setText(String.format("5+4 should be %d,\naaa5*4 should be %d",
                result, result2));
    }
}