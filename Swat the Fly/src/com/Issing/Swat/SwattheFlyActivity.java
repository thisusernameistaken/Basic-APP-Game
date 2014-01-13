package com.Issing.Swat;

import com.Issing.Swat.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;


public class SwattheFlyActivity extends Activity implements OnTouchListener {
    
	 Button btn1;
	 Button btn2;
	 Button btn3;
	 Button btnBack;
	
	 
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        SetLayout();
        
       
    }
    public void SetLayout(){
    	setContentView(R.layout.main); 
       btn1=(Button) findViewById(R.id.btn1);
       btn1.setOnTouchListener(this);
       btn2=(Button) findViewById(R.id.btn2);
       btn2.setOnTouchListener(this);
       btn3=(Button) findViewById(R.id.btn3);
       btn3.setOnTouchListener(this);
       
       }
       
    
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (v.getId()== R.id.btn1){
			setContentView(new GameView(this));
		}
		if (v.getId()== R.id.btn2){
			
		}
		if (v.getId()== R.id.btn3){
			setContentView(R.layout.about);
			btnBack=(Button) findViewById(R.id.btnBack);
			btnBack.setOnTouchListener(this);
		}
		if (v.getId()== R.id.btnBack){
			SetLayout();
		}
		return true;
	}
}