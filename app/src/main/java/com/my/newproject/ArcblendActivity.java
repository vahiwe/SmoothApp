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
import android.widget.HorizontalScrollView;

public class ArcblendActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView win3;
	private TextView textview1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview29;
	private ImageView imageview27;
	private TextView textview30;
	private ImageView imageview28;
	private TextView textview31;
	private ImageView imageview29;
	private TextView textview32;
	private ImageView imageview30;
	private TextView textview33;
	private ImageView imageview31;
	private TextView textview34;
	private ImageView imageview32;
	private TextView textview35;
	private ImageView imageview33;
	private TextView textview36;
	private ImageView imageview34;
	private TextView textview37;
	private ImageView imageview35;
	private TextView textview38;
	private ImageView imageview36;
	private TextView textview39;
	private ImageView imageview37;
	private TextView textview40;
	private ImageView imageview38;
	private TextView textview41;
	private ImageView imageview39;
	private TextView textview42;
	private TextView textview43;
	private ImageView imageview47;
	private TextView textview44;
	private TextView textview46;
	private HorizontalScrollView hscroll1;
	private TextView textview45;
	private LinearLayout linear6;
	private ImageView imageview40;
	private ImageView imageview41;
	private ImageView imageview42;
	private ImageView imageview46;
	private ImageView imageview44;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.arcblend);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		win3 = (ScrollView) findViewById(R.id.win3);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		textview34 = (TextView) findViewById(R.id.textview34);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview33 = (ImageView) findViewById(R.id.imageview33);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview35 = (ImageView) findViewById(R.id.imageview35);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview36 = (ImageView) findViewById(R.id.imageview36);
		textview39 = (TextView) findViewById(R.id.textview39);
		imageview37 = (ImageView) findViewById(R.id.imageview37);
		textview40 = (TextView) findViewById(R.id.textview40);
		imageview38 = (ImageView) findViewById(R.id.imageview38);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview39 = (ImageView) findViewById(R.id.imageview39);
		textview42 = (TextView) findViewById(R.id.textview42);
		textview43 = (TextView) findViewById(R.id.textview43);
		imageview47 = (ImageView) findViewById(R.id.imageview47);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview46 = (TextView) findViewById(R.id.textview46);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		textview45 = (TextView) findViewById(R.id.textview45);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview40 = (ImageView) findViewById(R.id.imageview40);
		imageview41 = (ImageView) findViewById(R.id.imageview41);
		imageview42 = (ImageView) findViewById(R.id.imageview42);
		imageview46 = (ImageView) findViewById(R.id.imageview46);
		imageview44 = (ImageView) findViewById(R.id.imageview44);
	}
	private void initializeLogic() {
		textview29.setText("Now, we're on to the interesting part. This part deals with arcs connecting circles instead of lines connecting the circles. \n\nThere are two types of arcs, and let's get that straight now. There's the Internal arc and there's the External arc. \n\nRemember when I told you that an arc can be completed into a full circle? Yes, you do. \n\nAn arc can be internal or external depending on the two circles it's joining together. \n\n\n1. Internal Arc: is one that has the two circles inside it once it is completed to a full circle");
		textview31.setText("Let's Clarify ourselves with an example \n\n\nExample 6: Two circles, A & B, with Radius 25mm and Radius 35mm respectively, have a distance of 60mm between their centers. Construct an arc of radius 70mm to touch them a) Externally, b) Internally c) Internal to A and External to B\n\nOK, here we go with the solution: \nThe first thing you need to do is to draw a straight line... (seems like that's about the first thing we always do right?)... Draw the straight line and mark out the distance between their centers. ");
		textview33.setText("THE MAJOR THING WE ARE TRYING TO GET IS THE CENTER OF THE ARC... That is, in this case, the center of the arc of R70. To get this, we take the two known centers of the circles as reference points. \n\n\na) External Arc Blending: for an arc to touch two other arcs or circles externally, you ADD their radii...\nIn the example.. \n\nSTEP 1: Add Radius of circle A to the arc : 25 + 70 = 95mm. With this 95mm, place the pinpoint of your compass at the center of circle A, and draw an arc.");
		textview36.setText("b) Internal Arc Blending: for an arc to touch two other arcs or circles internally, you SUBTRACT their radii...\n\nSTEP 1: Subtract Radius of circle A from that of the arc : 70 - 25 = 45mm. Place the pinpoint of your compass at the center of circle A, and draw an arc of 45mm.");
		textview38.setText("Point C is the center of the \"Blending\" arc. \n\nSTEP 3: Place your pinpoint at C and draw an arc of R70 and if you did everything right, there's nothing your lecturer, course rep or village people (OK, no, sorry...these people are very strong, don't joke with them) can do to stop it from touching both of them...Try it out yourself, thank me now. ");
		textview39.setText("In class, I will be revealing some tips and tricks on how to make sure your blend is very, VEERRRY perfect. I won't forget, so be in class, but just in case I do, remind me of this page. \n\n\nc) Inter-Exter Blending Arc: just kidding, there's nothing like this... But then, the question c) above requires the Blending arc to touch the smaller circle internally, and the bigger circle externally... \nWhat does this mean? \nIt simply means we'll add the radii for one circle, and subtract the radii for the other. \nSo, after drawing the straight line and the circles... \n\nSTEP 1: Add Radius of circle A to the arc : 25 + 70 = 95mm. With this 95mm, place the pinpoint of your compass at the center of circle A, and draw an arc.");
		textview44.setText("Ever had a moment you felt on top of the world, but couldn't keep that feeling forever? How would you like to immortalize those wonderful emotions and freeze in time, those ecstatic and happy moments shared with loved ones. Call us now for your State-of-the-art Outdoor photoshoots, or come around for our HD studio pics, bringing out the beauty in every smile. Books us also for your Matriculation and Convocation photos, and you'll be so glad you did. ");
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
