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
import android.webkit.WebView;
import android.webkit.WebSettings;

public class DrawingActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView window3;
	private TextView textview1;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview52;
	private ImageView imageview49;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private TextView textview56;
	private ImageView imageview50;
	private TextView textview57;
	private ImageView imageview51;
	private TextView textview58;
	private WebView webview1;
	private TextView textview59;
	private TextView textview60;
	private TextView textview61;
	private ImageView imageview52;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.drawing);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		window3 = (ScrollView) findViewById(R.id.window3);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview52 = (TextView) findViewById(R.id.textview52);
		imageview49 = (ImageView) findViewById(R.id.imageview49);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		imageview50 = (ImageView) findViewById(R.id.imageview50);
		textview57 = (TextView) findViewById(R.id.textview57);
		imageview51 = (ImageView) findViewById(R.id.imageview51);
		textview58 = (TextView) findViewById(R.id.textview58);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview61 = (TextView) findViewById(R.id.textview61);
		imageview52 = (ImageView) findViewById(R.id.imageview52);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	private void initializeLogic() {
		textview52.setText("Before you get any job done, there are some important, basic stuff you must take care of first. These are \n1. Border lines. \n2. Title blocks. \n\n\n1. Border line: this is the line that serves as a boundary for your entire work. No other line, or diagram... Not even a dot, should cross this boundary. Every drawing must be done inside. The border line has a thickness of 10mm (1cm) from each of the edges of your paper. \n ");
		textview55.setText("STEP 1: Use your compass, take a measurement of 10mm from your ruler. \nSTEP 2: Place the pin point at the corners of the paper and draw an arc. This arc is equal to 10mm/1cm.\nSTEP 3: Draw a straight line joining the arcs as shown, and you get your border line.  ");
		textview56.setText("Remember, as I said, choose the method you like best, and be good at it.\n\n\n\n2. Title Block: this does the same thing as the label on your shirt, or the tag on something you bought. It's the description of your work. Who did it? Who made you do it? When and where did you do it? and many other questions are answered by the title block. \n\nThis is what title blocks look like");
		textview59.setText("What do the the titles mean?\n\n1. FEDERAL UNIVERSITY OF TECHNOLOGY OWERRI—don't ask me what this means, 'cause I won't tell you. There's something I will tell you though...and it's this:\nJust in case your handwriting is too big and you can't fit in the entire name of the school, you can write this instead \nFEDERAL UNI-TECH OWERRI. Apart from this, no other abbreviations are allowed in your title block. \n\n2. TITLE : this is the work you're doing, so you can write \"EXAM\", \"ASSIGNMENT\", \"PRE-LAB\", or \"TEST\", as the case may be.\n\n3. DRAWN BY: Your full name (no nicknames please) and registration number. This is the only place you're permitted to use ink (as in, pen, Biro) in your entire Eng 103 life. \n\n4. CHECKED BY: Your lecturer's name\n\n5. DEPARTMENT: Your department in full... Not PTE, or SST, or BCH. \n\n6. COURSE CODE: of course, ENG 103\n\n7. SCALE: this is a ratio of the length on your paper/the length in real life. For now, just put in 1:1. In class I'll explain to you how and why other values come in. Please, when I come, listen attentively, and don't chew gum, thank you. \n\n8. DATE: I'm sooo NOT explaining this. 😂 \n\n\n\nRemember, and make sure to attend the general, weekly classes, or enroll for the private classes for further, deeper, explanations of all these stuff. \n\n\nSee y'all in the next topic... ");
		textview61.setText("Have you ever tasted something so delicious that it feels like you're on top of the world?\nRonnie's Tasty Edibles(RTE) will give you more than your expectations,that superb taste you want in your cakes,bread and small chops.RTE is an assurance to the sweetness of life and a good taste in every bite.\nOrder yours now and enjoy the sweet taste");
		webview1.loadUrl("data: text/html,\n<html>\n<body>\n<iframe width = \"100%\" height = \"200\" src = \"https://www.youtube.com/embed/FQg6i2MsVm0\" frame border = \"0\"\n</iframe>\n</body>\n</html>");
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
