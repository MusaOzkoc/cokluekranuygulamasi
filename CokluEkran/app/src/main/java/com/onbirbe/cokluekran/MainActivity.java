package com.onbirbe.cokluekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText_name;
String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_name=findViewById(R.id.edit_name);
    }
    public void Change(View view){
        userName=editText_name.getText().toString();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("userEdit",userName);//userEdit ismiyle userName Gönderildi.
        startActivity(intent);
    }
}