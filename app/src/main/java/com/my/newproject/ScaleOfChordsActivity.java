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

public class ScaleOfChordsActivity extends AppCompatActivity {
	
	
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
	private ImageView imageview9;
	private ImageView imageview8;
	private TextView textview10;
	private ImageView imageview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private ImageView imageview11;
	private ImageView imageview12;
	
	private Intent types = new Intent();
	private Intent linear = new Intent();
	private Intent diagonal = new Intent();
	private Intent vernier = new Intent();
	private Intent comparative = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.scale_of_chords);
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
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		
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
					comparative.setClass(getApplicationContext(), ComparativeActivity.class);
					startActivity(comparative);
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
		scales.add("Comparative Scales");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
		textview2.setText("Up until now, we've been dealing with scales that measure distance... In lengths. Now, the scale of chords measures angles on degrees. Remember I said the other scales were like constructing a ruler? Now, the Scale of Chords is like construction of a PROTRACTOR. It's very straightforward, so we'll just treat one question. \n\nExample 6: Construct a Scale of chords having 5° divisions and indicate the following angles : a) 15° b) 35° c) 85° d) 105°\n\n\n\nSTEP 1: Draw a straight line and construct angle 90° on it.");
		textview11.setText("Now, here's a little mind-boggling quiz to get you thinking... \n\nIt's a wonderful paradox... \n\n\nA crocodile snatches a young boy from a riverbank. His mother pleads with the crocodile to return him, to which the crocodile replies that he will only return the boy safely if the mother can guess correctly what he will do with the child. There is no problem if the mother guesses that the crocodile will return him—or any other guess whatsoever (e.g. she could say \"You would eat my child\", or \"...feed my child\", whatever)if she is right, he is returned; if she is wrong, the crocodile keeps him. \nThe question now is, what happens if she answers that the crocodile will not return the child?\n\nThink very well before you answer... \n\nSend your answer, WITH REASONS to me in a text message (No whatsapp, or facebook, or spamming allowed) and the most correct one gets a prize. \n\n\nSee you in the next topic.");
		textview13.setText("Ever wanted to feel and experience love and care like you've never seen before? \nEver wanted to be in a place where you feel absolutely free to express your worship without limitation? \nAll Saints Chapel, FUTO Cordially, and with warm expectation, invites you to worship with us every \nSunday : 8AM\nWednesday : 2PM\nVENUE : Old FUTO park, opposite SEET complex and CCE building. ");
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
