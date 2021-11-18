package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button) findViewById(R.id.button);
        EditText email = (EditText) findViewById(R.id.mail);
        EditText password = (EditText) findViewById(R.id.pass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("123") || password.getText().toString().equals("123")){
                    Intent sign = new Intent(Login.this, Main.class);
                    startActivity(sign);
                }
                else
                {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Login.this);
                    builder1.setMessage("Что-то пошло не так");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Окей",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

    }
}