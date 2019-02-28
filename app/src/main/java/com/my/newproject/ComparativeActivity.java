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

public class ComparativeActivity extends AppCompatActivity {
	
	
	private ArrayList<String> scales = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private Spinner spinner1;
	private LinearLayout linear2;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview10;
	private ImageView imageview6;
	private TextView textview5;
	private ImageView imageview5;
	private TextView textview6;
	private ImageView imageview4;
	private TextView textview7;
	private TextView textview11;
	private ImageView imageview3;
	private TextView textview8;
	private ImageView imageview2;
	private TextView textview9;
	private ImageView imageview1;
	
	private Intent types = new Intent();
	private Intent linear = new Intent();
	private Intent diagonal = new Intent();
	private Intent vernier = new Intent();
	private Intent chords = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.comparative);
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
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		
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
					linear.setClass(getApplicationContext(), LinearActivity.class);
					startActivity(linear);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					diagonal.setClass(getApplicationContext(), DiagonalActivity.class);
					startActivity(diagonal);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 4) {
					vernier.setClass(getApplicationContext(), VernierActivity.class);
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
		scales.add("");
		scales.add("<< BACK");
		scales.add("Linear/Plain Scale");
		scales.add("Diagonal Scale");
		scales.add("Vernier Scale");
		scales.add("Scale of Chords");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
		textview2.setText("Now, you won't find a lot of people talking about this...and not every lecture hall covers this... So, in case you come across this, here we go:\n\nComparative scales are based on the principle of comparison between some totally unrelated units. \n\nWhat do I mean? \n\nIn comparative scales, you'll be doing just that—COMPARING. \n\nThere will be two scales with different units but with the same R.F., for instance, you could be asked to draw a comparative scale with R.F. 1:7920, and one of the scales would show centimeters and decimetres, while the other scales will show some other weird unit like furlongs and yards, or inches and feet... That kinda thing. \n\nSo basically... I've made two points.. \n\n1. It involves 2 scales. \n\n2. The units  of the two scales are unrelated. \n\n3. The R.F. is the same. \n\nOK, sorry... That's 3 points, even better. \nSo, let's take one example :\n\nExample 5: A stretch of land 40 miles long is represented in a chart by a line 8cm long. Construct a plain scale to read miles up to 80 miles. Also, construct a complaint scale to read kilometers up to 120km.\n\n\nSTEP 1: Determine the common R.F. \n\nAs you can observe, only one reference was made to indicate the Representative Fraction, and that's where you have \"...40 miles long is represented in a chart by a line 8cm long...\"");
		textview4.setText("So, the RF can be calculated as:\n\n8cm : 40miles\n\nOr\n\n8cm : 40 x (1.609 x 100000)cm = 1:804,500\n\nThis is the RF for both scales. \n\n\nSTEP 2: Determine the LOS.\nLet's Start from the miles scale:\nYou recall: LOS = RF x ML\nAnd the ML here is 80 miles. \n\nSo, LOS = 80miles x 1/804,500\nOr\n80 x(1.609 x 1000 x100)cm ÷ 804,500 =\n\n12,872,000cm ÷ 804,500 =\n\n16cm. ");
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
