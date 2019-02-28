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
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.graphics.Typeface;

public class TestimoniesActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView header;
	private LinearLayout linear2;
	private TextView textview3;
	private ImageView imageview3;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private ImageView imageview4;
	private TextView textview17;
	private TextView textview18;
	private ImageView imageview5;
	private TextView textview19;
	private TextView textview20;
	private ImageView imageview7;
	private TextView textview21;
	private TextView textview22;
	private TextView textview23;
	private ImageView imageview8;
	private TextView textview24;
	private TextView textview26;
	private ImageView imageview10;
	private TextView textview27;
	private TextView textview29;
	private TextView textview28;
	private ImageView imageview11;
	private TextView textview30;
	private TextView textview32;
	private ImageView imageview9;
	private TextView textview35;
	private TextView textview36;
	private ImageView imageview13;
	private TextView textview31;
	private TextView textview38;
	private TextView textview33;
	private TextView textview37;
	private TextView textview39;
	private TextView textview34;
	private TextView textview45;
	private TextView textview41;
	private TextView textview46;
	private TextView textview51;
	private TextView textview50;
	private TextView textview49;
	private TextView textview48;
	private ImageView imageview15;
	private TextView textview47;
	private TextView textview44;
	private ImageView imageview6;
	private TextView textview42;
	private TextView textview43;
	private TextView textview54;
	private TextView textview53;
	private TextView textview59;
	private ImageView imageview16;
	private TextView textview58;
	private TextView textview57;
	private TextView textview56;
	private ImageView imageview17;
	private TextView textview55;
	private TextView textview52;
	private ImageView imageview18;
	private TextView textview40;
	private TextView textview60;
	private TextView textview61;
	private ImageView imageview12;
	private TextView textview64;
	private TextView textview63;
	private ImageView imageview19;
	private TextView textview62;
	private TextView textview25;
	private Button save_override;
	private EditText edittext1;
	private Button one;
	private Button two;
	private Button three;
	private ImageView imageview20;
	
	private SharedPreferences smooth1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.testimonies);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		header = (TextView) findViewById(R.id.header);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview48 = (TextView) findViewById(R.id.textview48);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview44 = (TextView) findViewById(R.id.textview44);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview42 = (TextView) findViewById(R.id.textview42);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview59 = (TextView) findViewById(R.id.textview59);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview56 = (TextView) findViewById(R.id.textview56);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview52 = (TextView) findViewById(R.id.textview52);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview61 = (TextView) findViewById(R.id.textview61);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview63 = (TextView) findViewById(R.id.textview63);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview62 = (TextView) findViewById(R.id.textview62);
		textview25 = (TextView) findViewById(R.id.textview25);
		save_override = (Button) findViewById(R.id.save_override);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		one = (Button) findViewById(R.id.one);
		two = (Button) findViewById(R.id.two);
		three = (Button) findViewById(R.id.three);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		smooth1 = getSharedPreferences("override", Activity.MODE_PRIVATE);
		
		save_override.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				smooth1.edit().putString("over", edittext1.getText().toString()).commit();
			}
		});
		
		one.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				two.setVisibility(View.VISIBLE);
			}
		});
		
		two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				three.setVisibility(View.VISIBLE);
			}
		});
		
		three.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save_override.setVisibility(View.VISIBLE);
				edittext1.setVisibility(View.VISIBLE);
			}
		});
	}
	private void initializeLogic() {
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		three.setVisibility(View.GONE);
		one.setVisibility(View.VISIBLE);
		two.setVisibility(View.GONE);
		edittext1.setVisibility(View.GONE);
		save_override.setVisibility(View.GONE);
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
