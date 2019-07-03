package com.example.lujaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_example);
        Toast.makeText(this, "onCreate toast action:- Hello Everyone.", Toast.LENGTH_SHORT).show();
        OnClickButtonListener();
    }

    public void OnClickButtonListener() {
        btn_done = (Button) findViewById(R.id.TestExampleProfileDone);
        btn_done.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.lujaapp.ui.login.LoginActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart text: Welcome to my app", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart text: This text remains i the restart action of the app", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume text: Hello Welcome back to your paused app", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop text: This is stopped state text", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy text: Thank you for using our app. see you soon!!", Toast.LENGTH_LONG).show();
    }

}
