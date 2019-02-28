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
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;

public class LinearActivity extends AppCompatActivity {
	
	
	private ArrayList<String> scales = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview15;
	private Spinner spinner1;
	private LinearLayout linear2;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private ImageView imageview1;
	private TextView textview7;
	private ImageView imageview2;
	private TextView textview8;
	private ImageView imageview3;
	private TextView textview9;
	private ImageView imageview4;
	private TextView textview10;
	private ImageView imageview5;
	private TextView textview11;
	private TextView textview17;
	private TextView textview16;
	private ImageView imageview6;
	private TextView textview12;
	private ImageView imageview8;
	private TextView textview13;
	private ImageView imageview7;
	
	private Intent types = new Intent();
	private Intent diagonal = new Intent();
	private Intent vernier = new Intent();
	private Intent comparative = new Intent();
	private Intent chords = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.linear);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview15 = (TextView) findViewById(R.id.textview15);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (spinner1.getSelectedItemPosition() == 0) {
					
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					types.setClass(getApplicationContext(), ScalesActivity.class);
					startActivity(types);
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
					vernier.setClass(getApplicationContext(), ComparativeActivity.class);
					startActivity(vernier);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 5) {
					vernier.setClass(getApplicationContext(), ScaleOfChordsActivity.class);
					startActivity(vernier);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		textview2.setText("Whenever you hear the words \"Construct a Scale... \" let your mind interpret it as \"Draw a ruler... \" because, a scale is just like a ruler. I'll explain how in a while; let's take an example. \n\n\nExample 1: Construct a scale with R.F. = 1:30 showing meters and Decameters, and to measure up to 6meters. Mark off the following distances on the scale:\na)  3.7m  b) 5.2m\nThings to note about Linear/Plain scales before we start:\nThey can measure only two units (as in the example above: Meters and decimeters) \nThe question would never go beyond 1 decimal place.");
		textview4.setText("In every question on Scales, there are 3 things to look out for first:\n\n1. R.F. This is the ratio by which the scale you are drawing was reduced (or increased). It stands for REPRESENTATIVE FRACTION. \nR.F. is the ratio of Distance on paper/Distance in real life (just like the scale in your title block). It is the FIRST thing you must look out for in the question. In this case, it's given as 1:30, or 1/30. This means 1 unit on paper represents 30 units in real life. If you have 1:1, it would mean that 1unit on paper = 1unit in real life (no reduction or enlargement).\n\n2. M.L. This is the maximum length. This is the greatest, or highest capacity of the scale. The scale can never read distances beyond this. Relating it to your ruler, some rulers can't measure more than 15cm, while some rulers max. length is 30cm... Some even measure up to 100cm (meter rule). \nThis is the SECOND thing to look out for. How you can find this: try to spot phrases like measure up to, read up to, show up to. \nIn this example, M.L. = 6m\n\n3. L.O.S. This is the actual length of the scale you will draw on your drawing sheet. Of course, you can't draw the whole maximum length (it will be too large---in fact, impossible. Imagine yourself drawing 6meters... Mtchew). So, it has to be reduced by your R.F.");
		textview6.setText("🗣DONT EVER FORGET THIS FORMULA!!!\n\nI'm screaming it now, it'd break my heart if you forget it. \n\nFor this example, \nL.O.S. = 6m x 1/30 = 0.2m or 20cm\n\nSo, back to the question... \nConstruct a scale with R.F. = 1:30 showing meters and Decameters, and to measure up to 6meters. Mark off the following distances on the scale:\na)  3.7m  b) 5.2m\n\n\nSTEP 1: Draw a line of length, 20cm (because the LOS is 20cm) ");
		textview8.setText(" You can see, a ruler is, first of all, divided into centimeters and then millimeters.\n\n Look at this in a ruler:\n•Maximum Length(ML) = 30centimeters, \n•Primary Divisions(PD) = centimeters\n•Number of divisions : ML/PD = 30centimeters/centimeters \n\nOf course, as we usually say, \"centimeters cancels centimeters\" and we have 30 times. \n\nNow, for our scale example, ML = 6meters; PD = meters; Number of parts to be divided: 6meters/meters = 6parts\n(Check the ASSIGNMENTS section of the App for more examples of this) ");
		scales.add("");
		scales.add("<< BACK");
		scales.add("Diagonal Scale");
		scales.add("Vernier Scale");
		scales.add("Comparative Scales");
		scales.add("Scale of Chords");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
		textview10.setText("Now, we need to also show the secondary divisions. Like on a ruler, each of the 1cm parts is further divided into 10 equal millimeters (because, we have 10mm in 1cm)\n\nSo, here as well, each of the 1 meter divisions should be cut into 10. But we usually divide only the first one to save time.\n\n\nSTEP 4:  mark out the secondary divisions, divided the first portion into 10 equal parts. ");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		SketchwareUtil.showMessage(getApplicationContext(), "Click the three dots at the top right corner");
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
