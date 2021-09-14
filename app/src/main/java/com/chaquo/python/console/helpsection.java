package com.chaquo.python.console;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class helpsection extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          //Remove Manubar
   //     requestWindowFeature(getWindow().FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //####################################
        setContentView(R.layout.activity_helpsection);


        final MediaPlayer buttonSound =  MediaPlayer.create(this, R.raw.button);
        Button buttoncontact= (Button) findViewById(R.id.buttoncontact);
        buttoncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                openactivity_contactus();
            }
        });

    }
    public void openactivity_contactus()
    {
        Intent intent =new Intent(this, contactus.class);
        startActivity(intent);
    }
}