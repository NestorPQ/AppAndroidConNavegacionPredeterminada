package com.codenestor.menuapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

   private static final long SPLASH_DURATION = 2000; // 2 segundos

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_splash);

      getSupportActionBar().hide();

      // Utiliza un Handler para retrasar el inicio de la actividad principal
      new Handler().postDelayed(() -> {
         Intent intent = new Intent(SplashActivity.this, MainActivity.class);
         startActivity(intent);
         finish();
      }, SPLASH_DURATION);
   }
}
