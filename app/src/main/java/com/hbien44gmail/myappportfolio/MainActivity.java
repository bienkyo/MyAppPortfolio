package com.hbien44gmail.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        String toastMessage = "This button will launch " + ((Button)view).getText();
        Toast.makeText(MainActivity.this,toastMessage,Toast.LENGTH_SHORT).show();
    }
}
