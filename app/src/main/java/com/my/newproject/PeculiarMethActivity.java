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

public class PeculiarMethActivity extends AppCompatActivity {
	
	
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
	private TextView textview27;
	private TextView textview28;
	private ImageView imageview8;
	private TextView textview10;
	private ImageView imageview9;
	private TextView textview11;
	private ImageView imageview10;
	private TextView textview25;
	private ImageView imageview11;
	private TextView textview26;
	private ImageView imageview12;
	private TextView textview20;
	private ImageView imageview13;
	private TextView textview24;
	private ImageView imageview14;
	private TextView textview22;
	private ImageView imageview15;
	private TextView textview23;
	private ImageView imageview16;
	private TextView textview12;
	private ImageView imageview17;
	private TextView textview21;
	private ImageView imageview18;
	private TextView textview13;
	private ImageView imageview19;
	private TextView textview19;
	private ImageView imageview20;
	private TextView textview14;
	private ImageView imageview21;
	private TextView textview18;
	private ImageView imageview22;
	private TextView textview17;
	private ImageView imageview23;
	private TextView textview15;
	private ImageView imageview24;
	private TextView textview16;
	private ImageView imageview25;
	private TextView textview29;
	
	private Intent back = new Intent();
	private Intent eccentric = new Intent();
	private Intent circrect = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.peculiar_meth);
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
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		textview29 = (TextView) findViewById(R.id.textview29);
		
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
					circrect.setClass(getApplicationContext(), CircRectActivity.class);
					startActivity(circrect);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		loci.add("");
		loci.add("<< BACK");
		loci.add("Eccentricity ");
		loci.add("Circumscribing Rectangle ");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, loci));
		textview2.setText("There's actually no method called the \"Perculiar method\". Sorry, you've been scammed. But then, the methods I'll speak about here are unique to each curve. Unlike the methods in the previous sections, one can't be applied to the other. I'll start with the Ellipse.\n\n\nConcentric Circle Method. \n\nThis is used to construct an Ellipse when the major and minor axes are known. \n\nExample 5: Using the Concentric Circle Method, construct an ellipse having major and minor axes of 110mm and 90mm respectively. \n\nIn case you don't know... Concentric circles are two or more circles that have the same center, ");
		textview8.setText("Focal Point Method\n\nStill on the ellipse matter, now this one is pretty long, so pay attention... In this case, well be considering 3 parts of the ellipse:\n•Focal points \n•Major axis\n•Minor axis\nRemember the original definition of an ellipse: Oya, #tbt:\n\nTHE ELLIPSE is the locus of points such that the sum of the distances from two focal points is always constant. ");
		textview9.setText("We have 2 focal points, and on every part of the ellipse, the sum of the distance from both of them is always constant. Let's look at the shape and see where to locate the features:\n\n•> A—B  = Major axis (please, the \"—\" sign means \"to\"...it doesn't mean \"minus\", so this is \"A to B\", and not \"A minus B\")\n•> C—D = Minor axis \n•> F1 & F2 = Focal points\n•> P1 & P2 are random points on the ellipse. \n\nNow, this is what the definition means :\nIf distance F1—P1 = 30 and F2—P1 = 60, the sum is = 90 (F1—P1 + F2—P1) \nIf distance F1—P2 = 50, then F2—P2 must be 40, the sum is = 90 (F1—P2 + F2—P2) \nThe sum is CONSTANT. \n\nLet's take an example :\nExample 6: Construct an ellipse given that the major axis = 100mm and the focal points are 80mm apart. What is the length of the minor axis? \n\nNow, take note of this relationship between the three parts:");
		textview13.setText("Asymptote Method \n\nThis makes use of two intersecting lines or arms called asymptotes (those who did Further Maths will remember this) you'll see in a bit. \n\nExample 7: Two lines OA and OB are at an angle of 75° to each other. Construct a hyperbola to pass through point P, such that point P is 40mm from OA and 30mm from OB. Mark at least 6 points. \n\nSTEP 1: First draw the asymptotes, A & B, two lines at 75° to each other to intersect at O. ");
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
