package com.example.bai2;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(getApplication(), "OnCreate", Toast.LENGTH_SHORT).show();
		Button bt = (Button) findViewById(R.id.btClick);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplication(), "Button is clicked!",
						Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this,
						SecondActivity.class);
				startActivity(intent);
				finish();
			}
		});
		bt.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View arg0) {
				Toast.makeText(getApplication(), "Button is clicked and held!",
						Toast.LENGTH_SHORT).show();
				AlertDialog.Builder dialog = new AlertDialog.Builder(
						MainActivity.this);
				dialog.setTitle("Warning!");
				dialog.setMessage("This is a dialog!");
				dialog.setPositiveButton("Ok",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								Toast.makeText(getApplication(),
										"Choosing Ok!", Toast.LENGTH_SHORT)
										.show();
								dialog.dismiss();
							}
						});
				dialog.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								Toast.makeText(getApplication(),
										"Choosing Cancel!",
										Toast.LENGTH_SHORT).show();
								dialog.cancel();
							}
						});
				dialog.create().show();
				return false;
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
	protected void onPause() {
		Toast.makeText(getApplication(), "OnPause", Toast.LENGTH_SHORT).show();
		super.onPause();
	}

	@Override
	protected void onResume() {
		Toast.makeText(getApplication(), "OnResume", Toast.LENGTH_SHORT).show();
		super.onResume();
	}

	@Override
	protected void onStop() {
		Toast.makeText(getApplication(), "OnStop", Toast.LENGTH_SHORT).show();
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Toast.makeText(getApplication(), "OnRestart", Toast.LENGTH_SHORT)
				.show();
		super.onRestart();
	}

	@Override
	protected void onDestroy() {
		Toast.makeText(getApplication(), "OnDestroy", Toast.LENGTH_SHORT)
				.show();
		super.onDestroy();
	}
}
