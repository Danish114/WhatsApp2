package com.example.whatsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.whatsapp.R;

public class CmeraActivity extends AppCompatActivity {
    private ImageView imgv1;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmera);
        imgv1 = (ImageView) findViewById(R.id.imgv1);
        /*imgv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cemara = new Intent();
                Cemara.setType("phone/*");
                Cemara.setAction(Intent.ACTION_GET_CONTENT);
            }
        });
*/
    }
}


