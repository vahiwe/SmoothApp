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

public class DiagonalActivity extends AppCompatActivity {
	
	
	private ArrayList<String> scales = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private Spinner spinner1;
	private LinearLayout linear2;
	private LinearLayout linear3;
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
	private TextView textview11;
	private TextView textview12;
	private ImageView imageview10;
	
	private Intent types = new Intent();
	private Intent linear = new Intent();
	private Intent vernier = new Intent();
	private Intent comparative = new Intent();
	private Intent chords = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.diagonal);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
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
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		
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
		textview3.setText("•So it means there is greater accuracy. \n\n•Questions can come with up to 2 decimal places. \n\nLet's consider a question.\n•Example 2:  The distance between two villages, 10km apart on a map is 20 cm. Construct a scale showing Km, Hm & Dm to measure up to 10km. Mark the following distances on the scale :\na) 4.63Km   b) 6.84km   c) 0.37km\n\n First things first, determine the three parameters:\n\nML in this question is gotten from \"...to measure up to 10km... \". The ML = 10km. \n\nRF, remember, is the distance on paper(or map or chart) ÷ the distance in real life(or field or land). So, in this case, \nRF = 20cm/10km\n(Always convert to the lower unit,in this case, it's centimeters) \nWhich is \n20cm/1000000cm = 1:50,000\n\nLOS = RF x ML \n= 1/50000 x 10km\n\n(convert to the lowest unit to make things easier, MTH101 is a problem on its own, don't come and add it to ENG 103, please) \n👇 \n1/50000 x 1000000cm\nLOS = 20cm. \n\n\nSTEP 1: Draw a straight line of length, 20cm. ");
		textview4.setText("STEP 2: Mark out the primary divisions: in this case, the primary division(like on a ruler) is the highest unit the scale (or ruler)  can measure, which in this instance is Kilometers. \n\nRemember our formular:\nNumber of divisions = Max. Length/ Primary divisions \n\n=10km/km = 10divisions\n\n\nDivide the line into 10 equal parts. ");
		textview7.setText("These are the Hectometres. Up until now, everything has been the same with linear scales; here's where the change occurs:\n\n\nSTEP 5: We need to mark out the tertiary divisions (the Decimeters), and you know, it's not possible to divide one of these Hm into 10 equal parts. Therefore, we use another method: we divide the scale vertically along the side as shown in the diagram... You can choose to use your regular line-division method, or you can simply use 2mm(0.2cm).");
		textview8.setText("These 10 lines will represent the Dm. \n\nNumber all the Dm, but start from the bottom as 0, ending as 10 at the top. \n\n\nSTEP 6: At this stage, you're done with the drawings, all that's left is for you to mark out the required distances. Now, pay close attention:\n\na) 4.63Km...this means 4km, 6Hm and 3Dm. \nMark 4 in the Km part, and mark .63 in the Hm part: .63 is between 6Hm and 7Hm, so.. \n\nDraw a diagonal line from the BOTTOM of 6 to the TOP of 7 as shown. Your mark is to be at the point where the horizontal line of 3 crosses this diagonal line... That's 4.63Km");
		textview10.setText("84 lies lies between 8Hm and 9Hm. So,draw a diagonal line from the BOTTOM of 8 to the TOP of 9. The point you're  looking for is the point where the horizontal line called \"4\" crosses the diagonal line.\n\n\nc) 0.37Km...this means 0km, 3Hm and 7Dm. \nMark 0 in the Km part, and mark .37 in the Hm part: .37 is between 3Hm and 4Hm, so..\n \nDraw a diagonal line from the BOTTOM of 3 to the TOP of 4 as shown.The point we're  looking for is the point where the horizontal line called \"7\" crosses the diagonal line.");
		scales.add("");
		scales.add("<< BACK");
		scales.add("Linear Scale");
		scales.add("Vernier Scale");
		scales.add("Comparative Scales");
		scales.add("Scale of Chords");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
		textview12.setText("Are u looking for a good Computer Technician or a good Graphic Designer?\nIf YES then you just found one\nBook us today and you will never regret you did.\nWe design:\n💫E-flyers\n💫Flex banners\n💫Handbill\n💫cards of all kind\n💫envelopes\n💫stickers\n💥and many more. We also print our designs.\nWe also Specialize in\n🔧computer installation and maintenance\n🔧computer repairs\n🔧burning of CDs\n🔧software installation\n🔧laptop and desktop computer system formatting\n👍and lots more.\nReach us through our e-mail address: Nextlevelconcepts.mail@gmail.com or call us on: 08104277807; 08127005673");
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
