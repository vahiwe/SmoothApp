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
import android.widget.HorizontalScrollView;
import android.graphics.Typeface;

public class VipActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll2;
	private TextView header;
	private LinearLayout linear6;
	private TextView textview3;
	private TextView textview4;
	private ImageView imageview2;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private ImageView imageview3;
	private ImageView imageview4;
	private TextView textview9;
	private TextView textview10;
	private TextView textview15;
	private TextView textview14;
	private TextView textview11;
	private ImageView imageview16;
	private TextView textview23;
	private TextView textview24;
	private ImageView imageview15;
	private TextView textview20;
	private TextView textview22;
	private TextView textview21;
	private ImageView imageview14;
	private ImageView imageview13;
	private TextView textview19;
	private ImageView imageview5;
	private TextView textview18;
	private TextView textview17;
	private TextView textview16;
	private TextView textview25;
	private HorizontalScrollView hscroll1;
	private ImageView imageview17;
	private LinearLayout linear7;
	private ImageView imageview18;
	private ImageView imageview19;
	private ImageView imageview24;
	private ImageView imageview23;
	private ImageView imageview22;
	private ImageView imageview21;
	private ImageView imageview20;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.vip);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		header = (TextView) findViewById(R.id.header);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview25 = (TextView) findViewById(R.id.textview25);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
	}
	private void initializeLogic() {
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
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
