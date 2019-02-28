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
import android.content.Intent;
import android.net.Uri;
import android.media.SoundPool;
import android.view.View;
import android.graphics.Typeface;

public class TriNCircActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private TextView header;
	private LinearLayout linear4;
	private TextView textview3;
	private TextView textview4;
	private ImageView imageview1;
	private TextView textview5;
	private ImageView imageview2;
	private TextView textview6;
	private ImageView imageview3;
	private TextView textview7;
	private ImageView imageview5;
	private TextView textview8;
	private ImageView imageview36;
	private TextView textview9;
	private ImageView imageview6;
	private TextView textview10;
	private ImageView imageview7;
	private TextView textview11;
	private ImageView imageview8;
	private TextView textview12;
	private ImageView imageview9;
	private TextView textview40;
	private TextView textview13;
	private ImageView imageview10;
	private TextView textview26;
	private ImageView imageview11;
	private TextView textview33;
	private ImageView imageview12;
	private TextView textview39;
	private ImageView imageview13;
	private TextView textview41;
	private ImageView imageview14;
	private ImageView imageview40;
	private TextView textview37;
	private ImageView imageview15;
	private TextView textview36;
	private ImageView imageview16;
	private TextView textview35;
	private ImageView imageview17;
	private TextView textview34;
	private ImageView imageview18;
	private TextView textview32;
	private ImageView imageview19;
	private TextView textview28;
	private ImageView imageview20;
	private TextView textview30;
	private ImageView imageview21;
	private TextView textview31;
	private ImageView imageview22;
	private TextView textview29;
	private ImageView imageview23;
	private TextView textview20;
	private ImageView imageview24;
	private TextView textview24;
	private ImageView imageview25;
	private TextView textview27;
	private ImageView imageview26;
	private ImageView imageview37;
	private TextView textview25;
	private ImageView imageview27;
	private TextView textview23;
	private ImageView imageview28;
	private TextView textview19;
	private ImageView imageview29;
	private TextView textview22;
	private ImageView imageview30;
	private TextView textview21;
	private ImageView imageview31;
	private ImageView imageview38;
	private TextView textview14;
	private ImageView imageview32;
	private TextView textview15;
	private ImageView imageview33;
	private TextView textview16;
	private ImageView imageview34;
	private TextView textview18;
	private ImageView imageview35;
	private ImageView imageview39;
	private Button button1;
	
	private Intent polygons = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tri_n_circ);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		header = (TextView) findViewById(R.id.header);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview36 = (ImageView) findViewById(R.id.imageview36);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview39 = (TextView) findViewById(R.id.textview39);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		imageview40 = (ImageView) findViewById(R.id.imageview40);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview34 = (TextView) findViewById(R.id.textview34);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		imageview37 = (ImageView) findViewById(R.id.imageview37);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		imageview38 = (ImageView) findViewById(R.id.imageview38);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview33 = (ImageView) findViewById(R.id.imageview33);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview35 = (ImageView) findViewById(R.id.imageview35);
		imageview39 = (ImageView) findViewById(R.id.imageview39);
		button1 = (Button) findViewById(R.id.button1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				polygons.setClass(getApplicationContext(), PolygonsActivity.class);
				startActivity(polygons);
			}
		});
	}
	private void initializeLogic() {
		textview4.setText("TRIANGLES\nA triangle is a 3-sided shape with its sum of angles = 180°. These are 3 cases that could come up for construction of a triangle. They are all simple, with 3-step processes\n\nCASE 1: Given 2 sides and 1 included angle. \n\nConstruct a triangle ABC such that AB = 60mm, BC = 65mm and angle B = 75°. Draw the circumscribing circle. \n\nSTEP 1: Draw a line AB = 60mm, and construct 75° on point B. ");
		textview7.setText("The second part is to Draw the circumscribing circle. We'll treat this part shortly, but first:\n\nCASE 2: Given 3 sides. \nConstruct a triangle XYZ such that XY = 70mm, YZ = 50mm, and XZ = 60mm. Draw the Inscribing circle. \n\nSTEP 1: Draw line XY = 70mm and from Y, draw an arc with radius = 50mm (YZ) ");
		textview13.setText("Now, it's time to deal with all those things we've been saying \"shortly, shortly\" since. \n\n••>Drawing a circle outside a triangle to touch all the tips means to Circumscribe. \n\n••>To Inscribe a circle means to draw it INSIDE the given triangle. Let's take two examples:\n\nCASE 1: To circumscribe a circle on any triangle, you need to bisect at least 2 SIDES of the triangle. Let's consider the triangle in case 1 above. \n\nSTEP 1: Bisect any two lines of the triangle ABC. The bisectors will intersect at a point I'll call O. ");
		textview41.setText("N/B: A common problem people have is that the circle may fail to touch one of the sides or angles. The transformation this is because of slight mistakes in measurement. But, I'll reveal a cheat in class which you can use to beat it. Don't miss out guys!\n\n\nExample 3: Construct a Smooth, continuous curve to pass through 5 points. The (x, y)  co-ordinates of the points in centimeters are A(2,5), B(5,7), C(9,5), D(13,5), E(16,7).\nWhenever you need to pass a curve through a number of points, you must first locate the points... \n\nSTEP 1: Make a kind of graph.. With x- and y-axes. This is where you will locate the various points. \nPreferably, let it be to a scale of 1cm to 1unit. ");
		textview34.setText("CIRCLES\n\nYou already know how to draw a circle with your compass. What we'll focus on is dividing the circle into various number of equal parts.\n \nExample 7: Draw a circle of diameter 70mm and divide it into 4, 5, 6, 7, 8, 10 & 12 equal parts.\n\na) 4 equal parts is the easiest. Just draw vertical and horizontal lines through the center of the circle. ");
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
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
