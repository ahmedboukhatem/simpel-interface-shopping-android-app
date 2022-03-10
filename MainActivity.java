package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
	MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);


        image1 = (ImageView)findViewById(R.id.imageView1) ;
        image2 = (ImageView)findViewById(R.id.imageView2) ;
        image3 = (ImageView)findViewById(R.id.imageView3) ;
        image4 = (ImageView)findViewById(R.id.imageView4) ;
        image5 = (ImageView)findViewById(R.id.imageView5) ;

        Animation animate = AnimationUtils.loadAnimation(this, R.anim.bounce);

        image1.startAnimation(animate);
        image2.startAnimation(animate);
        image3.startAnimation(animate);
        image4.startAnimation(animate);



        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"50000",Toast.LENGTH_LONG).show();
            }
        });


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"65200",Toast.LENGTH_LONG).show();
            }
        });


        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"76500",Toast.LENGTH_LONG).show();
            }
        });


        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"40000",Toast.LENGTH_LONG).show();
            }
        });


        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"76500",Toast.LENGTH_LONG).show();
            }
        });
		

        image1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image", "image1");
                intent.putExtra("PrixAvec","50000");
                intent.putExtra("PrixSans","45000");
                intent.putExtra("description","pc nemero 01");
                intent.putExtra("lien","<a href='https://www.condor.com'>https://www.condor.com</a>");

                startActivity(intent);
                return true;
            }
        });
		
		
		 image2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image", "image2");
                intent.putExtra("PrixAvec","65200");
                intent.putExtra("PrixSans","50000");
                intent.putExtra("description","pc nemero 02");
                intent.putExtra("lien","<a href='https://www.condor.com'>https://www.condor.com</a>");

                startActivity(intent);
                return true;
            }
        });
		
		
		
		 image3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image", "image3");
                intent.putExtra("PrixAvec","76500");
                intent.putExtra("PrixSans","60000");
                intent.putExtra("description","pc nemero 03");
                intent.putExtra("lien","<a href='https://www.condor.com'>https://www.condor.com</a>");

                startActivity(intent);
                return true;
            }
        });
		
		
		
		 image4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image", "image4");
                intent.putExtra("PrixAvec","40000");
                intent.putExtra("PrixSans","35000");
                intent.putExtra("description","pc nemero 04");
                intent.putExtra("lien","<a href='https://www.condor.com'>https://www.condor.com</a>");

                startActivity(intent);
                return true;
            }
        });
		
		
		
		 image5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image", "image5");
                intent.putExtra("PrixAvec","76500");
                intent.putExtra("PrixSans","60000");
                intent.putExtra("description","pc nemero 05");
                intent.putExtra("lien","<a href='https://www.condor.com'>https://www.condor.com</a>");

                startActivity(intent);
                return true;
            }
        });


    }
	
	
	 @Override
        public void onStart() {

            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            super.onStart();


        }

        @Override
        public void onStop() {

            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
            super.onStop();

        }
		
		
	
	 @Override
    protected void onSaveInstanceState(@NonNull Bundle etat) {
        super.onSaveInstanceState(etat);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedState) {
        super.onRestoreInstanceState(savedState);

    }
	
	
	
}