package ru.mirea.koldinma.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }


    public void onButtonClick(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №12 ГРУППА БСБО-01-20 символов - "+editText.length(),
                Toast.LENGTH_LONG);
        toast.show();
    }
}