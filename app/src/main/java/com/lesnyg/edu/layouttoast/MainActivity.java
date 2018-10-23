package com.lesnyg.edu.layouttoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickwidget(View view){
        Toast.makeText(view.getContext(),"Hello world",Toast.LENGTH_SHORT).show();
    }
}
