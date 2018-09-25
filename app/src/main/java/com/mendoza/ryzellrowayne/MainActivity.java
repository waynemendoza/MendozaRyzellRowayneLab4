package com.mendoza.ryzellrowayne;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG","onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG","onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG","onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG","onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG","onRestart has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG","onDestroy has executed...");
    }

    public void showBack(View v){
        Toast.makeText(this,"It's more fun in the Philippines!", Toast.LENGTH_LONG).show();


    }
    public void showNext(View v){
        Snackbar.make(v, "It's more fun in the Philippines!", Snackbar.LENGTH_LONG).show();
    }

}
