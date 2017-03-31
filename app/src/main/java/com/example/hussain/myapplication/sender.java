package com.example.hussain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.StringTokenizer;

public class sender extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent iin= getIntent();

        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("br");

           StringTokenizer st=new StringTokenizer(j,"name");
          String name=st.nextToken();
            Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();
        }

    }

}
