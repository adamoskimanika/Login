package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity2 extends AppCompatActivity {
    // colocar no build gradle em dependences
   // implementation 'com.github.bumptech.glide:glide:4.12.0'
    //annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    //depois File >> Sync Gradle
    private ImageView gif;
    private static final long DELAY_MILLISECONDS = 3000; // 3 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gif = findViewById(R.id.imageView3);
        Glide.with(this)
                .asGif()
                .load(R.raw.frog2)
                .diskCacheStrategy(DiskCacheStrategy.NONE)//não armazena
                .into(gif);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
                finish();
            }
        }, DELAY_MILLISECONDS);
    }
}