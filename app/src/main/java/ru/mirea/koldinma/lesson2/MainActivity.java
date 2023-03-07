package ru.mirea.koldinma.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x = 2;
        int y = 4;
        int z = x+y;
        setContentView(R.layout.activity_main);

    }


}