package com.example.g13c1921.biomap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    public final static String EXTRA_DETAIL = "com.example.g13c1921.biomap.EXTRA_DETAIL";
    public final static String EXTRA_ID = "com.example.g13c1921.biomap.EXTRA_ID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button) findViewById(R.id.login_to_details_screen);
        final EditText name = (EditText) findViewById(R.id.client_name);
        final EditText clientID  = (EditText) findViewById(R.id.client_id);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
                intent.putExtra(EXTRA_DETAIL, name.getText().toString());
                intent.putExtra(EXTRA_ID, clientID.getText().toString());
                startActivity(intent);
            }
        });
    }
}
