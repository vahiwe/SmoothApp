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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;
import android.graphics.Typeface;

public class ScalesActivity extends AppCompatActivity {
	
	
	private ArrayList<String> scales = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear12;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private ImageView imageview5;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private Spinner spinner1;
	
	private Intent linear = new Intent();
	private Intent diagonal = new Intent();
	private Intent vernier = new Intent();
	private Intent comparative = new Intent();
	private Intent chords = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.scales);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview31 = (TextView) findViewById(R.id.textview31);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (spinner1.getSelectedItemPosition() == 0) {
					
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					linear.setClass(getApplicationContext(), LinearActivity.class);
					startActivity(linear);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					diagonal.setClass(getApplicationContext(), DiagonalActivity.class);
					startActivity(diagonal);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					vernier.setClass(getApplicationContext(), VernierActivity.class);
					startActivity(vernier);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 4) {
					comparative.setClass(getApplicationContext(), ComparativeActivity.class);
					startActivity(comparative);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 5) {
					chords.setClass(getApplicationContext(), ScaleOfChordsActivity.class);
					startActivity(chords);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		scales.add("TYPES OF SCALES ");
		scales.add("1. Linear/Plain Scale");
		scales.add("2. Diagonal Scale");
		scales.add("3. Vernier Scale");
		scales.add("4. Comparative Scales");
		scales.add("5. Scale of Chords");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
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
