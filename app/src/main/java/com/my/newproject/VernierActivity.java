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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;

public class VernierActivity extends AppCompatActivity {
	
	
	private ArrayList<String> scales = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView header;
	private Spinner spinner1;
	private LinearLayout linear2;
	private TextView textview2;
	private ImageView imageview1;
	private TextView textview3;
	private ImageView imageview2;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	private ImageView imageview4;
	private TextView textview12;
	private TextView textview6;
	private ImageView imageview5;
	private TextView textview7;
	private WebView webview1;
	private TextView textview8;
	private ImageView imageview6;
	private TextView textview9;
	private ImageView imageview7;
	private TextView textview10;
	private ImageView imageview8;
	private TextView textview11;
	
	private Intent types = new Intent();
	private Intent linear = new Intent();
	private Intent diagonal = new Intent();
	private Intent comparative = new Intent();
	private Intent chords = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.vernier);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		header = (TextView) findViewById(R.id.header);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview7 = (TextView) findViewById(R.id.textview7);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview11 = (TextView) findViewById(R.id.textview11);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (spinner1.getSelectedItemPosition() == 0) {
					
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					types.setClass(getApplicationContext(), ScalesActivity.class);
					startActivity(types);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					linear.setClass(getApplicationContext(), LinearActivity.class);
					startActivity(linear);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					diagonal.setClass(getApplicationContext(), DiagonalActivity.class);
					startActivity(diagonal);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 4) {
					comparative.setClass(getApplicationContext(), ComparativeActivity.class);
					startActivity(comparative);
					finish();
				}
				if (spinner1.getSelectedItemPosition() == 5) {
					chords.setClass(getApplicationContext(), ScaleOfChordsActivity.class);
					startActivity(chords);
					finish();
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
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
		scales.add("");
		scales.add("<< BACK");
		scales.add("Linear/Plain Scale");
		scales.add("Diagonal Scale");
		scales.add("Comparative Scales");
		scales.add("Scale of Chords");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, scales));
		textview2.setText("So we're moving on, and you need to pay more attention here:\n\n This scale is similar to the diagonal scale in the following ways:\n\n••They both measure up to 3 units\n••They can show up to 2dp(hence greater accuracy)\n ••The difference lies in the method of reading the scale and also construction. So, let's consider the same example:\n\n\n\nExample 4: The distance between two villages, 10km apart on a map is 20 cm. Construct a scale showing Km, Hm & Dm to measure up to 8km. Mark the following distances on the scale:\na) 5.73km  b) 3.27km  c) 0.18km\n\nAs usual, first of all, determine the 3 parameters :\n•RF: distance on paper to distance on land, thus:\n20cm/10km = 1:50000 just like in the previous example. \n•ML: 8km\nLOS: RF x ML = 1/50000 x 800000\n= 16cm\n\n\nSTEP 1: Draw a line of length = 16cm");
		textview6.setText("The secondary divisions were done in tens( as you saw in step 4). It was like you divided \"100 of something\" into 10 equal parts and it gave you 10, 20, 30,...etc. \n\nFor our 3rd division this evening (it was evening when I typed this, I don't care what it is in your side now, leave it for me 😂), we need ELEVENS (or elevenths or elevents... Thank goodness this is not GST). \nListen well now, and see what you'll do :\n\nSTEP 5a: Extend the top line\n\nSTEP 5b: With your compass, take one of the 10 divisions and add it on the newly extended line. \nNow, you can beat your chest (or whatever) and say we have \"110 of something\" (why? because you just added an extra 10 to the 100 we already had before, making 110)\n\n\n\n\nNOW, YOU SEE WHY ENGINEERING DRAWING IS GOOD FOR YOUR BRAIN? WE'VE INCORPORATED GST(The elevenths/elevents saga) and serious MTH(LOS and RF calculations) ALREADY, EVEN BIOLOGY(when I said \"Beat your Chest\") IT JUST REMAINS CHM AND PHY...IF YOU DONT BELIEVE ME, ARGUE WITH YOUR COURSE ADVISER...\n\n\nSTEP 5c: Divide this new portion into 10 equal parts. This means you now have 11ths (I'm on the safe side with the GST).\n\nSo,  of course, you label them 11, 22, 33, 44, 55, etc. ");
		textview8.setText("STEP 6: At  this stage, you're done with all the drawings and what's left is to mark out the required distances. Please listen---sorry, READ very carefully:\n\na) 5.73Km : this gives 5Km, 7Hm and 3Dm. \n\nHere's how to go about it. In all cases, you take the last decimal, double it and subtract from the original...What do I mean?\n\n\n>Step 6a: take the last decimal from 5.73 👉 \"3\"\n>Step 6b: Double it 👉 0.33\n>Step 6c: Subtract from the original 👉 5.73 - 0.33 = 5.40\n\nWhat does this tell us? This small MTH101 we did tells us that 5.73 is a combination of 5.40 and 0.33.\n\nLet's try other cases... If we were asked to find, for example, 6.42\n\n>Step 6a: take the last decimal from 6.42 👉 \"2\"\n>Step 6b: Double it 👉 0.22\n>Step 6c: Subtract from the original 👉 6.42 - 0.22 = 6.20\nTherefore, 6.42 is a combination of 6.20 and 0.22\n\nOne last time, and try to solve alongside with me this time... \nIf we were asked 3.85\n\n>Step 6a: take the last decimal from 3.85 👉 \"5\"\n>Step 6b: Double it 👉 0.55\n>Step 6c: Subtract from the original 👉 3.85 - 0.55 = 3.30\nTherefore, 3.85 is a combination of 3.30 and 0.55\n\nYou've got it right? Right.\n \nNow, let's get back to our original problem. 5.73.\n\n So, what we're going to do on the scale is we'll actually show both 5.40 and 0.33 together. \n\nYou can read 0.33 from the Vernier part; \n\nFor 5.40, it's found in the Km part between 5Km and 6Km .\n\nSo, we (please, don't cry or scream at this point) divide that part into 10 equal portions... These are 5.10, 5.20, 5.30km...etc all we need to do now is mark the 5.40 part and we're done. ");
		textview9.setText("b) 3.27\n\n>Step 6a: take the last decimal from 3.27 👉 \"7\"\n>Step 6b: Double it 👉 0.77\n>Step 6c: Subtract from the original 👉 3.27 - 0.77 = 2.50\n\nTherefore, 3.27 is a combination of 2.50 + 0.77\n\nSo, read 0.77 from the Vernier part\nThen, for the 2.50, you get it between 2km and 3km. As shown:");
		textview10.setText("Finally, because even me sef I'm tired:\n\n(c) 0.18Km: In this case, we have a different scenario... Watch and see 👇 \n\n>Step 6a: take the last decimal from 0.18 👉 \"8\"\n>Step 6b: Double it 👉 0.88\n>Step 6c: Subtract from the original 👉 0.18 - 0.88 = -0.70\n\nTherefore, 0.18 is a combination of 0.88 - 0.70 (Please, confirm this before you start arguing...do the math carefully)\n\n\nSo, we need to get 0.88 and REMOVE (not add this time) 0.70 from it... Look at the diagram below:");
		textview11.setText("NOTE: Any question given on diagonal scales can be answered using a vernier scale, and vice versa, because they both show 3 units. \n\nBut please, for safety and health reasons... Unless Vernier scale was Specifically asked for, Abeg, just use diagonal scale for any 3-unit questions. \nOf course, unless you want to \"form oga\" and \"claim boss\" and show yourself to your lecturer, remember, he will also show himself when marking you. So take things easy and get your A in peace. ");
		webview1.loadUrl("data: text/html,\n<html>\n<body>\n<iframe width = \"100%\" height = \"200\" src = \"https://www.youtube.com/embed/RViXIrKv39c\" frame border = \"0\"\n</iframe>\n</body>\n</html>");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		SketchwareUtil.showMessage(getApplicationContext(), "Click the three dots at the top right corner");
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
