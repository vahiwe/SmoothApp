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
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.graphics.Typeface;

public class CrankActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView textview2;
	private WebView webview1;
	private TextView textview3;
	private ImageView imageview1;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	private ImageView imageview2;
	private TextView textview6;
	private ImageView imageview4;
	private TextView textview7;
	private ImageView imageview5;
	private TextView textview8;
	private ImageView imageview6;
	private TextView textview9;
	private ImageView imageview7;
	private TextView textview10;
	private ImageView imageview8;
	private TextView textview11;
	private ImageView imageview10;
	private TextView textview12;
	private ImageView imageview11;
	private TextView textview13;
	private ImageView imageview12;
	private TextView textview14;
	private ImageView imageview13;
	private TextView textview15;
	private ImageView imageview14;
	private TextView textview16;
	private ImageView imageview15;
	private TextView textview17;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.crank);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview17 = (TextView) findViewById(R.id.textview17);
		
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
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		textview2.setText("Alright, \"You Don make am! \" you're finally at the end.  And if you've been understanding up until this point, which I know you have, Congrats. \n\nThis topic—the last—is very straightforward in a \"corner-corner\" way.\n If you understood the concept of Locus of a point, then you're good to go. If you didn't, go back to the previous topic, read it up, then get back to me when you're done.\n\n\nIn most machines, we have parts that move in a very repetitive way: rods, shafts, pistons and rings (in engines), etc. This topic is just mainly about drawing a Locus of the points traced by the movements of these parts.\n\n\nFor instance, look at the rod and shaft in the short clip below:");
		textview4.setText("If you look at that point, you'll see that it's going round and round and round. \nThat's what's this topic is all about...Drawing the path traced by the point. \n\nLet's take an example. Abeg, don't let anyone put fear in you oh! \n\n\nExample 1: The rod AB is connected to a shaft OA that rotates clockwise. This causes the rod to oscillate back and forth on a gauge. Trace the locus of the point P on the rod for one revolution of the shaft, given that");
		textview11.setText("Told Ya! It's quite straight forward. Now, we'll just consider two more examples. \n\nFor more questions on this, check out the ASSIGNMENTS section of this app. \n\n\n\nExample 2:In the given mechanism below, the crank OA revolves anti-clockwise about O. The end B of the rod AB is constrained to move always along PQ. Plot the locus of R for one revolution of OA if OA is 30 cm, AB is 105 cm and AR is 70 cm Scale 1 mm to 1cm. ");
		webview1.loadUrl("data: text/html,\n<html>\n<body>\n<iframe width = \"100%\" height = \"\" src = \"https://www.youtube.com/embed/XG9qh8n8NLQ\" frame border = \"0\"\n</iframe>\n</body>\n</html>");
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
