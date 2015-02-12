package com.example.bai5;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity implements
		OnCheckedChangeListener {
	TextView tvTB;
	EditText etUser, etPass;
	Button bt;
	CheckBox cb1, cb2;
	RadioButton rb1, rb2, rb3;
	ToggleButton tb;
	Switch switchBt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etUser = (EditText) findViewById(R.id.etUser);
		etPass = (EditText) findViewById(R.id.etPass);
		bt = (Button) findViewById(R.id.button1);
		cb1 = (CheckBox) findViewById(R.id.checkBox1);
		cb2 = (CheckBox) findViewById(R.id.checkBox2);
		rb1 = (RadioButton) findViewById(R.id.radioButton1);
		rb2 = (RadioButton) findViewById(R.id.radioButton2);
		rb3 = (RadioButton) findViewById(R.id.radioButton3);
		tb = (ToggleButton) findViewById(R.id.toggleButton1);
		tvTB = (TextView) findViewById(R.id.tvTB);
		switchBt = (Switch) findViewById(R.id.switch1);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(
						getApplication(),
						"UserName: " + etUser.getText().toString() + "\n"
								+ "Password: " + etPass.getText().toString(),
						Toast.LENGTH_LONG).show();
			}
		});

		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplication(), "CheckBox1 is checked",
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplication(), "CheckBox1 is unchecked",
							Toast.LENGTH_SHORT).show();
				}

			}
		});

		cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplication(), "CheckBox2 is checked",
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplication(), "CheckBox2 is unchecked",
							Toast.LENGTH_SHORT).show();
				}

			}
		});

		rb1.setOnCheckedChangeListener(this);
		rb2.setOnCheckedChangeListener(this);
		rb3.setOnCheckedChangeListener(this);

		tb.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				tvTB.setText("Toggle Button: " + tb.getText().toString());
			}
		});

		tb.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplication(), "Toggle Button is ON",
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplication(), "Toggle Button is OFF",
							Toast.LENGTH_SHORT).show();
				}

			}
		});
		switchBt.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplication(), "Switch is ON",
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplication(), "Switch is OFF",
							Toast.LENGTH_SHORT).show();
				}

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			if ((RadioButton) buttonView == rb1) {
				Toast.makeText(getApplication(), "RadioButton1 is checked!",
						Toast.LENGTH_SHORT).show();
			}
			if ((RadioButton) buttonView == rb2) {
				Toast.makeText(getApplication(), "RadioButton2 is checked!",
						Toast.LENGTH_SHORT).show();
			}
			if ((RadioButton) buttonView == rb3) {
				Toast.makeText(getApplication(), "RadioButton3 is checked!",
						Toast.LENGTH_SHORT).show();
			}
		}
	}

}
