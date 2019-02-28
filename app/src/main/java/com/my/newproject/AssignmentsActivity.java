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
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.media.SoundPool;
import android.view.View;
import android.graphics.Typeface;

public class AssignmentsActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView vscroll7;
	private TextView header;
	private LinearLayout linear9;
	private TextView textview1;
	private Button button1;
	private Button button2;
	private Button button4;
	private LinearLayout win1;
	private LinearLayout win2;
	private TextView textview5;
	private TextView textview2;
	private WebView webview1;
	private TextView textview4;
	private TextView textview6;
	private TextView textview7;
	private ImageView imageview1;
	private TextView textview8;
	private ImageView imageview2;
	private TextView textview9;
	private ImageView imageview3;
	private TextView textview10;
	private ImageView imageview4;
	private TextView textview11;
	private ImageView imageview5;
	private TextView textview12;
	private ImageView imageview6;
	private TextView textview13;
	private ImageView imageview7;
	private TextView textview14;
	private ImageView imageview8;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private ImageView imageview9;
	private TextView textview18;
	private ImageView imageview10;
	private TextView textview19;
	private ImageView imageview11;
	private TextView textview20;
	private TextView textview21;
	private ImageView imageview12;
	private TextView textview22;
	private ImageView imageview13;
	private TextView textview23;
	private ImageView imageview14;
	private TextView textview24;
	private ImageView imageview15;
	
	private Intent three = new Intent();
	private Intent two = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.assignments);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll7 = (ScrollView) findViewById(R.id.vscroll7);
		header = (TextView) findViewById(R.id.header);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview1 = (TextView) findViewById(R.id.textview1);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button4 = (Button) findViewById(R.id.button4);
		win1 = (LinearLayout) findViewById(R.id.win1);
		win2 = (LinearLayout) findViewById(R.id.win2);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview2 = (TextView) findViewById(R.id.textview2);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview24 = (TextView) findViewById(R.id.textview24);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				win1.setVisibility(View.VISIBLE);
				win2.setVisibility(View.VISIBLE);
				linear9.setVisibility(View.VISIBLE);
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				two.setClass(getApplicationContext(), AssignScalesActivity.class);
				startActivity(two);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				three.setClass(getApplicationContext(), AssignCrankActivity.class);
				startActivity(three);
			}
		});
		
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
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		linear9.setVisibility(View.VISIBLE);
		win1.setVisibility(View.GONE);
		win2.setVisibility(View.GONE);
		click = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		s1 = click.load(getApplicationContext(), R.raw.click, 1);
		webview1.loadUrl("data: text/html,\n<html>\n<body>\n<iframe width = \"100%\" height = \"200\" src = \"https://www.youtube.com/embed/608vVh2T0mo\" frame border = \"0\"\n</iframe>\n</body>\n</html>");
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
