package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView image1;
    TextView prix,Description;
    RadioGroup radiogroup;
    RadioButton radiobutton;
    String prix_sans_garantie,prix_avec_garantie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String image=intent.getStringExtra("image"),
                lien=intent.getStringExtra("lien"),
                description=intent.getStringExtra("description");
                prix_sans_garantie=intent.getStringExtra("PrixSans");
                prix_avec_garantie=intent.getStringExtra("PrixAvec");
				
				
		image1 = (ImageView)findViewById(R.id.imageView) ;
        
		if (image.equals("image1")) Image1.setImageResource(R.drawable.image1);
            else if (image.equals("image2")) Image1.setImageResource(R.drawable.image2);
                else if (image.equals("image3")) Image1.setImageResource(R.drawable.image3);
                    else if (image.equals("image4")) Image1.setImageResource(R.drawable.image4);
		
		
		
        
		
		
		DescriptionActivite.setText(description);
		
		LienActivite.setClickable(true);
        LienActivite.setMovementMethod(LinkMovementMethod.getInstance());
        LienActivite.setText(Html.fromHtml(lien));
		
	


    public void click(View view) {

       int radiobtn=radiogroup.getCheckedRadioButtonId();
        radiobutton=(RadioButton)findViewById(radiobtn);
        if (radiobutton.getText().toString().equals("sans garantie")) prix.setText(prix_sans_garantie);
        if (radiobutton.getText().toString().equals("avec garantie")) prix.setText(prix_avec_garantie);
		
    }
	
	
}