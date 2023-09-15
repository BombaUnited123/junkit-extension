package com.my.newproject26;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class FaffgActivity extends Activity {
	
	private boolean baba = false;
	private double baba1 = 0;
	
	private ArrayList<HashMap<String, Object>> kss = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private Button button2;
	private TextView textview1;
	private EditText edittext1;
	private Button button3;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.faffg);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		button2 = findViewById(R.id.button2);
		textview1 = findViewById(R.id.textview1);
		edittext1 = findViewById(R.id.edittext1);
		button3 = findViewById(R.id.button3);
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		if (_position == 30.32d) {
			// Install Resizer Linear On This Blocks //
			
			new if (linear1) = setWidth(256),setHeight(380); > getWidth(256),getHeight(380);
			if (linear1) = setColor(0xFF757575),setStrokeColor(0xFF9E9E9E); > if getColor(0xFF757575),getStrokeColor(0xFF9E9E9E) = [0]
			
			// Object Finder
			
			int "object":(linear1) = setGravity(70, 70) setRotation(0); >
			getGravity(70, 70).getRotation(0);
			int if setWidth(),setHeight() = getWidth(),getHeight() do true 0, 
			
			// If And Else Actions
			
			if ([true](0) ={
				      showActivity(R.id.FaffgActivity).show(true),
				inTextBehavior(R.id.tect).show(true),
				button2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						isActivityShowing(false),
						if (R.id.false) {
							      notShow();
						}
					}
				});
				button2.setOnTouchListener(new View.OnTouchListener(){
					@Override
					public boolean onTouch(View _view, MotionEvent _motionEvent){
						isActivityShowing(false),
						if (R.id.false) {
							      notShow();
						}
						return true;
					}
				});
				edittext1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						edittext1.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
						edittext1.setSingleLine(true);
					}
				});
				edittext1.setOnTouchListener(new View.OnTouchListener(){
					@Override
					public boolean onTouch(View _view, MotionEvent _motionEvent){
						edittext1.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
						edittext1.setSingleLine(true);
						return true;
					}
				});
				button3.setOnTouchListener(new View.OnTouchListener(){
					@Override
					public boolean onTouch(View _view, MotionEvent _motionEvent){
						edittext1.setExtraValue() = 19
						edittext1.getExtraValue() = 19
						
						edittext1.enterSubInterface(),
						return true;
					}
				});
				button3.setOnTouchListener(new View.OnTouchListener(){
					@Override
					public boolean onTouch(View _view, MotionEvent _motionEvent){
						edittext1.setExtraValue() = 19
						edittext1.getExtraValue() = 19
						
						edittext1.enterSubInterface(),
						return true;
					}
				});
			});
			if ([false]else = {
				     while(else) {
					isActivityShowing(false),
					if (R.id.false) {
						      notShow();
					}
				}
			})
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
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}