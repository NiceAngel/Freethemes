package com.example.duatp.basic;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageButton button1;
    ImageButton button2;
    BitmapDrawable Png;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView2= (ImageView)findViewById(R.id.imageView2);

        button1 = (ImageButton)findViewById(R.id.imageButton1);
        button2 = (ImageButton)findViewById(R.id.imageButton2);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                Png = (BitmapDrawable) imageView1.getDrawable();
                int PngWidth = Png.getIntrinsicWidth();
                int PngHeight = Png.getIntrinsicHeight();

                imageView2.setImageDrawable(Png);
                imageView2.getLayoutParams().width = PngWidth;
                imageView2.getLayoutParams().height = PngHeight;
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.VISIBLE);

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {

                Resources res = getResources();
                Png = (BitmapDrawable) imageView2.getDrawable();
                int PngWidth = Png.getIntrinsicWidth();
                int PngHeight = Png.getIntrinsicHeight();

                imageView1.setImageDrawable(Png);
                imageView1.getLayoutParams().width = PngWidth;
                imageView1.getLayoutParams().height = PngHeight;

                imageView2.setVisibility(View.INVISIBLE);
                imageView1.setVisibility(View.VISIBLE);

            }
        });

    }
}