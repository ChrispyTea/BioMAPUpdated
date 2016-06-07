package com.example.g13c1921.biomap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

public class DetailsActivity extends AppCompatActivity {
    //EXTRA_DETAIL
    // EXTRA_ID
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String nametxt = getIntent().getStringExtra(Main2Activity.EXTRA_DETAIL);
        String clientID = getIntent().getStringExtra(Main2Activity.EXTRA_ID);

        EditText nme = (EditText) findViewById(R.id.client_name);
        EditText cid = (EditText) findViewById(R.id.client_id);
        EditText dte = (EditText) findViewById(R.id.today_date);
        Button btn = (Button) findViewById(R.id.login_to_choose_project);

        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy");
        String dateString = sdf.format(date);
        dte.setText(dateString);


        nme.setText(nametxt);
        cid.setText(clientID);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //setContentView(R.layout.activity_login);
                Intent intent = new Intent(getApplicationContext(),NoEntryActivity.class);
                startActivity(intent);
            }
        });

    }
}
