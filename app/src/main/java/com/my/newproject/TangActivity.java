package com.my.newproject;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.media.SoundPool;
import android.view.View;

public class TangActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView win2;
	private TextView textview1;
	private LinearLayout linear5;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	private ImageView imageview4;
	private TextView textview6;
	private ImageView imageview5;
	private TextView textview26;
	private ImageView imageview6;
	private TextView textview28;
	private ImageView imageview7;
	private TextView textview27;
	private ImageView imageview8;
	private TextView textview43;
	private TextView textview25;
	private ImageView imageview9;
	private TextView textview24;
	private ImageView imageview10;
	private TextView textview21;
	private ImageView imageview11;
	private TextView textview23;
	private ImageView imageview12;
	private TextView textview22;
	private ImageView imageview13;
	private TextView textview20;
	private ImageView imageview14;
	private TextView textview19;
	private ImageView imageview15;
	private TextView textview46;
	private TextView textview18;
	private ImageView imageview16;
	private TextView textview17;
	private ImageView imageview17;
	private TextView textview7;
	private ImageView imageview18;
	private TextView textview16;
	private ImageView imageview19;
	private TextView textview8;
	private ImageView imageview20;
	private TextView textview44;
	private TextView textview9;
	private ImageView imageview21;
	private TextView textview10;
	private ImageView imageview22;
	private TextView textview11;
	private ImageView imageview23;
	private TextView textview12;
	private ImageView imageview24;
	private TextView textview13;
	private ImageView imageview25;
	private TextView textview14;
	private ImageView imageview26;
	private TextView textview45;
	private TextView textview15;
	private Button button5;
	
	private Intent arvbl = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tang);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		win2 = (ScrollView) findViewById(R.id.win2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview15 = (TextView) findViewById(R.id.textview15);
		button5 = (Button) findViewById(R.id.button5);
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				arvbl.setClass(getApplicationContext(), ArcblendActivity.class);
				startActivity(arvbl);
			}
		});
	}
	private void initializeLogic() {
		click = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		s1 = click.load(getApplicationContext(), R.raw.click, 1);
		textview26.setText("2. Tangent External to Two Equal circles:\n\nExample 2: Two  circles each of diameter 40 mm have a distance of 100mm between their centers. Draw a tangent to touch them externally. \nOf course the first thing to do is draw the two circles. I'm not including this as a step. Draw a straight line and mark two points A&B 100mm apart. At points A&B draw circles of 20 mm radius.");
		textview25.setText("3. Internal Tangent to 2 Equal circles:\n\n Okay, let's go there. \nExample 3: Draw a tangent to touch 2 circles A&B internally. The circles have radii of 25 mm and a distance of 120 mm between the centers. \n\nDraw the circles with centers A & A'");
		textview18.setText("Now, we venture into the world of unequal circles. Fasten your seatbelts people! I have two examples for you... \n\n\n4. External Tangent to Two unequal circles :\n\nExample 4: Two shafts of diameter 70mm and 30mm are connected by a direct belt. Show this arrangement, if they have a distance of 90mm between their centers. \n\nDraw the two circles with centers A and A'");
		textview9.setText("5. External Tangent to two Unequal Circles:\n\nExample 5: Two pulleys of diameter 70mm and 30mm are connected by a cross belt. Show this arrangement, if they have a distance of 90mm between their centers. \n\nFinally, we can breathe well after this... \n\nFirst of all, draw the two circles with centers A & A'. ");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
