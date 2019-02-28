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
import android.graphics.Typeface;

public class LecturersActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView textview11;
	private ImageView imageview1;
	private TextView textview2;
	private TextView textview12;
	private ImageView imageview2;
	private TextView textview3;
	private TextView textview13;
	private ImageView imageview3;
	private TextView textview19;
	private TextView textview18;
	private ImageView imageview4;
	private TextView textview17;
	private TextView textview16;
	private ImageView imageview5;
	private TextView textview15;
	private TextView textview14;
	private ImageView imageview6;
	private TextView textview4;
	private TextView textview5;
	private ImageView imageview7;
	private TextView textview6;
	private TextView textview7;
	private ImageView imageview8;
	private TextView textview8;
	private TextView textview9;
	private ImageView imageview9;
	private TextView textview10;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.lecturers);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview10 = (TextView) findViewById(R.id.textview10);
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
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
