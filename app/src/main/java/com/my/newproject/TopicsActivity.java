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
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.media.SoundPool;
import android.view.View;
import android.graphics.Typeface;

public class TopicsActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private Button imp_basics;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private TextView textview2;
	private TextView textview1;
	
	private Intent basics = new Intent();
	private Intent scales = new Intent();
	private Intent crank = new Intent();
	private Intent loci = new Intent();
	private Intent tangency = new Intent();
	private Intent geometry = new Intent();
	private SharedPreferences smooth1;
	private SharedPreferences smooth;
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.topics);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imp_basics = (Button) findViewById(R.id.imp_basics);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		smooth1 = getSharedPreferences("override", Activity.MODE_PRIVATE);
		smooth = getSharedPreferences("pass", Activity.MODE_PRIVATE);
		
		imp_basics.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				basics.setClass(getApplicationContext(), ImportantBasicsActivity.class);
				startActivity(basics);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					scales.setClass(getApplicationContext(), ScalesActivity.class);
					startActivity(scales);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						scales.setClass(getApplicationContext(), ScalesActivity.class);
						startActivity(scales);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Please upgrade to enjoy all features. ");
					}
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					geometry.setClass(getApplicationContext(), GeometricActivity.class);
					startActivity(geometry);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						geometry.setClass(getApplicationContext(), GeometricActivity.class);
						startActivity(geometry);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Please, purchase the pin code to unlock this feature.");
					}
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					tangency.setClass(getApplicationContext(), TangencyActivity.class);
					startActivity(tangency);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						tangency.setClass(getApplicationContext(), TangencyActivity.class);
						startActivity(tangency);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Lol, you've not paid Na.. Pay first then try again... 😂 ");
					}
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					loci.setClass(getApplicationContext(), LociActivity.class);
					startActivity(loci);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						loci.setClass(getApplicationContext(), LociActivity.class);
						startActivity(loci);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Feature is locked. Please purchase pin to unlock. ");
					}
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					crank.setClass(getApplicationContext(), CrankActivity.class);
					startActivity(crank);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						crank.setClass(getApplicationContext(), CrankActivity.class);
						startActivity(crank);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Purchase pin to unlock this feature");
					}
				}
			}
		});
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
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
