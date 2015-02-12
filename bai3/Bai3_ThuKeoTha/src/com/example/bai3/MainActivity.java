package com.example.bai3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	Button bt1, bt2, bt3, bt4, bt5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1 = (Button) findViewById(R.id.button1);
		bt2 = (Button) findViewById(R.id.button2);
		bt3 = (Button) findViewById(R.id.button3);
		bt4 = (Button) findViewById(R.id.button4);
		bt5 = (Button) findViewById(R.id.button5);

		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(),
						"Click Button2: Using method setOnClickListener()",
						Toast.LENGTH_SHORT).show();
			}
		});

		bt3.setOnClickListener(this);
		bt4.setOnClickListener(newClick);

		ClickBt clickObject = new ClickBt();
		bt5.setOnClickListener(clickObject);

		bt1.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplication(), "Button1 is held",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		bt2.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplication(), "Button2 is held",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		bt3.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplication(), "Button3 is held",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		bt4.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplication(), "Button4 is held",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		});
		bt5.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplication(), "Button5 is held",
						Toast.LENGTH_SHORT).show();
				return false;
			}
		});

	}

	public void click1(View v) {
		Toast.makeText(getApplication(), "Click Button1: onClick (XML)",
				Toast.LENGTH_SHORT).show();
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
	public void onClick(View v) {
		Toast.makeText(getApplication(),
				"Click Button3: Implements interface OnClickListener",
				Toast.LENGTH_SHORT).show();

	}

	OnClickListener newClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Toast.makeText(getApplication(),
					"Click Button4: An object of class OnClickListener",
					Toast.LENGTH_SHORT).show();
		}
	};

	class ClickBt implements OnClickListener {

		@Override
		public void onClick(View v) {
			if (v == bt5) {
				Toast.makeText(
						getApplication(),
						"Click Button5: Using another class implements OnClickListener",
						Toast.LENGTH_SHORT).show();
			}
		}

	}

}
