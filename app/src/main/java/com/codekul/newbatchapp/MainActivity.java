package com.codekul.newbatchapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //child = parent -> compile time error

       // px = dp * dpi/160; sp

        final EditText edtUserName =
                (EditText) findViewById(R.id.edtUserName);

        final EditText edtPassword =
                (EditText) findViewById(R.id.edtPassword);

        final Button btnOkay =
                (Button) findViewById(R.id.btnOkay);
        //btnOkay.setOnClickListener(new Click());
        //btnOkay.setOnClickListener(this);
        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = edtUserName
                        .getText()
                        .toString();

                String password = edtPassword
                        .getText()
                        .toString();

                if(userName.equals("codekul") && password.equals("melayer")){

                    Log.i("@codekul","Login Success");
                }
                else {
                    Log.i("@codekul","Login Failure");
                }
            }
        });
    }

    private final void createUiUsingCode(){

        ViewGroup.LayoutParams paramsRoot =
                new ViewGroup.LayoutParams(500,500);
        LinearLayout layoutRoot =
                new LinearLayout(this);
        layoutRoot.setLayoutParams(paramsRoot);
        layoutRoot.setOrientation(LinearLayout.VERTICAL);

        ViewGroup.LayoutParams paramsUserName =
                new ViewGroup.LayoutParams(500,150); // width and height are must
        EditText edtUserName =
                new EditText(this); // this -> context is must
        edtUserName.setLayoutParams(paramsUserName);
        layoutRoot.addView(edtUserName); // add to child tp layout

        ViewGroup.LayoutParams paramsBtn =
                new ViewGroup.LayoutParams(500,150);
        Button btnOkay =
                new Button(this);
        btnOkay.setText("Okay");
        btnOkay.setLayoutParams(paramsBtn);
        layoutRoot.addView(btnOkay);

        setContentView(layoutRoot);
    }

    @Override
    public void onClick(View v) {

    }

    private final class Click implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}
