package com.utilone.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActAlpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_alpha);

        Intent Main = getIntent();
        String Name2 = Main.getStringExtra("name");

        //Log.i("Alpha", "Nombre recibido: " + Name2);

        TextView tv = (TextView)findViewById(R.id.viewName);
        tv.setText(Name2);
    }

}
