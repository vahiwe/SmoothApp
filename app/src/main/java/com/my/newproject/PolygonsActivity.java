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
import android.graphics.Typeface;

public class PolygonsActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView header;
	private LinearLayout linear2;
	private TextView textview2;
	private TextView textview3;
	private ImageView imageview1;
	private TextView textview4;
	private ImageView imageview2;
	private TextView textview5;
	private ImageView imageview3;
	private TextView textview6;
	private ImageView imageview4;
	private TextView textview7;
	private ImageView imageview5;
	private TextView textview16;
	private ImageView imageview6;
	private TextView textview27;
	private ImageView imageview8;
	private ImageView imageview34;
	private TextView textview33;
	private TextView textview28;
	private ImageView imageview7;
	private TextView textview26;
	private ImageView imageview9;
	private TextView textview32;
	private ImageView imageview10;
	private TextView textview23;
	private ImageView imageview11;
	private TextView textview31;
	private TextView textview30;
	private ImageView imageview12;
	private TextView textview29;
	private ImageView imageview14;
	private TextView textview25;
	private ImageView imageview15;
	private TextView textview24;
	private TextView textview34;
	private TextView textview8;
	private ImageView imageview17;
	private TextView textview22;
	private ImageView imageview19;
	private TextView textview21;
	private ImageView imageview18;
	private ImageView imageview20;
	private TextView textview19;
	private ImageView imageview35;
	private TextView textview20;
	private ImageView imageview21;
	private TextView textview35;
	private TextView textview17;
	private ImageView imageview22;
	private TextView textview18;
	private ImageView imageview23;
	private TextView textview9;
	private ImageView imageview24;
	private TextView textview10;
	private ImageView imageview26;
	private TextView textview14;
	private ImageView imageview25;
	private TextView textview15;
	private ImageView imageview27;
	private TextView textview11;
	private ImageView imageview29;
	private TextView textview12;
	private ImageView imageview28;
	private TextView textview13;
	private ImageView imageview31;
	private TextView textview36;
	private ImageView imageview30;
	private TextView textview38;
	private ImageView imageview32;
	private TextView textview39;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.polygons);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		header = (TextView) findViewById(R.id.header);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview35 = (ImageView) findViewById(R.id.imageview35);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview35 = (TextView) findViewById(R.id.textview35);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		textview39 = (TextView) findViewById(R.id.textview39);
	}
	private void initializeLogic() {
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		textview3.setText("OK, not to scare you, but this is the most tedious part. Listen properly. \n\nA polygon is a shape with 5 or more sides.\nIn case you didn't know:\nPentagon ➡️5 sides\nHexagon ➡️6 sides\nHeptagon ➡️7 sides\nOctagon ➡️8 sides\nNonagon ➡️ 9 sides \nDecagon ➡️ 10 sides\n\nNow, you can be asked to construct a polygon when:\n••Given the length of the side, or when \n••Given the dimension of the circle in which it fits. \n\nNow, in case you're asked to inscribe a pentagon inside a circle of radius, say, 25mm... What you can simply do is to draw the circle of diameter = 50mm, divide it into 5 equal parts (like we learnt about in the previous section), then join the points together as shown below.");
		textview28.setText("Example 9: Draw a pentagon and heptagon of the same base, given the length of the side = 40mm. \n\nThe method we'll consider now is applicable when the length of the side of the polygon is given. It can be used for any number of sides.\n \nSTEP 1: draw a straight line, mark AB = 40mm");
		textview8.setText("I called the hexagon special because I like the number 6...its a cute number. \nOK, on a serious note now, the hexagon possesses a very special property. \nYou could be given the diameter of the hexagon in two ways:\n\n1. Diameter A/F (Across flats), that is the diameter between the sides of the shape. ");
		textview20.setText("Now, for hexagons A/C, the radius of the circle is equal to the length of the side. That's a fact. So, in this case, what's the length of the side? Yes...30mm. \nSo, draw the circle and the center lines; divide it into 6 equal parts, and there—you have your hexagon.");
		textview17.setText("This section is all about inscribing a number of circles inside a given polygon. There are two categories:\n\n1. Circles touching each other and ONE side of the polygon:\nExample 10: Construct a hexagon of 70mm A/C and inscribe 6 equal circles, each one touching two other circles and one side of the hexagon.\n\nIt works with the principle of inscribing a circle in a triangle. So, we are trying divide the polygon into triangles, then put a circle in each one.\n\nSTEP 1: Draw the circle of diameter 70mm and divide into 6 equal parts to get the needed hexagon. You can see, it looks like 6 triangles here.");
		textview11.setText("2. Circles touching each other and TWO sides of the polygon. \nExample 11: Construct a hexagon of 70mm A/C and inscribe 6 equal circles, each one touching two other circles and two sides of the hexagon.\n\nIt's pretty much like the former case, but now, we'll concentrate on the kite shape instead of the triangle shape. \n\nSTEP 1: Draw the hexagon and draw 12 equal dividing lines. \nRemember, we're focusing on the kites.");
		textview39.setText("Now, note this importantly: it is not enough to just read all these stuff or listen in class alone...you need to make out time to practice... \n\nSome of y'all be like \"This is just a 1 unit course\" but don't be like that...\n\n It's the small things sometimes that can fall your hand in the future...\nSo, don't disrespect this course and it won't disrespect your G.P.\n\nSee you in the next topic.");
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
