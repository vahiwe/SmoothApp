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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class UpgradeActivity extends AppCompatActivity {
	
	
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout win1;
	private Button button4;
	private LinearLayout win2;
	private Button button5;
	private LinearLayout win3;
	private Button button6;
	
	private Intent main = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.upgrade);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		win1 = (LinearLayout) findViewById(R.id.win1);
		button4 = (Button) findViewById(R.id.button4);
		win2 = (LinearLayout) findViewById(R.id.win2);
		button5 = (Button) findViewById(R.id.button5);
		win3 = (LinearLayout) findViewById(R.id.win3);
		button6 = (Button) findViewById(R.id.button6);
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				win2.setVisibility(View.VISIBLE);
				win3.setVisibility(View.GONE);
				win1.setVisibility(View.GONE);
				button4.setVisibility(View.GONE);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				win3.setVisibility(View.VISIBLE);
				win1.setVisibility(View.GONE);
				win2.setVisibility(View.GONE);
				button5.setVisibility(View.GONE);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				main.setClass(getApplicationContext(), MainActivity.class);
				main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(main);
			}
		});
	}
	private void initializeLogic() {
		win1.setVisibility(View.VISIBLE);
		win2.setVisibility(View.GONE);
		win3.setVisibility(View.GONE);
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
