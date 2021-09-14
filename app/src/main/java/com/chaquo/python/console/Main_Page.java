package com.chaquo.python.console;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Page extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  Hide the Status Bar
        //   getWindow();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide manu bar
        setContentView(R.layout.main_page);
        //#############################################################


        Button btnuser = (Button) findViewById(R.id.btnMachine);
        Button btnMachine = (Button) findViewById(R.id.btnUser);
        final MediaPlayer buttonSound =  MediaPlayer.create(this, R.raw.button);




        btnuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                showUserGuess(view);
            }
        });

        btnMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                showMachineGuess(view);
            }
        });
        Button btnhelp = (Button) findViewById(R.id.btnHelpmain);
        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonSound.start();
                help(v);
            }
        });
}


 public void showUserGuess (View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void showMachineGuess (View v)
    {
        Intent intent = new Intent(this, machineGuessing.class);
        startActivity(intent);
    }
    public void help(View v)
    {
        Intent intent = new Intent(this, helpsection.class);
        startActivity(intent);
    }
}

