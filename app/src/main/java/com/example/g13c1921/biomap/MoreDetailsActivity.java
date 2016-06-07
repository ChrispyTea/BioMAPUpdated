package com.example.g13c1921.biomap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        Button btnsubmit = (Button) findViewById(R.id.submit);
        Button btnsubmitlater = (Button) findViewById(R.id.submit_later);

        btnsubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),UploadSuccessfulActivity.class);
                startActivity(intent);
            }
        });

        btnsubmitlater.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),SaveForLaterActivity.class);
                startActivity(intent);
            }
        });

    }
}
