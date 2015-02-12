package com.example.bai2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		Button bt = (Button) findViewById(R.id.button1);
		Toast.makeText(getApplication(), "OnCreate", Toast.LENGTH_SHORT).show();
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(), "Back!", Toast.LENGTH_SHORT)
						.show();
				Intent intent = new Intent(SecondActivity.this,
						MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}

	@Override
	public void onBackPressed() {
		Toast.makeText(getApplication(), "Back!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(SecondActivity.this, MainActivity.class);
		startActivity(intent);
		finish();
		super.onBackPressed();
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
