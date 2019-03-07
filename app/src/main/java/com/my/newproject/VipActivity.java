package com.my.newproject;

import android.app.*;
import android.os.*;
import android.support.v7.widget.Toolbar;
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
	

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.activity_vip);
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
	}
	private void initializeLogic() {
//		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
	}
	
//	@Override
//	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
//		super.onActivityResult(_requestCode, _resultCode, _data);
//
//		switch (_requestCode) {
//
//			default:
//			break;
//		}
//	}
//
//	@Deprecated
//	public void showMessage(String _s) {
//		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
//	}
//
//	@Deprecated
//	public int getLocationX(View _v) {
//		int _location[] = new int[2];
//		_v.getLocationInWindow(_location);
//		return _location[0];
//	}
//
//	@Deprecated
//	public int getLocationY(View _v) {
//		int _location[] = new int[2];
//		_v.getLocationInWindow(_location);
//		return _location[1];
//	}
//
//	@Deprecated
//	public int getRandom(int _min, int _max) {
//		Random random = new Random();
//		return random.nextInt(_max - _min + 1) + _min;
//	}
//
//	@Deprecated
//	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
//		ArrayList<Double> _result = new ArrayList<Double>();
//		SparseBooleanArray _arr = _list.getCheckedItemPositions();
//		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
//			if (_arr.valueAt(_iIdx))
//			_result.add((double)_arr.keyAt(_iIdx));
//		}
//		return _result;
//	}
//
//	@Deprecated
//	public float getDip(int _input){
//		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
//	}
//
//	@Deprecated
//	public int getDisplayWidthPixels(){
//		return getResources().getDisplayMetrics().widthPixels;
//	}
//
//	@Deprecated
//	public int getDisplayHeightPixels(){
//		return getResources().getDisplayMetrics().heightPixels;
//	}
//
}
