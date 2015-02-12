package com.example.bai4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class RelativeActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relative_layout);
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
		switch (item.getItemId()) {
		case R.id.menu_frame:
			Intent intent1 = new Intent(RelativeActivity.this,
					FrameActivity.class);
			startActivity(intent1);
			finish();
			break;
		case R.id.menu_linear:
			Intent intent2 = new Intent(RelativeActivity.this,
					LinearActivity.class);
			startActivity(intent2);
			finish();
			break;
		case R.id.menu_relative:
			Intent intent3 = new Intent(RelativeActivity.this,
					RelativeActivity.class);
			startActivity(intent3);
			finish();
			break;
		case R.id.menu_table:
			Intent intent4 = new Intent(RelativeActivity.this,
					TableActivity.class);
			startActivity(intent4);
			finish();
			break;
		case R.id.menu_absolute:
			Intent intent5 = new Intent(RelativeActivity.this,
					AbsoluteActivity.class);
			startActivity(intent5);
			finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
