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

public class Past13Activity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private LinearLayout linear35;
	private TextView textview18;
	private WebView webview2;
	private TextView textview3;
	private TextView textview19;
	private ImageView imageview1;
	private TextView textview48;
	private TextView textview20;
	private ImageView imageview2;
	private TextView textview21;
	private TextView textview47;
	private ImageView imageview3;
	private TextView textview22;
	private ImageView imageview4;
	private TextView textview27;
	private ImageView imageview5;
	private TextView textview29;
	private ImageView imageview6;
	private TextView textview31;
	private ImageView imageview7;
	private TextView textview43;
	private TextView textview32;
	private ImageView imageview8;
	private TextView textview30;
	private ImageView imageview9;
	private TextView textview28;
	private ImageView imageview10;
	private TextView textview23;
	private ImageView imageview11;
	private TextView textview24;
	private ImageView imageview12;
	private ImageView imageview13;
	private TextView textview26;
	private WebView webview3;
	private TextView textview37;
	private ImageView imageview14;
	private TextView textview36;
	private ImageView imageview15;
	private TextView textview39;
	private TextView textview44;
	private ImageView imageview17;
	private TextView textview41;
	private ImageView imageview16;
	private TextView textview45;
	private ImageView imageview23;
	private TextView textview46;
	private ImageView imageview24;
	private TextView textview40;
	private ImageView imageview18;
	private TextView textview38;
	private ImageView imageview19;
	private TextView textview35;
	private ImageView imageview20;
	private TextView textview49;
	private TextView textview34;
	private ImageView imageview21;
	private TextView textview33;
	private ImageView imageview22;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.past13);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview18 = (TextView) findViewById(R.id.textview18);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview47 = (TextView) findViewById(R.id.textview47);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview27 = (TextView) findViewById(R.id.textview27);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview26 = (TextView) findViewById(R.id.textview26);
		webview3 = (WebView) findViewById(R.id.webview3);
		webview3.getSettings().setJavaScriptEnabled(true);
		webview3.getSettings().setSupportZoom(true);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview44 = (TextView) findViewById(R.id.textview44);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		textview41 = (TextView) findViewById(R.id.textview41);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		textview45 = (TextView) findViewById(R.id.textview45);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview46 = (TextView) findViewById(R.id.textview46);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		textview40 = (TextView) findViewById(R.id.textview40);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview34 = (TextView) findViewById(R.id.textview34);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		
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
		
		webview3.setWebViewClient(new WebViewClient() {
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
		webview2.loadUrl("file:///android_res/drawable/pq13.jpg");
		webview2.getSettings().setBuiltInZoomControls(true);
		webview2.getSettings().setDisplayZoomControls(false); webview2.getSettings().setLoadWithOverviewMode(true); webview2.getSettings().setUseWideViewPort(true);
		webview2.setVerticalScrollBarEnabled(false);
		webview2.setHorizontalScrollBarEnabled(false);
		webview3.loadUrl("file:///android_res/drawable/pq12.jpg");
		webview3.getSettings().setBuiltInZoomControls(true);
		webview3.getSettings().setDisplayZoomControls(false); webview3.getSettings().setLoadWithOverviewMode(true); webview3.getSettings().setUseWideViewPort(true);
		webview3.setVerticalScrollBarEnabled(false);
		webview3.setHorizontalScrollBarEnabled(false);
		textview22.setText("3a) APPROACH: Q is the center of the circle N (radius 100). Draw the log of wood as a straight line 200cm away from Q. I'll refer to the log as LG (life's good) \nIt's a locus of points with equal distance between N and the log. \n\nSTEP: Bisect the distance between N and the log to get the first point 1. ");
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
