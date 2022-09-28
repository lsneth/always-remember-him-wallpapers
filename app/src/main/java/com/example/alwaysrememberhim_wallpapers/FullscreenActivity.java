package com.example.alwaysrememberhim_wallpapers;

import static android.widget.Toast.LENGTH_SHORT;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;

public class FullscreenActivity extends AppCompatActivity {
    ImageView imageView;
    Button setWallpaperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getApplicationContext());
        imageView = findViewById(R.id.imageView);
        setWallpaperButton = findViewById(R.id.setWallpaperButton);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource((imageAdapter.imageArray[position]));

        setWallpaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imageAdapter.imageArray[position]);
                try {
                    wallpaperManager.setBitmap(bitmap);
                    Toast.makeText(getApplicationContext(), "New Wallpaper Set", LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
