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

public class BasicsActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView window2;
	private TextView textview1;
	private LinearLayout linear5;
	private TextView textview19;
	private ImageView imageview16;
	private TextView textview20;
	private ImageView imageview17;
	private TextView textview50;
	private TextView textview21;
	private ImageView imageview18;
	private TextView textview22;
	private ImageView imageview19;
	private TextView textview23;
	private ImageView imageview20;
	private TextView textview24;
	private ImageView imageview47;
	private ImageView imageview21;
	private TextView textview25;
	private ImageView imageview22;
	private TextView textview26;
	private ImageView imageview23;
	private TextView textview49;
	private ImageView imageview24;
	private TextView textview48;
	private ImageView imageview25;
	private ImageView imageview48;
	private TextView textview46;
	private ImageView imageview26;
	private TextView textview47;
	private ImageView imageview27;
	private TextView textview51;
	private TextView textview45;
	private ImageView imageview28;
	private TextView textview44;
	private ImageView imageview29;
	private TextView textview43;
	private ImageView imageview30;
	private TextView textview42;
	private ImageView imageview31;
	private TextView textview32;
	private ImageView imageview32;
	private TextView textview41;
	private ImageView imageview33;
	private TextView textview40;
	private ImageView imageview34;
	private TextView textview39;
	private ImageView imageview35;
	private TextView textview38;
	private ImageView imageview36;
	private TextView textview37;
	private ImageView imageview37;
	private TextView textview52;
	private TextView textview36;
	private ImageView imageview38;
	private TextView textview34;
	private ImageView imageview39;
	private TextView textview35;
	private ImageView imageview40;
	private TextView textview33;
	private ImageView imageview41;
	private TextView textview53;
	private TextView textview27;
	private ImageView imageview42;
	private TextView textview28;
	private ImageView imageview43;
	private TextView textview29;
	private ImageView imageview44;
	private TextView textview30;
	private ImageView imageview45;
	private TextView textview31;
	private ImageView imageview46;
	private TextView textview54;
	private TextView textview55;
	private ImageView imageview50;
	private TextView textview56;
	private ImageView imageview51;
	private Button button6;
	
	private Intent drawing = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.basics);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		window2 = (ScrollView) findViewById(R.id.window2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview47 = (ImageView) findViewById(R.id.imageview47);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview49 = (TextView) findViewById(R.id.textview49);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview48 = (TextView) findViewById(R.id.textview48);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		imageview48 = (ImageView) findViewById(R.id.imageview48);
		textview46 = (TextView) findViewById(R.id.textview46);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		textview47 = (TextView) findViewById(R.id.textview47);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview45 = (TextView) findViewById(R.id.textview45);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		textview44 = (TextView) findViewById(R.id.textview44);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		textview43 = (TextView) findViewById(R.id.textview43);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		textview42 = (TextView) findViewById(R.id.textview42);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview33 = (ImageView) findViewById(R.id.imageview33);
		textview40 = (TextView) findViewById(R.id.textview40);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		textview39 = (TextView) findViewById(R.id.textview39);
		imageview35 = (ImageView) findViewById(R.id.imageview35);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview36 = (ImageView) findViewById(R.id.imageview36);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview37 = (ImageView) findViewById(R.id.imageview37);
		textview52 = (TextView) findViewById(R.id.textview52);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview38 = (ImageView) findViewById(R.id.imageview38);
		textview34 = (TextView) findViewById(R.id.textview34);
		imageview39 = (ImageView) findViewById(R.id.imageview39);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview40 = (ImageView) findViewById(R.id.imageview40);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview41 = (ImageView) findViewById(R.id.imageview41);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview42 = (ImageView) findViewById(R.id.imageview42);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview43 = (ImageView) findViewById(R.id.imageview43);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview44 = (ImageView) findViewById(R.id.imageview44);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview45 = (ImageView) findViewById(R.id.imageview45);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview46 = (ImageView) findViewById(R.id.imageview46);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview55 = (TextView) findViewById(R.id.textview55);
		imageview50 = (ImageView) findViewById(R.id.imageview50);
		textview56 = (TextView) findViewById(R.id.textview56);
		imageview51 = (ImageView) findViewById(R.id.imageview51);
		button6 = (Button) findViewById(R.id.button6);
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				drawing.setClass(getApplicationContext(), DrawingActivity.class);
				startActivity(drawing);
			}
		});
	}
	private void initializeLogic() {
		textview19.setText("The first and most important thing you should know about is Lines. You'll be making use of lines through out your short ENG 103 life, as a matter of fact, everything you draw is made of some kind of line. \nSo, below are some types of lines that exist and also where and why they are used :\n");
		textview20.setText("1. Thick lines: These are used as Visible Outlines. Whenever your lecturer asks you to construct something... The main parts of the object are drawn using thick lines... Let's take a cube for example... You can see the thick lines in the diagram. \n\n2. Thin lines: These are used as Construction lines, Projection lines.\nThese are the lines that helped you to achieve the final work. It's very important to show them... In Maths, it's called \"Show your working\"...thats what these lines serve as here.  They are your \"working\". You can see these in the cube below. \n\n3.  Broken lines: these lines are used as Hidden details, or Invisible outlines. Whenever you're asked to draw a detailed object... Some parts may not be visible from your view... These are the lines used to represent them in the diagram... You can see this in the cube below.\n\n4. Thin long-chain lines: these lines are used, when drawing circles or circular objects, to show the center. These are Center lines.\n\n5. Arrow-heads: these are used as Dimension lines. You can see this illustrated in the cube diagram. The dimensions are indicated with arrow-headed lines");
		click = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		s1 = click.load(getApplicationContext(), R.raw.click, 1);
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
