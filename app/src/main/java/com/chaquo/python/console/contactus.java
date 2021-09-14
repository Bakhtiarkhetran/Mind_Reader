package com.chaquo.python.console;

import android.os.Bundle;
import android.content.Intent;
import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class contactus extends AppCompatActivity {

    private EditText textMsg;
    private String Subject="N/A";
    private String Receipent;
    RadioGroup radioGroup;
    private  Button btnSend;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove Manubar
        getSupportActionBar().hide();
        //####################################
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        setContentView(R.layout.activity_contactus);

            radioGroup = findViewById(R.id.radioGroup1);
            btnSend=findViewById(R.id.btnSubmit);
            Receipent = "BakhtiarKhetran@gmail.com, Szargham3@gmail.com, fawadbutt62@gmail.com, nadeemhamza457@gmail.com";
            //Receipent = "BakhtiarKhetran@gmail.com";
            textMsg = findViewById(R.id.txtDesc);
            Button buttonSend = findViewById(R.id.btnSubmit);
            buttonSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkButton(v);
                    sendMail();
                }
            });
        }
        public void checkButton(View v)
        {
            int radioid = radioGroup.getCheckedRadioButtonId();
            radioButton=findViewById(radioid);
        }
        private void sendMail() {
            String recipientList = Receipent;
            String[] recipients = recipientList.split(",");
            String subject = radioButton.getText().toString();
            String message = textMsg.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, recipients);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, message);

            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an email client"));
        }
}