package com.atl.divisions;

import com.atl.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle; 
import android.view.Menu;
import android.view.MenuItem;
import android.app.ActionBar;

public class Engineering extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.engineering);
		overridePendingTransition(R.anim.push_left_in, R.anim.push_up_out);
		ActionBar actionBar;
		actionBar = getActionBar();
		getActionBar().setDisplayHomeAsUpEnabled(true);
		// Change color of ActionBar
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7C9ED9")));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		// Respond to the action bar's Up/Home button
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
}