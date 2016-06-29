package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnLogin =
                (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new Click());
    }

    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.btnLogin){

                Intent intent =
                        new Intent(/*context*/MainActivity.this,
                                /*typeInformation of target and not the bytecode file*/ProfileActiviity.class);

                startActivity(intent);

            }
        }
    }
}
