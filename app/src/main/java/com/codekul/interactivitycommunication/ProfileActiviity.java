package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActiviity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activiity);

        loadBundleData();

        initButtons();
    }


    private void changeImageSrc(int id){

        final ImageView imageView =
                (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(id);
    }

    private void loadBundleData(){

        Intent responsibleIntent =
                getIntent();

        Bundle bundle =
                responsibleIntent.getExtras();
        if(bundle != null){

            int imageId = bundle.getInt(MainActivity.KEY_IMG_ID);
            changeImageSrc(imageId);
        }
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

    private void initButtons(){

        final Button btnChange = (Button) findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeImageSrc();
            }
        });

        final Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentData =
                        new Intent();

                Bundle bundle =
                        new Bundle();
                bundle.putInt(MainActivity.KEY_IMG_ID,getImageSrc());

                intentData.putExtras(bundle);

                setResult(RESULT_OK,intentData);

                finish();
            }
        });
    }
}
