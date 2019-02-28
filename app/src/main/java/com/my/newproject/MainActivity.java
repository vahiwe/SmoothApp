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
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.media.SoundPool;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private double s1 = 0;
	
	private LinearLayout linear2;
	private Button topics_;
	private Button pastqtns;
	private Button assignments;
	private Button testimonies;
	private Button vipsection;
	private Button premiun;
	
	private Intent topics = new Intent();
	private Intent testimonies_ = new Intent();
	private Intent load_ = new Intent();
	private AlertDialog.Builder exit_;
	private Intent premium_ = new Intent();
	private Intent vip = new Intent();
	private Intent pastqs = new Intent();
	private Intent assignment = new Intent();
	private Intent lecturer = new Intent();
	private SharedPreferences smooth1;
	private SharedPreferences smooth;
	private SoundPool click;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		topics_ = (Button) findViewById(R.id.topics_);
		pastqtns = (Button) findViewById(R.id.pastqtns);
		assignments = (Button) findViewById(R.id.assignments);
		testimonies = (Button) findViewById(R.id.testimonies);
		vipsection = (Button) findViewById(R.id.vipsection);
		premiun = (Button) findViewById(R.id.premiun);
		exit_ = new AlertDialog.Builder(this);
		smooth1 = getSharedPreferences("override", Activity.MODE_PRIVATE);
		smooth = getSharedPreferences("pass", Activity.MODE_PRIVATE);
		
		topics_.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				topics.setClass(getApplicationContext(), TopicsActivity.class);
				startActivity(topics);
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
			}
		});
		
		pastqtns.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					pastqs.setClass(getApplicationContext(), PastqsActivity.class);
					startActivity(pastqs);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						pastqs.setClass(getApplicationContext(), PastqsActivity.class);
						startActivity(pastqs);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Please upgrade to enjoy this feature ");
					}
				}
			}
		});
		
		assignments.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				if (smooth.getString("code", "").equals("Correct pin")) {
					assignment.setClass(getApplicationContext(), AssignmentsActivity.class);
					startActivity(assignment);
				}
				else {
					if (smooth1.getString("over", "").equals("Sm00th1095")) {
						assignment.setClass(getApplicationContext(), AssignmentsActivity.class);
						startActivity(assignment);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "Please upgrade to enjoy this feature ");
					}
				}
			}
		});
		
		testimonies.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				testimonies_.setClass(getApplicationContext(), TestimoniesActivity.class);
				startActivity(testimonies_);
			}
		});
		
		vipsection.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				vip.setClass(getApplicationContext(), VipActivity.class);
				startActivity(vip);
			}
		});
		
		premiun.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				s1 = click.play((int)(1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
				premium_.setClass(getApplicationContext(), UnlockActivity.class);
				startActivity(premium_);
			}
		});
	}
	private void initializeLogic() {
		load_.setClass(getApplicationContext(), LoadingActivity.class);
		startActivity(load_);
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
	
	@Override
	public void onBackPressed() {
		exit_.setTitle("Exit");
		exit_.setMessage("Are you tired already?");
		exit_.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ehya ");
				finishAffinity ();
			}
		});
		exit_.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "Sharp! 👍 One Okpa for you... ");
			}
		});
		exit_.create().show();
	}
	private void _Edittext () {
		
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
