package com.example.android.sandubamix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_montar(View view){
        Intent intent = new Intent(this, MontandoActivity.class);
        startActivity(intent);
    }

}
