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
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.media.SoundPool;
import android.view.View;
import android.graphics.Typeface;

public class ImportantBasicsActivity extends AppCompatActivity {
	
	
	private double s1 = 0;
	
	private LinearLayout linear1;
	private ScrollView window1;
	private TextView header;
	private LinearLayout linear4;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private ImageView imageview1;
	private TextView textview6;
	private ImageView imageview2;
	private TextView textview7;
	private ImageView imageview3;
	private TextView textview8;
	private ImageView imageview4;
	private TextView textview9;
	private ImageView imageview5;
	private TextView textview10;
	private ImageView imageview11;
	private ImageView imageview10;
	private TextView textview11;
	private ImageView imageview7;
	private TextView textview12;
	private LinearLayout linear7;
	private ImageView imageview14;
	private TextView textview13;
	private WebView webview1;
	private TextView textview14;
	private WebView webview2;
	private TextView textview17;
	private ImageView imageview9;
	private TextView textview15;
	private ImageView imageview15;
	private Button open2;
	private TextView textview16;
	private Button open3;
	private ImageView imageview12;
	private ImageView imageview13;
	
	private Intent bac = new Intent();
	private Intent basics = new Intent();
	private Intent drawing = new Intent();
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.important_basics);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		window1 = (ScrollView) findViewById(R.id.window1);
		header = (TextView) findViewById(R.id.header);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		textview13 = (TextView) findViewById(R.id.textview13);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview14 = (TextView) findViewById(R.id.textview14);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		open2 = (Button) findViewById(R.id.open2);
		textview16 = (TextView) findViewById(R.id.textview16);
		open3 = (Button) findViewById(R.id.open3);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		
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
		
		open2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = 0;
				basics.setClass(getApplicationContext(), BasicsActivity.class);
				startActivity(basics);
			}
		});
		
		open3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = 0;
				drawing.setClass(getApplicationContext(), DrawingActivity.class);
				startActivity(drawing);
			}
		});
	}
	private void initializeLogic() {
		header.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/xcelsion.ttf"), 0);
		textview1.setText("Welcome to the first section.\n\nI guess you might pretty-much be wondering \"What could be so important to know? \" Yeah. But for most of us who didn't do Technical Drawing (TD) in Secondary school, this information would be very helpful as you embark on your two-semester engineering drawing journey. For the remaining few who actually did TD before now, you all will nevertheless pick up one or two from here,  so fasten your seat belts and let's get rolling!");
		textview3.setText("This is an extremely important and comprehensive list of all the necessary drawing instruments you would be needing :\n\n1. Drawing Board\n2. Tee Square\n3. Drawing Sheets\n4. Rotring Set\n5. Set Squares\n6. French Curves\n7. Money");
		textview7.setText("Most people don't know, but this is one of the most important ones. It has about 3 uses:\nHow would it look like if you walked into your lecture hall one day and the board was set diagonally instead of the usual horizontal way? It would really get you distracted. \n•Now,  your T-square helps in alignment of your work : it ensures your drawings don't look crooked or bent, scattered or out of position relative to each other.\n•Secondly, the T-square is used to draw horizontal lines. ANY KIND OF HORIZONTAL LINE REQUIRED IN YOUR DRAWING SHOULD, AS MUCH AS POSSIBLE, BE DRAWN WITH YOUR T-SQUARE. \n•Finally, the T-square serves as a base for all other instruments. You'll understand this point better later on. \n\n\n3. Drawing sheets to be used are A2 or white Cardboard sheets as required by your lecturer. They are to be taped to the drawing board at the four corners. \n\n\n4. Rotring Set: This set is much more preferable and let's you work faster and neater than the other folks still using ordinary Maths Sets(of course  I'm sure you know neatness increase) your marks too).");
		textview8.setText("\nIt contains :\n\na) Rotring pencil: better than an ordinary pencil because\nYou can keep drawing thin lines without having to sharpen again and again(so, you work faster, because you and I know sharpening is a waste of time) \nIt has an eraser here too(i bet most of y'all didn't know this)");
		textview11.setText("\nSo,  if I want to draw a circle of diameter 40mm, I open my compass to 20mm on my ruler. \nIf I want to draw a circle of Diameter 3cm,  I open my compass to 1.5cm on my ruler. \nIf I want to draw a circle or arc of RADIUS 35mm,  I open my compass to what on my ruler? Yes,  that's right: 35mm (because it's radius and not diameter)\n\n\n\nc) Refills : these are containers with extra lead for your pencil");
		textview13.setText("They can do a whole lot of things for you:\n\n1. Vertical lines: remember I said the T-square draws horizontal lines? Now, you can draw vertical lines down the side of the set squares as shown. But make sure it's resting on your T-square (for alignment)\n\n2. Angles: Your set squares can get some specific angles very naturally. Let's take an example \n\n\nExample 1.1. Using set squares only, draw the following angles: a) 60° b) 30° c) 45° d) 75° e) 105° f) 120° g) 135° h) 150°\nThese angles can be easily achieved by simply drawing along the edge of the set-square that has the required angle. For instance, \n60° is gotten from drawing along the side of the 60° set-square \n30° is gotten from drawing along the side of the 30° set-square \n45° is gotten from drawing along the side of the 45° set-square \nSome other angles are gotten by combining two angles from two set-squares:\n75° is a combination of 30° and 45°\n105° is a combination of 60° and 45°\n135° is a combination of 90° and 45°\n120° is a combination of 90° and 30°\n150° is a combination of 90° and 60°\n\nThe short clip below will illustrate how the set-squares are arranged to achieve this: ");
		textview14.setText("\n3. Drawing Parrallel lines: To draw a •Parrallel line,  you need 4 things:\n•The Origin(the original line you want to duplicate)\n•The Destination(s)(the point(s) at which you want to draw the new,  duplicate line(s) )\n•A base\n•Of course,  your Set Square \n\nSTEPS: \n...Align one side of your set-square to the Origin. \n...Place your base (either your T-square, ruler,  or another set-square) on another side. \n...Slide your set-square along the base until you get to the Destination(s). \n...Draw along the set-square and Voila! You've gotten your lines. ");
		webview1.loadUrl("data: text/html,\n<html>\n<body>\n<iframe width = \"100%\" height = \"\" src = \"https://www.youtube.com/embed/SOtVZsR8llQ\" frame border = \"0\"\n</iframe>\n</body>\n</html>");
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
