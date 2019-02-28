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

public class CircRectActivity extends AppCompatActivity {
	
	
	private ArrayList<String> loci = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private Spinner spinner1;
	private LinearLayout linear2;
	private TextView textview2;
	private ImageView imageview1;
	private TextView textview3;
	private ImageView imageview2;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	private ImageView imageview4;
	private TextView textview6;
	private ImageView imageview5;
	private TextView textview7;
	private ImageView imageview6;
	private TextView textview8;
	private ImageView imageview7;
	private TextView textview9;
	private ImageView imageview8;
	private TextView textview10;
	private ImageView imageview9;
	private TextView textview17;
	private ImageView imageview10;
	private TextView textview16;
	private ImageView imageview11;
	private TextView textview11;
	private ImageView imageview21;
	private TextView textview23;
	private TextView textview24;
	private ImageView imageview12;
	private TextView textview21;
	private ImageView imageview13;
	private TextView textview19;
	private ImageView imageview14;
	private TextView textview20;
	private ImageView imageview15;
	private TextView textview12;
	private ImageView imageview16;
	private ImageView imageview17;
	private TextView textview13;
	private ImageView imageview18;
	private TextView textview14;
	private ImageView imageview19;
	
	private Intent back = new Intent();
	private Intent eccentric = new Intent();
	private Intent peculiar = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.circ_rect);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (spinner1.getSelectedItemPosition() == 0) {
					
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					back.setClass(getApplicationContext(), LociActivity.class);
					startActivity(back);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					eccentric.setClass(getApplicationContext(), EccentricityActivity.class);
					startActivity(eccentric);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					peculiar.setClass(getApplicationContext(), PeculiarMethActivity.class);
					startActivity(peculiar);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		textview2.setText("These are methods where we'd have to draw a rectangle first in which the curve will be drawn. We'll consider the various curves again. \n\n\n1. Parabola. \nExample 2: A ball is thrown vertically into the air. It reaches a height of 5m and stops 6m away from the starting point. Construct the path traced by the ball, assuming it to be parabolic. \nHaha, now we're applying ENG 103 to Physics (abi, is it Physics to ENG 103? 🤔). In this case,  we first of all need the rectangle. The range/distance gives the length and the Maximum height gives the height of the rectangle. \n\nSTEP 1: Draw a rectangle of height and length 5cm and 6cm respectively (we're using a scale of 1 :100)");
		textview3.setText("STEP 2: Divide the length into twice as many parts as the height. What do I mean? If you divide the height into 4 equal parts, divide the length into 8; if you divide the height into 5, then you divide the length into 10. I'm sure it's clear now. \nSo, for this example, let's use 4 and 8.\n\nSTEP 3: Draw parrallel straight lines from the divisions along the length. ");
		textview6.setText("2. Ellipse\n\nExample 3: Using the circumscribing rectangle method, construct and ellipse having major and minor axis as 100mm and 80mm respectively. \n\nSTEP 1: Draw a rectangle of length = major axis and width = minor axis. What I mean is a 100 x 80 rectangle. \n\nSTEP 2: Draw perpendicular lines representing the major and minor axis of the rectangle. \n\nSTEP 3: Divide the major axis, and the widths into the same number of equal parts. I've highlighted the lines to be divided below:");
		textview11.setText("3. Hyperbola \nMathematically, a hyperbola has two branches with the same eccentricity. Using this method of construction, we're dealing with 3 parts:\n\n•Transverse Axis (TA) \n•Axis of Symmetry (AoS) \n•Given point on the Hyperbola \n\nLet's take an example :\n\nExample 4: Draw both branches of a hyperbola having Transverse Axis of 60mm, and a point on one branch, 60mm from the Axis of Symmetry and 72mmm from the vertex. \n\nNow, in cases like these, this is where the points are located :");
		loci.add("");
		loci.add("<< BACK");
		loci.add("Eccentricity ");
		loci.add("Peculiar");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, loci));
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
