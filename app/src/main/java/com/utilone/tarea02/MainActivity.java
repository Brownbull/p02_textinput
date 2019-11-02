package com.utilone.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
    }

    public void goNext(View view) {

        String Name = editName.getText().toString();

        if(TextUtils.isEmpty(Name)){
            Toast.makeText(this, "Debe ingresar el Nombre", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this, ActAlpha.class);
            intent.putExtra("name", Name);
            startActivity(intent);
            finish();
        }
    }
}
