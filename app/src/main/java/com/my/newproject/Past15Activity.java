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

public class Past15Activity extends AppCompatActivity {
	
	
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear3;
	private TextView textview2;
	private WebView webview1;
	private TextView textview3;
	private TextView textview4;
	private ImageView imageview1;
	private TextView textview31;
	private TextView textview5;
	private ImageView imageview2;
	private TextView textview6;
	private ImageView imageview3;
	private TextView textview7;
	private ImageView imageview4;
	private TextView textview8;
	private ImageView imageview5;
	private TextView textview9;
	private ImageView imageview6;
	private TextView textview10;
	private ImageView imageview7;
	private TextView textview11;
	private ImageView imageview8;
	private TextView textview16;
	private ImageView imageview9;
	private TextView textview12;
	private ImageView imageview10;
	private TextView textview13;
	private ImageView imageview11;
	private TextView textview14;
	private ImageView imageview12;
	private TextView textview32;
	private TextView textview15;
	private ImageView imageview13;
	private TextView textview18;
	private WebView webview2;
	private TextView textview23;
	private TextView textview22;
	private ImageView imageview14;
	private TextView textview21;
	private ImageView imageview15;
	private TextView textview27;
	private TextView textview25;
	private ImageView imageview16;
	private TextView textview28;
	private TextView textview19;
	private TextView textview29;
	private ImageView imageview17;
	private TextView textview30;
	private ImageView imageview21;
	private TextView textview20;
	private ImageView imageview20;
	private TextView textview24;
	private ImageView imageview19;
	private TextView textview17;
	private ImageView imageview18;
	private TextView textview26;
	private ImageView imageview22;
	private ImageView imageview23;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.past15);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview2 = (TextView) findViewById(R.id.textview2);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview32 = (TextView) findViewById(R.id.textview32);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview18 = (TextView) findViewById(R.id.textview18);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		
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
		
		webview2.setWebViewClient(new WebViewClient() {
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
		webview1.loadUrl("file:///android_res/drawable/pq15.jpg");
		webview1.getSettings().setBuiltInZoomControls(true);
		webview1.getSettings().setDisplayZoomControls(false); webview1.getSettings().setLoadWithOverviewMode(true); webview1.getSettings().setUseWideViewPort(true);
		webview1.setVerticalScrollBarEnabled(false);
		webview1.setHorizontalScrollBarEnabled(false);
		textview16.setText("\n5. APPROACH:\nDivide the cranks into 12.\nWahala on ground: All lengths are given apart from BC. From my workings, BC = 200mm. To get BC, here's what you do 👇 \nWe're tryna kinda gonna wanna use direct measurement. You can see the point I labeled 11 in the diagram; from the set up, the rod passes through point 11. You know AC = 125mm.\n\nSTEP: Place your compass on the initial A (at 1), and draw an arc of 125mm. Draw a line AC = 125mm to pass through 11.");
		webview2.loadUrl("file:///android_res/drawable/pq14.jpg");
		webview2.getSettings().setBuiltInZoomControls(true);
		webview2.getSettings().setDisplayZoomControls(false); webview2.getSettings().setLoadWithOverviewMode(true); webview2.getSettings().setUseWideViewPort(true);
		webview2.setVerticalScrollBarEnabled(false);
		webview2.setHorizontalScrollBarEnabled(false);
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
