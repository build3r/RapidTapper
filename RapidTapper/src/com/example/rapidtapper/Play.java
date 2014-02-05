/**
 * 
 */
package com.example.rapidtapper;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Shabaz
 *
 */
public class Play extends Activity {
	TextView tx1,tx2;
    ImageButton b1,b2;
    int i=0,j=0;
    //GridLayout ll = new GridLayout(this);
    //Object ob=this;
	/** Called when the activity is first creatsed. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_play);
	    tx1=new TextView(this);
	    tx2=new TextView(this);
	  //  this.setRequestedOrientation(Play.SCREEN_ORIENTATION_LANDSCAPE);
	    b1=(ImageButton)findViewById(R.id.imageButton1);
	    b2=(ImageButton)findViewById(R.id.imageButton2);
	    //b2.setVisibility(View.GONE);
	    b2.setVisibility(View.VISIBLE);
	    b2.setBackgroundColor(Color.TRANSPARENT);
	     b1.setOnClickListener(new View.OnClickListener() {
	           @Override
	           public void onClick(View view) {
	        	   i++;
	        	   tx1.setText("Player1 clicked "+i);
	        	   Toast.makeText(Play.this,tx1.getText(), 
	                       Toast.LENGTH_SHORT).show();
	        	  //ll.addView(tx1);
	        	   // write your button click code here
	           }
	       });
	     b2.setOnClickListener(new View.OnClickListener() {
	           @Override
	           public void onClick(View view) {
	        	   j++;
	        	   tx2.setText("Player2 clicked "+j);
	        	   Toast.makeText(Play.this,tx2.getText(), 
	                       Toast.LENGTH_SHORT).show();
	        	   // write your button click code here
	           }
	       });
	    
	    // TODO Auto-generated method stub
	}
	public void OnClickListener()
	{
		i++;
		Toast.makeText(getApplicationContext(), "Command Sent"+i, Toast.LENGTH_SHORT).show();
	}
}
