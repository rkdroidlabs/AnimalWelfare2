package com.rkdroidlabs.animalwelfare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    CardView cardobjective;
    CardView cardservices;
    CardView cardoffice;
    CardView cardactivity;
    CardView cardgallery;
    CardView cardcontact;
    CardView cardmessage1;
    CardView cardmessage2;
    CardView cardvisit;

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardobjective = (CardView) findViewById(R.id.cardobjective);
        cardobjective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentobjective = new Intent (getApplicationContext(), Objectives.class);
                startActivity(intentobjective);
            }
        });

        cardservices = (CardView) findViewById(R.id.cardservices);
        cardservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentservices = new Intent (getApplicationContext(), Service.class);
                startActivity(intentservices);
            }
        });

        cardoffice = (CardView) findViewById(R.id.cardoffice);
        cardoffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentoffice = new Intent (getApplicationContext(), Office.class);
                startActivity(intentoffice);
            }
        });

        cardactivity = (CardView) findViewById(R.id.cardactivity);
        cardactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentactivity = new Intent (getApplicationContext(), Activities.class);
                startActivity(intentactivity);
            }
        });

        cardgallery = (CardView) findViewById(R.id.cardgallery);
        cardgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgallery = new Intent (getApplicationContext(), Gallery.class);
                startActivity(intentgallery);
            }
        });

        cardcontact = (CardView) findViewById(R.id.cardcontact);
        cardcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcontact = new Intent (getApplicationContext(), Contact.class);
                startActivity(intentcontact);
            }
        });

        cardmessage1 = (CardView) findViewById(R.id.cardmessage1);
        cardmessage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmessage1 = new Intent (getApplicationContext(), Message.class);
                startActivity(intentmessage1);
            }
        });

        cardmessage2 = (CardView) findViewById(R.id.cardmessage2);
        cardmessage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmessage2 = new Intent (getApplicationContext(), Message2.class);
                startActivity(intentmessage2);
            }
        });

        cardvisit = (CardView) findViewById(R.id.cardvisit);
        cardvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentvisit = new Intent (Intent.ACTION_VIEW);
                intentvisit.setData(Uri.parse("geo:0,0?q= Karuna Animal Shelter, Veterinary College Campus, Hebbal, Bengaluru 560024"));
                startActivity(intentvisit);
            }
        });

        //Blinking Text

        TextView textView = findViewById(R.id.phone );
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(400); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(anim);

        //Image Flipper

        int images[] = {R.drawable.s1, R.drawable.h1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7};
        v_flipper = findViewById(R.id.v_flipper);

       /* for (int i=0; i <images.length; i++) {

            flipperImages(images[i]);
        }*/

        for (int image: images ) {
            flipperImages(image );
        }
        return;
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2500);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);






    }
}