package ru.mirea.koldinma.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String tag = MainActivity.class.getSimpleName();
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        String text = (String) getIntent().getSerializableExtra("key");
        textView.setText(text);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"OnStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(tag,"onRestoreInstanceState");
        //String s = savedInstanceState.getString("data_value");
        //editText.setText(s);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d(tag,"onPostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"OnResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(tag,"OnPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(tag,"OnAttachedToWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"OnPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //outState.putString("data_value",editText.getText().toString());
        Log.d(tag,"onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"OnDestroy");

    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(tag,"onDetachedFromWindow");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"onRestart");
    }
}