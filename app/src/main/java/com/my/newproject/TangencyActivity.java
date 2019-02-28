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
import android.graphics.Typeface;

public class TangencyActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView win1;
	private TextView header;
	private LinearLayout linear6;
	private TextView textview1;
	private ImageView imageview1;
	private TextView textview2;
	private ImageView imageview2;
	private TextView textview3;
	private Button button1;
	private Button button2;
	
	private Intent tang = new Intent();
	private Intent arcblend = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tangency);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		win1 = (ScrollView) findViewById(R.id.win1);
		header = (TextView) findViewById(R.id.header);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				tang.setClass(getApplicationContext(), TangActivity.class);
				startActivity(tang);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				arcblend.setClass(getApplicationContext(), ArcblendActivity.class);
				startActivity(arcblend);
			}
		});
	}
	private void initializeLogic() {
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		textview1.setText("\nThis is one of my  favorite topics. This topic is all about arcs or lines touching other circles or other arcs,  or other lines. Before we get started, I'mma let y'all know what these are:\n\n First of all, what's a line? A line, you already know, is the shortest distance between two points. It's straight, no Bends.\n\nWhat's an arc? for any line to be called an arc, it must be a part of the circumference of a circle");
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
