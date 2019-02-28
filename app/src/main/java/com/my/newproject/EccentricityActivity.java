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

public class EccentricityActivity extends AppCompatActivity {
	
	
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
	private TextView textview5;
	private ImageView imageview3;
	private TextView textview6;
	private ImageView imageview4;
	private TextView textview7;
	private ImageView imageview5;
	private TextView textview8;
	private ImageView imageview7;
	private TextView textview9;
	private ImageView imageview8;
	private TextView textview20;
	private ImageView imageview9;
	private TextView textview19;
	private ImageView imageview10;
	private TextView textview21;
	private ImageView imageview11;
	private TextView textview10;
	private ImageView imageview20;
	private TextView textview11;
	private ImageView imageview12;
	private TextView textview12;
	private TextView textview22;
	private TextView textview23;
	private ImageView imageview13;
	private TextView textview17;
	private ImageView imageview15;
	private TextView textview13;
	private ImageView imageview16;
	private TextView textview14;
	private ImageView imageview17;
	private TextView textview15;
	private ImageView imageview18;
	private TextView textview16;
	private ImageView imageview19;
	
	private Intent circrect = new Intent();
	private Intent back = new Intent();
	private Intent perculiar = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eccentricity);
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
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview16 = (TextView) findViewById(R.id.textview16);
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
					circrect.setClass(getApplicationContext(), CircRectActivity.class);
					startActivity(circrect);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					perculiar.setClass(getApplicationContext(), PeculiarMethActivity.class);
					startActivity(perculiar);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		textview2.setText("This is the method most people consider as the most challenging. I know others would usually leave it for the last, but I'll talk about it first.\n\nExample 1: Given that the distance between the Focus and Directrix is 40mm, construct 3 curves with eccentricities ¾, 1, and 4/3. Name each curve.\n\n\nSTEP 1: Draw a straight line and mark a point F (the focus) and a perpendicular line (The Directrix) 40mm to the left of it. ");
		textview3.setText("Now, remember, the eccentricity refers to relationship between the curve and these two points, F & D. \n\nLet's start with curve e = 1, you know that's the Parabola. We have to locate the vertex\n\nRemember e = VF/VD\n\nSTEP 2: For the Parabola, VF = VD, so we bisect F to D to get point VP (vertex of the parabola)\n\nSTEP 3: Mark random points to the right of F (they don't have to be equal, but for this example, we'll make each one 10mm) I'll call the points 1, 2, 3, and 4. \n\nKNOW THIS: The more points you have, the more accurate your Locus will be.\n\nProduce vertical lines through the points. ");
		
		textview8.setText("Let's proceed to curve e = 4/3.\n\n That's the Hyperbola (you know, e > 1). The first thing to get is the vertex, VH  \n\nRemember, for this particular hyperbola, VF/VD = 4/3\n\n\nSTEP 6: Divide D—F into 7 equal parts and number them from the Focus as 0 to the directrix as 7.\nPoint 4 is the VH");
		textview9.setText("Listen carefully here now... \n\nSTEP 7: Just like you did with the parabola in step 4, measure the distance D—1, it's 50mm; [listen real good here] multiply this with the eccentricity, that's \n50 x 4/3 = 66.67\n\nNow, instead of opening your compass to 50mm, this is the new distance with which you would cut line 1. So, \n\n\nSTEP 8: Open your compass to 66.67mm, place on F and cut line 1 up and down. ");
		textview20.setText("STEP 9: Repeat, but now with D—2. Measure D—2: it's 60mm. Multiply this with the eccentricity :\n60 x 4/3 = 80mm\n\nSTEP 10:  place your compass on F and cut line 2 with a radius of 80mm. Do the same thing for the remaining lines: 3, 4, etc. ");
		textview10.setText("Just like with the hyperbola in step 7 and Just like you did with the parabola in step 4, measure the distance D—1, it's 50mm; [listen real good here] multiply this with the eccentricity, that's \n50 x ¾ = 37.5mm\n\n\nSTEP 12: open your compass to 37.5mm, place on F and cut line 1 up and down.");
		textview12.setText("Now, this is just one half of what an ellipse looks like... For the other part, we have to locate the second focus and do everything again. 😂 don't cry yet, just watch... \n\nLet's call the distance between the first and second Foci F1—F2.\n\nThere's a formula for getting this distance :");
		textview23.setText("Hope you understand this. a & b are the numerator and denominator of the eccentricity (a/b = ¾). So, in this case, a = 3, b = 4.\n\nFor this example : \nF1—F2 = 40 x 3 - 40/(3+4) = 114.29mm\n\n\nSTEP 14: Measure a distance of 114.29 along the horizontal line from F1 to give point F2.  ");
		loci.add("");
		loci.add("<< BACK");
		loci.add("Circumscribing Rectangle ");
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
