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

public class AssignCrankActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview42;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout win1;
	private LinearLayout linear5;
	private LinearLayout win2;
	private TextView tan1;
	private TextView textview6;
	private TextView textview7;
	private ImageView imageview1;
	private TextView textview8;
	private ImageView imageview22;
	private TextView textview10;
	private ImageView imageview2;
	private TextView textview29;
	private ImageView imageview3;
	private TextView textview32;
	private ImageView imageview23;
	private TextView textview31;
	private ImageView imageview6;
	private TextView textview30;
	private ImageView imageview4;
	private TextView textview26;
	private ImageView imageview5;
	private TextView textview28;
	private ImageView imageview24;
	private TextView textview27;
	private ImageView imageview7;
	private TextView textview20;
	private ImageView imageview8;
	private TextView textview25;
	private ImageView imageview9;
	private TextView textview24;
	private ImageView imageview10;
	private TextView textview23;
	private ImageView imageview13;
	private ImageView imageview11;
	private TextView textview22;
	private ImageView imageview12;
	private TextView textview41;
	private ImageView imageview25;
	private TextView textview21;
	private ImageView imageview14;
	private TextView textview19;
	private ImageView imageview15;
	private TextView textview18;
	private ImageView imageview16;
	private TextView textview17;
	private ImageView imageview17;
	private TextView textview16;
	private ImageView imageview18;
	private ImageView imageview26;
	private TextView textview15;
	private ImageView imageview19;
	private TextView textview13;
	private ImageView imageview20;
	private TextView textview14;
	private ImageView imageview21;
	private TextView textview12;
	private TextView textview43;
	private TextView textview44;
	private ImageView imageview28;
	private TextView textview46;
	private ImageView imageview29;
	private TextView textview45;
	private ImageView imageview30;
	private TextView loc1;
	private TextView textview5;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.assign_crank);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview42 = (TextView) findViewById(R.id.textview42);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		win1 = (LinearLayout) findViewById(R.id.win1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		win2 = (LinearLayout) findViewById(R.id.win2);
		tan1 = (TextView) findViewById(R.id.tan1);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview44 = (TextView) findViewById(R.id.textview44);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		textview46 = (TextView) findViewById(R.id.textview46);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		textview45 = (TextView) findViewById(R.id.textview45);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		loc1 = (TextView) findViewById(R.id.loc1);
		textview5 = (TextView) findViewById(R.id.textview5);
	}
	private void initializeLogic() {
		textview42.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
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
