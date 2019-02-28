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
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.media.SoundPool;
import android.view.View;
import android.graphics.Typeface;

public class GeometricActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private HorizontalScrollView hscroll1;
	private TextView textview1;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview2;
	private ImageView imageview1;
	private TextView textview16;
	private TextView textview14;
	private TextView textview15;
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
	private ImageView imageview10;
	private TextView textview12;
	private Button button1;
	private Button button2;
	private TextView textview17;
	private TextView textview18;
	private ImageView imageview11;
	private LinearLayout linear2;
	private ScrollView win1;
	private ScrollView win2;
	private ScrollView win3;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	
	private Intent triangles = new Intent();
	private Intent polygons = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.geometric);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
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
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview12 = (TextView) findViewById(R.id.textview12);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		win1 = (ScrollView) findViewById(R.id.win1);
		win2 = (ScrollView) findViewById(R.id.win2);
		win3 = (ScrollView) findViewById(R.id.win3);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				triangles.setClass(getApplicationContext(), TriNCircActivity.class);
				startActivity(triangles);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				polygons.setClass(getApplicationContext(), PolygonsActivity.class);
				startActivity(polygons);
			}
		});
	}
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		textview2.setText("Now, this is the topic with one of the most random features. You'll know why as we go on. So many things to pay attention to, but as we go step by step, I'm absolutely sure you'll get it all right. I've divided it up into 4 sections for better grasping: Angles, Triangles, Circles, and Polygons. Follow it up IN THIS ORDER for best results. \n\n\nAngles \n\nWe've already spoken about this a bit. In the IMPORTANT BASICS section, we learned how to construct some basic angles, now we'll take it a step further. We'll be considering these kind of angles: 67½°, 75°,  52½°,  146¼°,  135°, 157½°, 56¼°, 33¾°, 105°.\n\nNow, remember we learnt the construction of two basic angles: 90° & 60°. Any other angle you're ever asked to construct will be a combination of at least two divisions of either of them. \n\nLook at this table:");
		textview14.setText("You already know how to bisect an angle. Every angle you are asked for will definitely be a combination of two of the bisected angles. For instance, to get angle 75°, we combine angles 45 and 30. How?  Bisect 60 once, you get 30; Bisect 90 once, you get 45. 45 + 30 = 75.");
		textview3.setText("Combination of angles for construction is quite simple and straight forward. Though, from my experience, the major area students have issues is knowing which particular ones to combine. For you, that problem ends now! \n\nListen good, no one else will tell you this... \n\nNo matter what you're asked, watch out for these 3 endings: \n•>> 5\n•>> ½\n•>> ¼ or ¾ (anything over 4)\n\nIf the angle ends in 5, just subtract 45° from it. For instance :\n•Angle 75° consists of 45 and 30\n•Angle 105° consists of 45 and 60\n•Angle 135° consists of 45 and 90\n\nIf the angle ends in ½, just subtract 22½° from it. \n•Angle 52½° consists of 22½ and 30\n•Angle 67½° consists of 22½ and 45\n•Angle 157½° consists of 22½ and 135 (45 + 90)\n\nIf the angle ends in ¼, just subtract 11¼° from it. \n•Angle 33¾° is made up from 11¼ + 22½\n•Angle 56¼ comprises 11¼ and 45\n•Angle 146¼ is made up from 11¼ + 135 (45 + 90)\n\nOne thing to note is this: any angle you construct must be perfectly rested in the horizontal plane like:");
		textview5.setText("Never, EVER in your ENG 103 life should you do this nonsense 😂. \n\nI'll treat 3 examples here, and you can practice with the rest. \n\nExample 1: 75°...we've established that this is a combination of 45 and 30. You can choose to get anyone first. I choose 30.\n\nSTEP 1: Construct 60° and bisect it to get 30.");
		textview7.setText("\nNotice the way I placed the 90. Not on the original horizontal line. But the first angle (30°) acted as my new base. \nSo, we've successfully added 30 to 45.\n\nExample 2: 67½...this comprises 22½ and 45.\n\nSTEP 1: Construct 90° and bisect it to get 45°");
		click = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		s1 = click.load(getApplicationContext(), R.raw.click, 1);
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
