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

public class LociActivity extends AppCompatActivity {
	
	
	private ArrayList<String> loci = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll5;
	private TextView header;
	private LinearLayout linear7;
	private TextView textview1;
	private ImageView imageview1;
	private TextView textview2;
	private ImageView imageview2;
	private TextView textview3;
	private ImageView imageview3;
	private LinearLayout linear8;
	private TextView textview4;
	private ImageView imageview4;
	private TextView textview5;
	private ImageView imageview5;
	private TextView textview6;
	private ImageView imageview6;
	private TextView textview7;
	private ImageView imageview7;
	private TextView textview8;
	private ImageView imageview8;
	private TextView textview9;
	private TextView textview10;
	private Spinner spinner1;
	private TextView textview11;
	private TextView textview12;
	private ImageView imageview9;
	
	private Intent eccentric = new Intent();
	private Intent peculiar = new Intent();
	private Intent rectangle = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.loci);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll5 = (ScrollView) findViewById(R.id.vscroll5);
		header = (TextView) findViewById(R.id.header);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (spinner1.getSelectedItemPosition() == 0) {
					
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					eccentric.setClass(getApplicationContext(), EccentricityActivity.class);
					startActivity(eccentric);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					rectangle.setClass(getApplicationContext(), CircRectActivity.class);
					startActivity(rectangle);
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
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), Typeface.NORMAL);
		textview2.setText("(Sorry,and Ehya to those who don't get this). \n\nThis Loci, which can be pronounced as Low-Kai or Low-Sigh... Even Low-key at times, is the plural of Locus.\n\n Just like you have Foci = Focus; Radii = Radius; and Campi = Campus(Ok, not really)\n\n\nLocus of a point is the path traced by the point according to a particular rule. \nI'll give two examples :\n\n1. Locus of points equidistant from a line. \nEquidistant means having equal/the same distance. So, we have the line, and the points A, B, C, D, E");
		textview6.setText("The three major loci we would be considering under different methods are:\n•Ellipses \n•Parabolas \n•Hyperbolas\n\nFrom your secondary school knowledge, you know these are conic sections\n\nThese curves have parts...here are some of the parts we'd be considering:\n>The curve itself\n>The vertex...this is the tip(or tips in case of an ellipse) of the curve \n>The focus\n>The directrix\n\nNow, I'll define the curves, but for now, you don't need to rack your brain about the details... Or start bothering to memorize.. When we start working with them, it will all be easier.\n\n\nTHE PARABOLA is the locus of points equidistant from a fixed point called the focus and a straight line called the directrix. \nIt's eccentricity is 1 (e = 1)");
		textview9.setText("I know the question on your mind now... \nWhat is Eccentricity?\n\nEccentricity is this ratio :—\nDistance between VERTEX and FOCUS : Distance between VERTEX and DIRECTRIX  or VF/VD\nLike I said... Don't kill yourself about this yet... Let's take it one at a time. \n\n\nNow, we have 3 curves and 3 different methods to consider:\n•Eccentricity Method \n•Circumscribing Rectangle Method \n•Peculiar Methods");
		loci.add("METHODS OF LOCI");
		loci.add("1. Eccentricity ");
		loci.add("2. Circumscribing Rectangle ");
		loci.add("3. Peculiar");
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
