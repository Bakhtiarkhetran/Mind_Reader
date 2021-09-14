package com.chaquo.python.console;

import android.app.*;

import com.chaquo.python.Python;
import com.chaquo.python.utils.*;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.Python;
import com.chaquo.python.utils.PythonConsoleActivity;

import android.app.*;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.file.Files;

public class machineGuessing extends PythonConsoleActivityM2 {
    @Override
    protected Class<? extends Task> getTaskClass() {
        return Task.class;
    }
    public static class Task extends PythonConsoleActivityM2.Task {
        public Task(Application app) {
            super(app);
        }
        @Override
        public void run() {
            {
                try {
                    py.getModule("Module_2").callAttr("Model2");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  Hide the Status Bar
        //   getWindow();
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //#############################################################

        //hide manu bar
        getSupportActionBar().hide();
        //EditText tvOutput= Files.find(R.id.tvOutput);

        // things go up when the keyboard shows up
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        final MediaPlayer buttonSound =  MediaPlayer.create(this, R.raw.button);
        Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSound.start();
                Home(v);
            }
        });



    }

    @Override
    public void onBackPressed() {
        finish();
        /*Intent intent = new Intent(this, Main_Page.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);*/
    }

    public void Home(View v) {
        finish();
         /* Intent intent = new Intent(this, Main_Page.class);
         startActivity(intent);
        Intent intent = new Intent(this, Main_Page.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);*/
    }

}
