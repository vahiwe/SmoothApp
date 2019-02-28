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
import android.view.View;
import android.graphics.Typeface;

public class AssignScalesActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear5;
	private LinearLayout linear3;
	private LinearLayout win1;
	private LinearLayout linear8;
	private LinearLayout win2;
	private TextView sca1;
	private TextView sca2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private ImageView imageview1;
	private TextView textview6;
	private ImageView imageview2;
	private TextView textview11;
	private ImageView imageview3;
	private TextView textview12;
	private ImageView imageview4;
	private TextView textview20;
	private TextView textview10;
	private ImageView imageview5;
	private TextView textview9;
	private ImageView imageview6;
	private TextView textview8;
	private ImageView imageview7;
	private TextView textview7;
	private ImageView imageview8;
	private TextView textview21;
	private TextView textview13;
	private TextView textview29;
	private TextView textview28;
	private ImageView imageview9;
	private TextView textview15;
	private ImageView imageview10;
	private TextView textview17;
	private ImageView imageview11;
	private TextView textview18;
	private ImageView imageview12;
	private TextView textview19;
	private ImageView imageview13;
	private TextView textview30;
	private TextView textview14;
	private ImageView imageview14;
	private TextView textview32;
	private ImageView imageview15;
	private TextView textview33;
	private ImageView imageview16;
	private TextView textview31;
	private ImageView imageview26;
	private ImageView imageview25;
	private TextView cra1;
	private TextView cra2;
	private TextView textview25;
	private TextView textview38;
	private ImageView imageview17;
	private TextView textview37;
	private TextView textview36;
	private ImageView imageview18;
	private TextView textview35;
	private ImageView imageview21;
	private TextView textview42;
	private ImageView imageview20;
	private TextView textview34;
	private TextView textview27;
	private ImageView imageview22;
	private TextView textview40;
	private ImageView imageview23;
	private TextView textview41;
	private ImageView imageview24;
	private TextView textview39;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.assign_scales);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		win1 = (LinearLayout) findViewById(R.id.win1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		win2 = (LinearLayout) findViewById(R.id.win2);
		sca1 = (TextView) findViewById(R.id.sca1);
		sca2 = (TextView) findViewById(R.id.sca2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview30 = (TextView) findViewById(R.id.textview30);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		cra1 = (TextView) findViewById(R.id.cra1);
		cra2 = (TextView) findViewById(R.id.cra2);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview42 = (TextView) findViewById(R.id.textview42);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview40 = (TextView) findViewById(R.id.textview40);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview39 = (TextView) findViewById(R.id.textview39);
		
		sca1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				win1.setVisibility(View.VISIBLE);
				win2.setVisibility(View.GONE);
				sca2.setVisibility(View.VISIBLE);
				sca1.setVisibility(View.GONE);
			}
		});
		
		sca2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sca1.setVisibility(View.VISIBLE);
				win1.setVisibility(View.GONE);
				win2.setVisibility(View.GONE);
				sca2.setVisibility(View.GONE);
			}
		});
		
		cra1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				win1.setVisibility(View.GONE);
				win2.setVisibility(View.VISIBLE);
				cra1.setVisibility(View.GONE);
				cra2.setVisibility(View.VISIBLE);
			}
		});
		
		cra2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				win1.setVisibility(View.GONE);
				win2.setVisibility(View.GONE);
				cra2.setVisibility(View.GONE);
				cra1.setVisibility(View.VISIBLE);
			}
		});
	}
	private void initializeLogic() {
		textview6.setText("Now, we need to get the number of divisions. Remember, from the tutorial section, Number of divisions = M.L. ÷ P.D.(primary divisions, that is, the biggest unit you're asked to show) \nHerr we're asked to show units of meters and 5meters. Hence, our Primary divisions are the 5meters\n\nSo, Number of divisions = 25m ÷ 5meters = 5. \n\nDivide the line into 5 parts; erect perpendiculars on each one. ");
		textview13.setText("In a situation like this... You cannot find the RF directly from the question. Why? Because it says 144cm²..which is AREA. \nRemember RF is DISTANCE on paper : DISTANCE on land.\nBut we were given area, so we need to get the distance, and this we find the square root. ");
		textview14.setText("This example is to teach you how to approach scale of chords showing divisions other than 5°. In this case, we aren't asked for 5°, but 7°.\nSo, here's what we'll do: Follow through with all the procedures outlined in the tutorial section right up to Step 3 where you get the 30° mark.");
		win1.setVisibility(View.GONE);
		win2.setVisibility(View.GONE);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		sca2.setVisibility(View.GONE);
		cra2.setVisibility(View.GONE);
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
