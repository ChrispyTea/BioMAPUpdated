package com.example.g13c1921.biomap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UploadSuccessfulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_successful);

        Button btn = (Button) findViewById(R.id.upload_new);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),NoEntryActivity.class);
                startActivity(intent);
            }
        });

    }
}
