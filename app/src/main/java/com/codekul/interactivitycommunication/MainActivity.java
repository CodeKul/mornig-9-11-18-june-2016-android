package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_IMG_ID = "imageId";
    private static final Integer REQUEST_PROFILE_ACT = 4563;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();

        changeImageSrc(R.drawable.analytics);
    }

    private void initButtons(){

        final Click click = new Click();

        final Button btnProfile =
                (Button) findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(click);

        final Button btnChange =
                (Button) findViewById(R.id.btnChange);
        btnChange.setOnClickListener(click);
    }

    private void changeImageSrc(int id){

        final ImageView imageView =
                (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(id);
    }

    private void changeImageSrc(){

        int []imgs = {
                R.drawable.analytics,
                R.drawable.circle,
                R.drawable.cpu,
                R.drawable.hands,
                R.drawable.my
        };

        int index = (int)(Math.random() * 5);

        final ImageView imageView =
                (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(imgs[index]);
        imageView.setTag(imgs[index]);
    }

    private int getImageSrc(){

        final ImageView imageView =
                (ImageView) findViewById(R.id.imageView);
        return (int) imageView.getTag();
    }

    private void fireNewActivityIntent(){

        Intent intent =
                new Intent(/*context*/MainActivity.this,
                                /*typeInformation of target and not the bytecode file*/ProfileActiviity.class);

        Bundle bundle =
                new Bundle();
        bundle.putInt(KEY_IMG_ID,getImageSrc());

        intent.putExtras(bundle);

        //startActivity(intent);

        startActivityForResult(intent,REQUEST_PROFILE_ACT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_PROFILE_ACT){

            if(resultCode == RESULT_OK){

                Bundle bundle = data.getExtras();
                int imageId = bundle.getInt(KEY_IMG_ID);
                changeImageSrc(imageId);
            }
        }
    }

    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.btnProfile){
                fireNewActivityIntent();
            }
            else {
              changeImageSrc();
            }
        }
    }
}
