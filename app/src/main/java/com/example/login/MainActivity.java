package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //DEFININDO USUÁRIO E SENHA DEFAULT PARA TESTE
    private static final String CORRECT_USER = "admin";
    private static final String CORRECT_PASSWORD = "admin";
    //DEF OS EDT PARA USO POSTERIOR
    private EditText  edt_user;
    private EditText edt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_user = findViewById(R.id.editTextTextPersonName);
        edt_password = findViewById(R.id.editTextTextPassword);
        ImageView image = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edt_user.getText().toString();
                String senha =  edt_password.getText().toString();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                if (user.equals(CORRECT_USER)&& senha.equals(CORRECT_PASSWORD)){
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Dados inválidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}