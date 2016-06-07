package com.example.g13c1921.biomap;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loginSign();
            }
        }, 3000);


        /*Button btn = (Button) findViewById(R.id.login_to_biomap);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
            }
        }); */


    }

    void loginSign (){
        //setContentView(R.layout.activity_main22);
        Intent intent = new Intent(getApplicationContext(),Main22Activity.class);
        startActivity(intent);
    }



}
